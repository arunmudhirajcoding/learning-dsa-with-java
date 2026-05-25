import math
import statistics
import scipy 
import numpy as np
import scipy.optimize
a = np.array([1,2,7,3]).reshape(2,2)
print(a)
def f(x):
    return x**2 + 4*x + 5

print(scipy.optimize.minimize(f,0).x)


print(statistics.mode([4,2,5,2,4,3,3,5,5]))
print(statistics.stdev([4,2,5,2,4,3,3,5,5]))
# sum of xi - means / n -1
arr = np.array([[1,2,3],[2,3,4],[2,3,4]])
brr = np.array([[1,2,3],[2,1,4],[2,3,4]])
print(np.dot(arr,brr))
print(np.linalg.det(brr))
print(np.linalg.inv(brr))

print(arr.T)
print(np.array([[1,2,3],[2,3,4]]))
print(math.pi)



