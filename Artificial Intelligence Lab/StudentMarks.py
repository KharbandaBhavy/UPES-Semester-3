# Problem Statement:- The question is provided with the details fo 20 students, which includes name, sap id, subject, marks and percentage.
# We need to get the list of students having percentage more than 80 percent in a text file named topperlist.txt.
# On the basis of several conditions:
# The maximum limit of this list is only 5 students, if any of them has number of subjects as 4 so that student should be removed and list should be decremented.
# Now we can add the students with 5 subjects at the blank places, till the number of the list do not touch 5.

# Code by Bhavy Kharbanda
# Sap Id: 500082531
import pandas as pd
import csv
import numpy as np

# Creating the original data set of 20 students
# containing Sap id, name, semester, subjects, percentage
original_data = {
    'SAP ID': [50008321,50008322,50008323,50008324,50008325,50008326,50008327,50008328,50008329,50008330,50008331,50008332,50008333,50008334,50008335,50008336,50008337,50008338,50008339,50008340],
    'NAME': ['Amit','Sumit','John','Priya','Kunal','Harsh','Garvit','Himanshu','Emma','Prateek','Rahul','Kumar','Bharat','Divy','Divyam','Ansh','Mark','Mike','Piyush','Rose'],
    'SEM': [3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3],
    'MARKS': [465,423,478,464,479,450,489,455,440,439,420,460,410,399,432,444,419,498,458,490],
    'SUB': [4, 4, 5, 5, 5, 5, 4, 4, 4, 5, 4, 4, 5, 5, 4, 4, 4, 5, 5, 5],
    'PERCENTAGE' : [93,74,79,82,94,73,97,77,91,90,80,70.5,84.9,72.6,88,74,71,98.5,90.2,95.8]
}

df = pd.DataFrame(data = original_data)

# Part 1
# It will save the data of students with more than 80 percentage
data = df[df['PERCENTAGE'] > 80]
data.to_csv('C:\\Users\\BHAVY KHARBANDA\\Desktop\\VS CODE Python\\AI\\ topperlist.txt', mode='w')


# Part 2
# It will apply condition on based of subjects of students
df2 = pd.read_csv('C:\\Users\\BHAVY KHARBANDA\\Desktop\\VS CODE Python\\AI\\ topperlist.txt')
updated_data =df2
print("Students having percentage more than 80 *********")
print(updated_data.to_string())
updated_data = df2[df2.SUB > 4]
#print(updated_data.to_string())

# For sorting the data, on the basis of percentage
updated_data = updated_data.sort_values(by = ['PERCENTAGE'], ascending = False)
# print(updated_data.to_string())

# To select top 5 entries and to save it in a text file and an excel file.
final_data = updated_data.head(5)
final_data.to_csv('C:\\Users\\BHAVY KHARBANDA\\Desktop\\VS CODE Python\\AI\\ topperlist.txt', mode='w')

final_data.to_excel('C:\\Users\\BHAVY KHARBANDA\\Desktop\\VS CODE Python\\AI\\ topperlist.xlsx')


# To print the final data of the students 

print('Final data for students -------->')
print(final_data)
