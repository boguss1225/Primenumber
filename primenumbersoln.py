# enter the number 
num=int(input("Enter the prime number: "))
# checks if the number is greater than 1
if num > 1:
    for i in range (2,num):
        #checks the number is prime or not
        if(num % i) == 0:
           print(num,"is not a prime number")
           break
        else:
            print(num, "is prime number")
            break

    while True:
          num += 1
          for i in range (2,num):
             if num %i == 0:
               break
          else:
            print(num," is a prime number")
            break

