# Code by bhavy Kharbanda
# Sap Id:- 500082531
#(p->q) <-> (~q->~p)

import numpy as np
print('Example of Tautology')
p = [True,True,False,False]
q = [True,False,True,False]
print('q:',p)
print('q:',q)
not_q = np.logical_not(q)
not_p = np.logical_not(p)
implication1 = np.logical_or(not_p,q)
print('~p : ' ,not_p)
print('~q : ' ,not_q)
print('')
print('p => q :', implication1)

#Implication p, q means (not p or q) logically
# so, ~q -> ~p means (q or not p)
implication2 = np.logical_or(q,not_p)
print('~q -> ~p :', implication2)

# now we just need to impose biconditional on implication1 and implication2
# Biconditional is equal to negation of xor
xor_operation = np.logical_xor(implication1,implication2)
result = np.logical_not(xor_operation)
print('')
print('Final Result, (p->q)<->(~q->~p) :', result)



