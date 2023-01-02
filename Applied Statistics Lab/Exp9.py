# Lab 9
# Create a random variable and insert 1000 random numbers (population). Plot the distribution. 
# Create 30 samples from the population each of size 10. 
# Compute the mean and finally find the sampling distribution (plot).

# Code by Bhavy Kharbanda
# Sap Id: 500082531

import numpy as np
import random as rm
import matplotlib.pyplot as plt;

# Generating random 1000 numbers as population
population = []
for i in range(1000):
    n = rm.randint(1,1000)
    population.append(n)
print("\nThe population of different areas: ")
print(population)
print("\nMean of this data set: ")
print(np.mean(population))

# Plotting the data
plt.hist(population, bins = 100)
plt.title("Data set of Population from different areas")
plt.show()

# Creating 30 samples of size 100
print("\n 30 samples of size 100: ")
new_data = []
for i in range(30):
    new_data.append(np.random.choice(population, 100))
new_data = np.array(new_data)
print(new_data)

# Plotting the sampling Distribution
x_var = new_data.mean(axis=1)
plt.hist(x_var, bins=30)
plt.title("Sampling Distribution of new data set")
plt.show()


