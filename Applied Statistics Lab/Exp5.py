# Import the z table as a data structure in python.
# Create some 5 demo examples to find the area under the curve and report the answer from the z-table.
# Code by Bhavy Kharbanda
# Sap Id: 500082531

import pandas as pd;

df=pd.read_excel('C:\\Users\\BHAVY KHARBANDA\\Desktop\\VS CODE Python\\Applied Statistics\\Z_Table.xlsx')
print('\n***********  Z Table for Positive Values from 0 to 3.09  **********')
print(df)
print("")

# Five Demo examples that I am creating is:
# 1. Area to the left of 1.35 Z-score.
# 2. Area to the right of 1.45 Z-score.
# 3. Area to the right of 1.67 Z-score.
# 4. Area to the left of 2.54 Z-score.
# 5. Area between 0.56 and 2.33 Z-score. 


df.set_index("Z", inplace = True)
# To find the value at the z-score, 1.35
value1 = df[0.05][1.30] # [column][row]
print("Part 1")
print("The area under the graph to the left of 1.35 is {:4f}".format(value1))

# To find the value at the z-score, 1.45
value2 = df[0.05][1.40] # [column][row]
# We are subtracting it from 1 as it asks for the area right to the z-score.
print("Part 2")
print("The area under the graph to the right of 1.45 is {:4f}".format(1-value2))

# To find the value at the z-score, 1.67
value3 = df[0.07][1.60] # [column][row]
# We are subtracting it from 1 as it asks for the area right to the z-score.
print("Part 3")
print("The area under the graph to the right of 1.67 is {:4f}".format(1-value3))

# To find the value at the z-score, 1.35
value4 = df[0.04][2.50] # [column][row]
print("Part 4")
print("The area under the graph to the left of 2.54 is {:4f}".format(value4))

# To find the value at the z-score between 0.56 and 2.33
v1 = df[0.06][0.50]
v2 = df[0.03][2.30]
print("Part 5")
print("Area under the graph to the left of 0.56 is {:4f}". format(v1))
print("Area under the graph to the left of 2.33 is {:4f}". format(v2))
# We simply subtract the smaller area from the larger area.
print("The area under the graph between 0.56 and 2.33 is : {:4f}\n".format(v2-v1))


