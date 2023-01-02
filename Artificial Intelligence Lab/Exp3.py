# 3. Write a program to implement Tautologies, and Contradiction.
# Code by Bhavy Kharbanda
# Sap Id:- 500082531

# Tautologies: A statement which is always True, example: To derive the truth table for: (p->q)<->(~q->~p)
# Contradiction: A statement which is always false, example: To derive the truth table for: p^~p
import numpy as np
print('\nMy Name is "Bhavy Kharbanda" \nMy SAP Id is "500082531"\n')


print('Example of Tautology : ')
print('Truth Table for (p->q)<->(~q->~p) : ')
p = [True,True,False,False]
q = [True,False,True,False]
print('q:',p)
print('q:',q)
not_q = np.logical_not(q)
not_p = np.logical_not(p)
implication1 = np.logical_or(not_p,q)
print('~p : ' ,not_p)
print('~q : ' ,not_q)
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
print('Final Truth Table for the Statement, (p->q)<->(~q->~p) :', result)
print("All values are True. Hence, It is a Tautology.")


print('\nExample of Contradiction : ')
print('Truth Table for (p ^ ~p) : ')
p = [True, False]
not_p = np.logical_not(p) #For finding negation of p
print('p: ' ,p)
print('~p: ' ,not_p) 
print("")
result = np.logical_and(p,not_p)  # For applying and operator between p and ~p
print('Final Truth Table for the Statement, (p ^ ~p) :', result)
print("All values are False. Hence, It is a Contradiction.\n")