# Wumpus world Problem
# P -> PIT
# B -> BREEZEZ
# W -> WUMPUS(monster)
# A -> AGENT
# S -> STENCH
# G -> GOLD

# Rules:
# Location of agent is fixed to the corners.
# Breeze should be adjacent to the Pits.
# Rest all the things are random.

# 4X4 Grid Formation:

from random import choice

cave_numbers = range(0,5) 
caves = [] 
for i in cave_numbers: 
    caves.append([]) 
for i in cave_numbers: 
    for j in range(3): 
        passage_to = choice(cave_numbers) 
        caves[i].append(passage_to) 
print(caves)

cave_numbers = range(1, 21)
wumpus_location = choice(cave_numbers)
player_location = choice(cave_numbers)
while player_location == wumpus_location:
    player_location = choice(cave_numbers)

print("\nWelcome to Hunt the Wumpus!")
print ("You can see",len(caves),"caves")
print ("To play, just type the number of the cave you wish to enter next")

while True:
    player_input = input("Which cave next? ")
    if (not player_input.isdigit() or int(player_input) not in cave_numbers):
        print(player_input, "is not a cave!")

    print("You are in cave", player_location)
    if (player_location == wumpus_location - 1 or player_location == wumpus_location + 1):
        print ("I smell a wumpus!")
    else:
        player_location = int(player_input)
        if player_location == wumpus_location:
            print("Aargh! You got eaten by a wumpus!")
    break


