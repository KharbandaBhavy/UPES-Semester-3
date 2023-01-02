# Lab 8: 
# Write notes on Markov Chains and Hidden Markov Model. Try to code in python

# Code by Bhavy Kharbanda
# Sap Id: 500082531

import numpy as np
import random as rm

# Three States 
states = ["Sleep","Eat","Class"]

# Transition names and their sequences
transitionName = [["SS","SE","SC"],["ES","EE","EC"],["CS","CE","CC"]]

# Probabilities matrix (transition matrix)
transitionMatrix = [[0.2,0.6,0.2],[0.1,0.6,0.3],[0.2,0.7,0.1]]

# This gives a random set of transitions possible along with the probability of it happening, starting from state: Sleep.
print("\nIf the starting state is Sleep")
choice = int(input("Enter the nth day to know what state it might have: "))

# A function that implements the Markov model to forecast the state/mood.
def activity_forecast(days):
    
    activityToday = "Sleep"
    print("\nStart state: " + activityToday)
   
    activityList = [activityToday]
    i = 0
    
    prob = 1
    while i != days:
        if activityToday == "Sleep":
            change = np.random.choice(transitionName[0],replace=True,p=transitionMatrix[0])
            if change == "SS":
                prob = prob * 0.2
                activityList.append("Sleep")
                pass
            elif change == "SE":
                prob = prob * 0.6
                activityToday = "Eat"
                activityList.append("Eat")
            else:
                prob = prob * 0.2
                activityToday = "Eat"
                activityList.append("Eat")
        elif activityToday == "Class":
            change = np.random.choice(transitionName[1],replace=True,p=transitionMatrix[1])
            if change == "CC":
                prob = prob * 0.5
                activityList.append("Class")
                pass
            elif change == "CS":
                prob = prob * 0.2
                activityToday = "Sleep"
                activityList.append("Sleep")
            else:
                prob = prob * 0.3
                activityToday = "Eat"
                activityList.append("Eat")
        elif activityToday == "Eat":
            change = np.random.choice(transitionName[2],replace=True,p=transitionMatrix[2])
            if change == "EE":
                prob = prob * 0.1
                activityList.append("Eat")
                pass
            elif change == "ES":
                prob = prob * 0.2
                activityToday = "Sleep"
                activityList.append("Sleep")
            else:
                prob = prob * 0.7
                activityToday = "Class"
                activityList.append("Class")
        i += 1  
    print("Possible states: " + str(activityList))
    print("End state after "+ str(days) + " days: " + activityToday)
    print("Probability of this possible sequence: " + str(prob))

activity_forecast(choice)
