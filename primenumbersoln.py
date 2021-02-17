print("This programe is for print Prime number (1,2,3,5,7,11,13,17...) of certain order\n please insert an number:")
primenumber = [1,2,3,5,7]
n = int(input())

if n > 1:
    for i in range (2,n):
      #  print(n, "is prime ")
        if (n % i) == 0:
            print(n,"is not a prime number")
            break
    else:
            print(n) 
