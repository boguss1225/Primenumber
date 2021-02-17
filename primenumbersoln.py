print("This programe is for print Prime number (1,2,3,5,7,11,13,17...) of certain order\n please insert an number:")
primenumber = [1,2,3,5,7]
n = int(input())

if n > 1:
    for i in range (2,n):
      #  print(n, "is prime ")
        while (n % i) == 0:
           # print(n,"is not a prime number")
            n += 1
           # print(n)
            
    else:
            print(n,"is prime number") 
