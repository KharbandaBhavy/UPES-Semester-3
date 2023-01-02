# Code by bhavy Kharbanda
# Sap Id:- 500082531
# (~q->~p)

import numpy as np

p = [True,True,False,False]
q = [True,False,True,False]
print('q:',p)
print('q:',q)
not_q = np.logical_not(q)
not_p = np.logical_not(p)
print('~p : ' ,not_p)
print('~q : ' ,not_q)
#Implication p, q means (not p or q) logically
# so, ~q -> ~p means (q or not p)
implication2 = np.logical_or(q,not_p)
print('~q -> ~p :', implication2)





