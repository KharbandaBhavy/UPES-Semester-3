# In Lab 1 we discussed a dataset having variables 'Marks' and 'CGPI'. 
# Plot both of them as two different axes. 
# Discuss the covariance and correlation coefficient.

# Code by Bhavy Kharbanda
# Sap Id: 500082531

import pandas as pd;
import matplotlib.pyplot as plt;
import numpy as np;

# For Reading the data from python file
text=pd.read_excel('C:\\Users\\BHAVY KHARBANDA\\Desktop\\VS CODE Python\\Applied Statistics\\Demo2.xlsx')
print("\n*****   Original Data Set   *****")
print(text)

# Selected columns from the data set
data = text[['Marks', 'CGPI']]
print("\nSelected Data that is Marks and CGPI :")
print(data)
# To plot them on the graph in the form of points
text.plot(kind='scatter',x='Marks',y='CGPI',color='blue')
plt.title("Scattered Points for Marks and Cgpi")
plt.show()

# To plot them on the graph in the form of lines
ax = plt.gca()
text.plot(kind='line',x='Name',y='Marks',color='blue', ax=ax)
text.plot(kind='line',x='Name',y='CGPI', color='red', ax=ax)
plt.title("Lined plot for Marks and Cgpi")
plt.show()



