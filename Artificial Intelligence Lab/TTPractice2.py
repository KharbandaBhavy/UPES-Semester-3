# Code by bhavy Kharbanda
# Sap Id:- 500082531
# (p->q) and (q->p) != (p->q)

import numpy as np

p = [True,True,False,False]
q = [True,False,True,False]
print('q:',p)
print('q:',q)
not_q = np.logical_not(q)
not_p = np.logical_not(p)
implication1 = np.logical_or(not_q,p) #Implication p, q means (not p or q) logically
print('q => p :', implication1)

implication2 = np.logical_or(not_p,q) 
print('p => q :', implication2)

result = np.logical_and(implication1,implication2)
print('(p->q) and (q->p) : ', result)



    