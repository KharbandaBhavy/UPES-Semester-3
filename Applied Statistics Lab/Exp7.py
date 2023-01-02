# Lab:7 Observe the dataset: https://www.kaggle.com/subhashinimariappan/numerical-dataset. 
# Compute all the statistical measures learnt till the last class: central tendency, dispersion, covariance, correlation.
# Find equation of a straight line for all comb. where r>0.6

# Code by Bhavy Kharbanda
# Sap Id: 500082531

import pandas as pd;
import numpy as np;
from scipy.stats import pearsonr

data_set=pd.read_csv('C:\\Users\\BHAVY KHARBANDA\\Desktop\\VS CODE Python\\Applied Statistics\\Data.csv')
print("\n*****   Original Data Set   *****")
print(data_set)
column = input("\nEnter the name of column to proceed further :")
new_data = data_set[column]

print("\n*** Details for the column : "+column+" ***")
print("\n*** Measures of Central Tendency ***")
Mean = new_data.mean()
print("Calculated Mean of the selected column:", Mean)
Mode = new_data.mode()
print("Calculated Mode of the selected column:", Mode)
Median = new_data.median()
print("Calculated Median of the selected column:", Median)

print("\n*** Measures of Dispersion ***")
sd = np.std(new_data)
print("Calculated Standard Deviation of the selected column:", sd)
var = np.var(new_data)
print("Calculated variance of the selected column: ", var)

column2 = input("\nEnter the name of another column for finding covariance :")
new_data2 = data_set[column2]
print("\nCovariance matrix for columns: "+column+" and "+column2+" :") 
print(np.cov(new_data,new_data2))

corr, _ = pearsonr(new_data,new_data2)
print("Correlation for columns: "+column+" and "+column2+" :")
print(corr) 



