# Code by Bhavy Kharbanda
# Sap Id: 500082531

# The assignment contains a file. Read the file as a data frame in python. List the type of data that each column represents. Finally, use the proper measure of central tendency for each. What do you think of the missing value?

import pandas as pd;
import matplotlib.pyplot as plt;
import numpy as np;

# For Reading the data from python file
text=pd.read_excel('C:\\Users\\BHAVY KHARBANDA\\Desktop\\VS CODE Python\\Applied Statistics\\Demo.xlsx')
data_type=["Nominal","Ratio","Interval","Ordinal","Ordinal"]

# Finding Central Tendency for Name of Student
name=text["Name"].mode()
print("Name is of Nominal data type")
print("Central tendency of name (Mode) is:",name)

text[['Marks']].plot(kind='hist',bins=[0,20,40,60,80,100],rwidth=0.7)
marks=text["Marks"].mean()
print("Marks is of Ratio data type")
print("Central tendency of marks (Mean) is:",marks)

text[['CGPI']].plot(kind='hist',bins=[0,2,4,6,8,10],rwidth=0.7)
plt.show()
cgpi=text["CGPI"].median()
print("Cgpi is of Ratio data type")
print("Central tendency of cgpi (Median) is:",cgpi)

quality={"Great":1,"Good":2,"Average":3,"Poor":4}
text["Qual"]=np.where(text["Quality of Assignment"]=="Great",1,np.where(text["Quality of Assignment"]=="Good",2,np.where(text["Quality of Assignment"]=="Average",3,np.where(text["Quality of Assignment"]=="Poor",4,5))))
quality=text["Qual"].median()
print("Central tendency of qual is (ordinal) median :",quality)

# For filling the missing value
cgpi_mean=text["CGPI"].mean()
cgpi_mean = round(cgpi_mean,2)
print("Hence the Missing Value is:",cgpi_mean)
text["CGPI"].fillna(value=cgpi_mean,inplace=True)
text.loc[len(text.index)]=data_type
print(text)



