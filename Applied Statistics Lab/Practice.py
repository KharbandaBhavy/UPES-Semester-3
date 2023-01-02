# Code by Bhavy Kharbanda
# Sap Id: 500082531

import numpy as np;
import random as random;
import matplotlib.pyplot as plt;

data_set = []
num = int(input("Enter value of numbers to be generated: "))

text = [random.normalvariate(64.5,3.3) for x in range(num)]
data_set.append(text)

print("********Generated Data Set*******")    
print(data_set)
print('')

Mean = np.mean(data_set)
round_mean = round(Mean, 1)
print("Calculated Mean of the data set:", round_mean)
sd = np.std(data_set)
round_std = round(sd, 1)
print("Calculated Standard Deviation of the data set:", round_std)
print('')
data_set = [np.round(num) for num in data_set]
print("New : ", data_set)

a = 0
print("\n New Data set")
for item in data_set:
    if any(item<60):
        a = a+1

print("Number of data less than 60: ", a)
