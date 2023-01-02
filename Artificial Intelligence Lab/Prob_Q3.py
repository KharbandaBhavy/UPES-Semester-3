# 3. Find probability of getting a numbered card when a card is drawn from pack of 52 words.
# Code by Bhavy Kharbanda
# Sap Id:- 500082531
from itertools import product
print('\nMy Name is "Bhavy Kharbanda" \nMy SAP Id is "500082531"\n')

def prob(x):
    return len(x)/len(sample)

sample = list(product([2,3,4,5,6,7,8,9,10,'J','Q','K','A'], ['D', 'H', 'C','S']))
sample2 = list(product([2,3,4,5,6,7,8,9,10,'J','Q','K','A'], ['D', 'H', 'C','S']))
print("Sample Space for deck of cards : ", sample)
# D - Diamond, H - Heart, C - Club, S - Spade
print(len(sample))
a = {om for om in sample if om[1]==2}
print('Probability of getting a numbered card :', prob(a))

