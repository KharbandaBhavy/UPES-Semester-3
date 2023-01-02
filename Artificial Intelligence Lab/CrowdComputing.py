# Code by Bhavy Kharbanda
# Sap Id: 500082531

import pandas as pd
import math
import statistics

data = pd.read_excel('C:\\Users\\BHAVY KHARBANDA\\Desktop\\VS CODE Python\\Artificial Intelligence\\crowd computing.xlsx')
New_list = list(data['Person Values'])

New_list2 = list(data['Person Values'])
actual_candies = 375
print('******Original Data******')
print('')
print(New_list)
print('')
print("Length of Original List",len(New_list))
New_list.sort()
print('')
print('******Sorted List******')
print(New_list)
print('')
Mean = statistics.mean(New_list)
print(f"Original Mean is: {Mean}")
diff1 = Mean-actual_candies
Median = statistics.median(New_list)
print("Original Median is: {:2f}".format(Median))
diff2 = Median-actual_candies
Mode = statistics.mode(New_list)
print("Original Median is: {:2f}".format(Mode))
diff3 = Mode-actual_candies

# For trimming the mean
trim = math.floor(len(New_list)*0.1)
print("Value of Trim: ",trim)
trim_list = New_list[trim:len(New_list)-trim]
print('')
print("******Trimmed List******")
print(trim_list)
print('')
print('Length of Trimmed list: ',len(trim_list))
print('')
Trimmean = statistics.mean(trim_list)
print("Trim Mean is: {:2f}".format(Trimmean))
diff1 = actual_candies - Trimmean
Trimmedian = statistics.median(trim_list)
print("Trim Median is: {:2f}".format(Trimmedian))
diff2 = actual_candies - Trimmedian
Trimmode = statistics.mode(trim_list)
print("Trim Mode is: {:2f}".format(Trimmode))
diff3 = actual_candies - Trimmode
print('')
print("Difference between trimmed Mean and Original Mean: ", Mean-Trimmean)
print("Trim Mean is: {:2f}".format(Trimmean))

'''def award(New_list2, Trimmean):
    New_list = New_list2[min(range(len(New_list2)), key = lambda i: abs(New_list2[i]-Trimmean))]
    New_list2 = New_list2 - New_list
    
award(New_list2, Trimmean)
award(New_list2, Trimmean)
award(New_list2, Trimmean)
print(New_list)

'''

