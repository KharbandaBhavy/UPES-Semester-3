# 2. Three dice are rolled together, what is the probability of getting at least one 4.
# Code by Bhavy Kharbanda
# Sap Id:- 500082531
from itertools import product
print('\nMy Name is "Bhavy Kharbanda" \nMy SAP Id is "500082531"\n')

def prob(x):
    return len(x)/len(sample)


n = 3
sample = set(product([1, 2, 3, 4, 5, 6], repeat=n))
print('\nSample Space for 3 dice = ', sample)
c = {om for om in sample if om.count(4) >= 1}

print('Probability of getting at least one 4 :', prob(c))