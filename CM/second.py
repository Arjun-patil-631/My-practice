import numpy as np
import matplotlib.pyplot as plt

B=input("Enter the matix A: ")
A=np.asmatrix(B)
ev1, ev2=np.linalg.eig(A)
print("The eigen values are:", ev1.real)
print("The eigen vectors are:", ev2.real)

plt.figure()
plt.axhline()
plt.axvline()
plt.xlim(-3,3)
plt.ylim(-3,3)
plt.gca().set_aspect('equal')

plt.quiver(0, 0, ev2[0,0], ev2[1,0], angles='xy', scale_units='xy', scale=1)
plt.quiver(0, 0, ev2[0,1], ev2[1,1], angles='xy', scale_units='xy', scale=1)
plt.title("Eigen Vectors of the given matrix")
plt.xlabel("x-axis")
plt.ylabel("y-axis")
plt.show()

