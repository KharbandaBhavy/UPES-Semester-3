# 6. Write a program to solve the Travelling Salesperson algorithm for a real-world problem.
# Code by Bhavy Kharbanda
# Sap Id:- 500082531

print("\nMy Name is : Bhavy Kharbanda. \nMy SAP ID is : 500082531\n")
print("I am going to implement Travelling Salesperson Algorithm.\n")

# Travelling salesperson problem for 3 Nodes
from itertools import permutations

# Eucledian distance taken up here
def distance(d1, d2):
    return ((d1[0] - d2[0])**2 + (d1[1] - d2[1])**2) ** 0.5

# function for salesman approach
def traveling_salesman(points, start=None):  
    if start is None:
        start = points[0]
    return min([perm for perm in permutations(points) if perm[0] == start], key=total_distance)

# function for calculating shortest distance
def total_distance(points):  
    return sum([distance(point, points[index + 1]) for index, point in enumerate(points[:-1])])


def main():
    points = [[1, 2], [40, 50], [25, 38]]
    points = points[:3]
    result = traveling_salesman(points)
    distance_result = total_distance(result)

    print("""
The path provided is {0}\nFrom starting {1} distance is {2} path followed {3}
        """.format(
            points,
            points[0],
            distance_result,
            result
        )
    )


if __name__ == "__main__":
    main() 