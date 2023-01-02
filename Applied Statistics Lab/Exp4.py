# Create a dataset of a single variable comprising of only numerical values. 
# Create a Normal distribution for it. Convert it to Z distribution and plot both of the distribution.
# Code by Bhavy Kharbanda
# Sap Id: 500082531

import numpy as np;
import random as random;
import matplotlib.pyplot as plt;


data_set = []
size = int(input("Enter value of numbers to be generated: "))
# For Creating dataset of single variable and making it's Normal distribution.
mean = 100.00
scale = 2
data_set = np.random.normal(mean, scale, size)
data_set = [np.round(num, 3) for num in data_set]
#print("***** Generated Data set ***** ", data_set)        
plt.hist(data_set)
plt.title('Normal Distribution Graph with Mean = 100 and sd = 2', fontweight = "bold")
plt.show()

Mean = round(np.mean(data_set), 2)
print("Mean of the generated Data set", Mean)
sd = round(np.std(data_set),2)
print("Standard deviation of the generated Data set", sd)
# For calculating z score:
z=[]
z = [(data_set-Mean)/sd ]
z = [np.round(num, 2) for num in z]
print("\nZ Scores of this Data: ", z)
#Conversion of Normal Distribution to Z-Distribution. Mean is 0 and Standard Deviation is 1.

plt.hist(z)
plt.title('Z or Standard Normal Distribution Graph', fontweight = "bold")
plt.show()
Mean = round(np.mean(z))
print("\nMean of the Z - Distribution Data set :", Mean)
sd = round(np.std(z))
print("Standard deviation of Z - Distribution Data set :", sd)
print("")


