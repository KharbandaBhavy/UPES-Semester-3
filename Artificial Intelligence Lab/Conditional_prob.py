from itertools import product
new = list(product([1, 2, 3], ['a', 'b', 'c']))
print("List : ", new)
n = 2
omega = set(product(['H', 'T'], repeat=n))
print('omega = ', omega)
print('Length : ', len(omega))

n = 3
omega = set(product(['H', 'T'], repeat=n))
print('omega = ', omega)
print('Length : ', len(omega))

a = {om for om in omega if om[1] == 'T'}
b = {om for om in omega if om.count('T') == 2}
print('a = ', a)
print('b = ', b)


def prob(x):
    return len(x)/len(omega)


def cond_prob(x, y):
    return len(x & y) / len(y)


print('Probability of a :', prob(a))
print('Probability of b :', prob(b))
print('Probability of a&b :', prob(a & b))
print('Conditional Probability of a and b :', cond_prob(a, b))
print('Product of Probability of a and b :', prob(a)*prob(b))


def are_indep(x, y):
    return prob(x & y) == prob(x)*prob(y)


print('a and b are independent :', are_indep(a, b))

c = {om for om in omega if om[1] == 'H'}
print('Probability of a :', prob(c))
print('Probability of a&c :', prob(a & c))
print('a and c are independent :', are_indep(a, c))
