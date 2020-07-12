import sys

def collatz(number):
    if number % 2 == 0:
        print(str(number // 2))
        return (number // 2)
    else:
        print(str(3 * number + 1))
        return (3 * number + 1)
try:
    while True:
        try:
            print("Type in an integer.")
            numInput = int(input())
            while numInput != 1:
                numInput = collatz(numInput)
        except ValueError:
            print("You must enter an integer.")
except KeyboardInterrupt:
    sys.exit()