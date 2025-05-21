import pygame
import numpy as np
import threading
import time

# Constants
WIDTH, HEIGHT = 800, 600
CELL_SIZE = 10
ROWS, COLS = HEIGHT // CELL_SIZE, WIDTH // CELL_SIZE
BLACK, WHITE = (0, 0, 0), (255, 255, 255)

# Function to initialize the grid with random values
def initialize_grid():
    return np.random.choice([0, 1], size=(ROWS, COLS))

# Function to update the grid based on Conway's rules
def update_grid(grid, lock):
    while True:
        time.sleep(0.00001)  # Adjust the speed of the simulation
        new_grid = grid.copy()
        for i in range(1, ROWS - 1):
            for j in range(1, COLS - 1):
                total_neighbors = np.sum(grid[i - 1 : i + 2, j - 1 : j + 2]) - grid[i, j]
                if grid[i, j] == 1 and (total_neighbors < 2 or total_neighbors > 3):
                    new_grid[i, j] = 0
                elif grid[i, j] == 0 and total_neighbors == 3:
                    new_grid[i, j] = 1
        with lock:
            grid[:] = new_grid

# Function to draw the grid on the screen
def draw_grid(screen, grid, lock):
    while True:
        with lock:
            screen.fill(BLACK)
            for i in range(ROWS):
                for j in range(COLS):
                    color = WHITE if grid[i, j] == 1 else BLACK
                    pygame.draw.rect(screen, color, (j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE))
        pygame.display.flip()

# Main function
def main():
    pygame.init()
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    pygame.display.set_caption("Conway's Game of Life")

    lock = threading.Lock()

    grid = initialize_grid()

    update_thread = threading.Thread(target=update_grid, args=(grid, lock))
    draw_thread = threading.Thread(target=draw_grid, args=(screen, grid, lock))

    update_thread.start()
    draw_thread.start()

    running = True
    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False

    pygame.quit()

if __name__ == "__main__":
    main()