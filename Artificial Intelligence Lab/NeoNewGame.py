# Problem statement:- Take a number from user and print range from 1 to that number, and print them.
# Also print 'NEO' if the number is a multiple of 3 and print 'NEW' if the number is a multiple of 5.
# Print 'NEONEW' if it is a multiple of both 3 and 5.

# Code by Bhavy Kharbanda
# Sap Id: 500082531

# My Method: Method 1
Start_Limit = int(input("Enter the lower limit : "))
Stop_Limit = int(input("Enter the upper limit : "))
if Start_Limit > Stop_Limit:
    print("I can't handle this case")

for x in range(Start_Limit, Stop_Limit+1):
    if (x % 3 == 0 and x % 5 == 0):
        message = f'{x} : NEONEW'
        print(message)
    elif (x % 3 == 0):
        message = f'{x} : NEO'
        print(message)
    elif (x % 5 == 0):
        message = f'{x} : NEW'
        print(message)
    else:
        print(x)


# Professor's Method: Method 2
def newneo_game(lower, upper):

    if lower < upper:
        for i in range(lower, upper+1):

            addstring = ""

            if i % 3 == 0:

                addstring = "= Neo"

            if i % 5 == 0:

                addstring = addstring+"New"

            elif i % 5 == 0:

                addstring = "= New"
            print(i, addstring)


lower = int(input("Enter starting range : "))
upper = int(input("Enter upper range : "))
newneo_game(lower, upper)
