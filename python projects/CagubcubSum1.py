import threading

#The Function that is instantiated inside the thread
def printNum(num, amountDesired):
    for i in range(amountDesired):
        num += 1
        print(num)
#Variables that are passed into the thread, as well as used by the main project to count the amount of threads instantiated  
amountDesired = 10
num = 0
threadsNeeded = 4
#The main method that is initializing the threads and applying the values to them
def startPrint():
    threadArray = []
    for i in range(threadsNeeded):
        print(f"Thread {i+1}")
        t1 = threading.Thread(target=printNum,args=(num, amountDesired))
        threadArray.append(t1)
        t1.start()
        print("")
        
    for thread in threadArray:
        t1.join()
    
if __name__ == '__main__':
    startPrint()