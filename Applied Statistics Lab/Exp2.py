# Code by Bhavy Kharbanda
# Sap Id: 500082531
# The assignment contains a file. Read the file as a data frame in python. Find the range, standard deviation and variance for each of the variables. (Discuss measures of dispersion for Nominal and Ordinal Data)

import pandas as pd;
import numpy as np;

# For Reading the data from python file
text=pd.read_excel('C:\\Users\\BHAVY KHARBANDA\\Desktop\\VS CODE Python\\Applied Statistics\\Demo2.xlsx')
print('*************Original Data Set**********')
print(text)
# For converting data to list
Name_list = list(text['Name'])
print('Names in the data set: ',Name_list)
Marks_list = list(text['Marks'])
print('Marks in the data set: ',Marks_list)
Cgpi_list = list(text['CGPI'])
print('Cgpi in the data set: ',Cgpi_list)
Quality_list = list(text['Quality of Assignment'])
print('Quality of assignments: ',Quality_list)

# for finding Parameters of marks
# Range
min_marks = min(Marks_list)
max_marks = max(Marks_list)
range = max_marks - min_marks
print(f'Range for marks goes from {min_marks} to {max_marks}')
print('Range of Marks is: ', range)
# Variance
variance_marks = np.var(Marks_list)
print('Variance for Marks is:', variance_marks)
# Standard Deviation
sd_marks = np.std(Marks_list)
print('Standard deviation for Marks is:', sd_marks)

# for finding Parameters of cgpi
# Range
min_cgpi = min(Cgpi_list)
max_cgpi = max(Cgpi_list)
range = max_cgpi - min_cgpi
print(f'Range of CGPI goes from {min_cgpi} to {max_cgpi}')
print('Range of CGPI is: ', range)
# Variance
variance_cgpi = np.var(Cgpi_list)
print('Variance for CGPI is:', variance_cgpi)
# Standard Deviation
sd_cgpi = np.std(Cgpi_list)
print('Standard deviation for CGPI is:', sd_cgpi)






