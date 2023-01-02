# 1) Generate a random sample with mean = 5, standard_deviation = 2. 
# 2) Plot the distribution. 
# 3) Give the summary statistics.
# Code by Bhavy Kharbanda
# Sap Id: 500082531

import numpy as np;
import random as random;
import matplotlib.pyplot as plt;

data_set = []
num = int(input("Enter value of numbers to be generated: "))

text = [random.normalvariate(5.00,2.00) for x in range(num)]
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
data_set = [np.round(num, 3) for num in data_set]
print("Rounded off data set: ", data_set)
plt.hist(data_set)
plt.show()


