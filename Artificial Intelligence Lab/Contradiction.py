# Code by bhavy Kharbanda
# Sap Id:- 500082531
# Contradiction: A statement which is always false, example:
# To derive the truth table for:p^~p

import numpy as np
p = [True, False]
not_p = np.logical_not(p) #For finding negation of p
print('p: ' ,p)
print('~p: ' ,not_p) 

result = np.logical_and(p,not_p)  # For applying and operator between p and ~p
print('(p ^ ~p) :', result)

