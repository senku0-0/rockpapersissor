import random as r # randome is used to generate random values 

print("Who you want to play with????")
print("1.Computer \n2.People")
play = int(input("Enter your Choice in number: "))
# rules of the games are mentioned this way it will be fair and fun to paly without cheating 
print("Rules:\nRock beats --> Scissor beats --> Paper beats --> Rock")
print("Pick your choice: ")
print("\n1.Rock\n2.Scissor\n3.Paper\n\n")
# game with computer
if(play == 1):
    comp = r.randint(1,3)
    user = int(input("Enter your value: \n")) #input default data type is string type casting it into int
    print(f"Computer picked= {comp}, you picked ={user}")
    if(comp == user):
        print("It's tie dam")
    elif(comp == 1 and user == 2):
        print("Computer wins!!!")
    elif(comp == 2 and user == 3):
        print("Computer wins!!!")
    elif(comp == 3 and user == 1):
        print("Computer wins!!!")
    elif(comp == 2 and user == 1):
        print("You win!!!")
    elif(comp == 3 and user == 2):
        print("You win!!!")
    elif(comp == 1 and user == 3):
        print("You win!!!")
    else:
        print("Enter valid input")
# game between two people
elif(play==2):
    print("Only tow people can play at once")
    p1 = int(input("Enter your choice Player 1: "))
    p2 = int(input("Enter your choice Player 2"))
    if(p1 == p2):
        print("Dam it's a tie man!!")
    elif(p1 == 1 and p2 == 2):
        print("Player 1 wins this around!!!")
    elif(p1 == 1 and p2 == 3):
        print("Player 2 wins this around!!!")
    elif(p1 == 2 and p2 == 3):
        print("Player 1 wins this around!!!")
    elif(p1 == 2 and p2 == 1):
        print("Player 2 wins this around!!!")
    elif(p1 == 3 and p2 == 1):
        print("Player 1 wins this around!!!")
    elif(p1 == 3 and p2 == 2):
        print("Player 2 wins this around!!!")
    else:
        print("Enter valid input")
else:
    print("Enter valid input")