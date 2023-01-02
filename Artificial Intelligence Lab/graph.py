# Code by Bhavy Kharbanda
# Sap Id:- 500082531

print('\nMy Name is "Bhavy Kharbanda" \nMy SAP Id is "500082531"')

import matplotlib.pyplot as plot

x_var = [0,1,2,3,4,5,6,7,8,9]
y_var = [1,3,2,5,7,8,8,9,10,12]

plot.scatter(x_var, y_var)

plot.title('Linear Regression Example')
plot.xlabel('Features')
plot.ylabel('Responses')

plot.show()

