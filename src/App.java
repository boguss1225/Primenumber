import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Get target input
        Scanner sc = new Scanner(System.in);
        int targetNumb=1;
        
        while(targetNumb!=0){
            // classify early stage numbers
            System.out.println("please insert any number (or 0 to exit): ");
            targetNumb = sc.nextInt();

            switch(targetNumb){
                case 0 : System.out.println("exit the program");
                        break;
                case 1 : System.out.println("1 is not prime number");
                        break;
                case 2 : System.out.println("2 is 1st prime number");
                        break;
                case 3 : System.out.println("3 is 2nd prime number");
                        break;
                case 4 : System.out.println("4 is not prime number");
                        break;
                case 5 : System.out.println("5 is 3rd prime number");
                        break;        
                default : getPrimeNumbworder(targetNumb);
                        break;
            }
        }

		//changes made
        sc.close();
    }

    public static void getPrimeNumb(int num){
        boolean result=true;

        //initial screening for speed excelation
        if(num%2 == 0 || num%3 == 0 || num%5 == 0 || num%7 == 0){ 
            result=false;
        }else{
            //from 5, Decide whether it is prime number or not.
            for(int i= 5; i*i < num; i+=2){ //iterate every odd number
                //System.out.println(i + " is testing...");
                if(num%i == 0){ // if it can be devided by any under number
                    result = false; // it is not prime number.
                    i=num+1;//escape
                }
            }
        }

        if(result){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }         
    }

    //display prime number with the order.
    public static void getPrimeNumbworder(int num){
        
        // define array to identify wheterh the number is primenumber or not
        boolean primecheck[] = new boolean[num +1]; //prime number checker
        int primenumbers[] = new int[(num/2)+1]; //list of identified primenumbers

        // fill all check array to true.
        for(int i = 1; i < num+1; i++){
            primecheck[i] = true;
        }

        // set initial primenubers
        primenumbers[0]=2;
        primenumbers[1]=3;
        int listnumb =2;

        // from 5, Decide whether it is prime number or not.
        for(int i= 5; i*i < num; i+=2){ //iterate every odd number
            for (int j = 0 ; j < listnumb ; j++){ //check with identified prime numbers
                if(i % primenumbers[j] == 0){ //i is not prime number
                    //make the checker to false
                    primecheck[i] = false;
                    //escape out to next i
                    j = listnumb;
                }
            }

            if(primecheck[i]){
                //add to the list of identified prime number.
                primenumbers[listnumb]=i;
                listnumb++;
            }
        }

        if(primecheck[num]){
            //[To Do] st, nd, rd , and th e.g. 11,23,512 should be 11st, 23rd, 512nd 
            System.out.println(num + " is " + (listnumb) + "th prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }       
    }
}