# 1. A coin is thrown three times, what is the probability that atleast one head is obtained.
# Code by Bhavy Kharbanda
# Sap Id:- 500082531
from itertools import product
print('\nMy Name is "Bhavy Kharbanda" \nMy SAP Id is "500082531"\n')

def prob(x):
    return len(x)/len(sample)
    

n = 3
sample = set(product(['H', 'T'], repeat=n))
print('Sample Space = ', sample)
a = {om for om in sample if om.count('H') >= 1}

print('Probability of having atleast one Head :', prob(a))



