import pygame
import random
import threading

pygame.init()

BLACK = (80, 80, 80)
GREY = (20, 20, 20)
YELLOW = (255, 255, 150)

WIDTH, HEIGHT = 800, 800
TILE_SIZE = 15
GRID_WIDTH = WIDTH // TILE_SIZE
GRID_HEIGHT = HEIGHT // TILE_SIZE
FPS = 10

screen = pygame.display.set_mode((WIDTH, HEIGHT))

clock = pygame.time.Clock()
#initializes the initial generation
def gen(num):
    return set([(random.randrange(0, GRID_HEIGHT), random.randrange(0, GRID_WIDTH)) for _ in range(num)])
#this draws the initial grid the conway's game of life is on
def draw_grid(positions):
    for position in positions:
        col, row = position
        top_left = (col * TILE_SIZE, row * TILE_SIZE)
        pygame.draw.rect(screen, YELLOW, (*top_left, TILE_SIZE, TILE_SIZE))

    for row in range(GRID_HEIGHT):
        pygame.draw.line(screen, BLACK, (0, row * TILE_SIZE), (WIDTH, row * TILE_SIZE))

    for col in range(GRID_WIDTH):
        pygame.draw.line(screen, BLACK, (col * TILE_SIZE, 0), (col * TILE_SIZE, HEIGHT))
#This updates the grid with the position of the spawned squares define in the positions variable, returns new position
def adjust_grid(positions):
    all_neighbors = set()
    new_positions = set()

    for position in positions:
        neighbors = get_neighbors(position)
        all_neighbors.update(neighbors)

        neighbors = list(filter(lambda x: x in positions, neighbors))

        if len(neighbors) in [2, 3]:
            new_positions.add(position)
    
    for position in all_neighbors:
        neighbors = get_neighbors(position)
        neighbors = list(filter(lambda x: x in positions, neighbors))

        if len(neighbors) == 3:
            new_positions.add(position)
    
    return new_positions
#this method detects the amount of neighbors surrounding a cell, returns neighbor count
def get_neighbors(pos):
    x, y = pos
    neighbors = []
    for dx in [-1, 0, 1]:
        if x + dx < 0 or x + dx > GRID_WIDTH:
            continue
        for dy in [-1, 0, 1]:
            if y + dy < 0 or y + dy > GRID_HEIGHT:
                continue
            if dx == 0 and dy == 0:
                continue

            neighbors.append((x + dx, y + dy))
    return neighbors
#this is the method that instantiates the game processes on threads
def play_game(positions):
    running = True
    while running:
        clock.tick(FPS)

        positions = adjust_grid(positions)

        screen.fill(GREY)
        grid_display = threading.Thread(target=draw_grid, args=(positions,))
        grid_display.start()
        #draw_grid(positions)
        pygame.display.update()

        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                grid_display.join()
                running = False
#this is the main method that calls the game and instantiates all the variables that is required
if __name__ == "__main__":
    positions = gen(random.randrange(30, 40) * GRID_WIDTH)
    #play_game(positions)
    game_process = threading.Thread(target=play_game, args=(positions,))
    game_process.start()

    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                game_process.join()
                exit()