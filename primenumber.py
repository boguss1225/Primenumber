print("This programe is for print Prime number (1,2,3,5,7,11,13,17...) of certain order\n please insert an number:")
primenumber = [1,2,3,5,7]

#What number you looking for?
n = input()

#just for debuge
count = 1
for i in primenumber:
    print(count+": "+i)

# expected input and output
# input     output
#   1          1
#   2          2
#   3          3
#   4          5
#   5          7
#   6          11
#   7          13

