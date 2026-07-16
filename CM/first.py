import numpy as np

# the first method is:
'''
A=np.array([[1,4,3],[2,3,1],[1,2,3]])
if A.shape[0]==A.shape[1]:
    print("The given matrix is square")
    ev=np.linalg.eigvals(A)
    print("The eigen values are:", ev)
    print("The order of the matrix is:", A.shape)
else:
    print("The given matrix is not square")
    print("The order of the matrix is:", A.shape)
'''

#the  second method is:
'''
A=np.asmatrix("-9 4  4;-8 3 4;-16 8 7")
if A.shape[0]==A.shape[1]:
    print("The matrix is a square matrix")
    ev=np.linalg.eigvals(A)
    print("The eigen values are:", ev)
    print("The order of the matrix is:", A.shape)
else:
    print("The given matrix is not square")
    print("The order of the matrix is:", A.shape)
'''

#the third method is by giving elements on the output console:
'''
B=input("Enter the elements of matrix :")
A=np.asmatrix(B)
if A.shape[0]==A.shape[1]:
    print("The matrix is a square matrix")
    ev=np.linalg.eigvals(A)
    print("The eigen values are:", ev)
    print("The order of the matrix is:", A.shape)
else:
    print("The given matrix is not square")
    print("The order of the matrix is:", A.shape)
'''

# practice sums:

B=np.asmatrix("1 -2; 1 3")
if B.shape[0]==B.shape[1]:
    print("The matrix is a square matrix")
    ev=np.linalg.eigvals(B)
    print("The eigen values are:", ev)
    print("The order of the matrix is:", B.shape)
else:
    print("The given matrix is not square")
    print("The order of the matrix is:", B.shape)






