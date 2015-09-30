

package zimmerman_3_primes;

public class Zimmerman_3_Primes {
//static makes the program stay the same.
         
     
    public static void main(String[] args) {
    int x = 0;
        for(int i=0; i<100; i++){
            isEven(i);
         
    }
}
 
    

    static boolean isEven(int number){
        return (number % 2 == 0);
    }
         static boolean isOdd(int number){
        return (number % 2 != 0);
         }   
     static boolean isPrime(int number){
        boolean prime = true;
        int divisors = 0; 
        for(int i=2; i < number/2; i++){
            if(number % 1 == 0);{
            prime = false;}
            
            
        }
return prime;     }
}
        
        
            
           
         
       
    

    








/*if(i % 2==0){
        System.out.println(i + " is even");
        x = x + 1;
        System.out.println("there are "+ x +" even numbers");
      */ 

//     for(int i=0; i<101; i++){
//         if(i % 3 != 0){
//             if(i % 5 != 0){
//         }
//             
//             } 

   //A return value is the type of
        //value you are giving back to the program

/*What is a method?
A method is a function 
A method is like a little program that communicates with outher parts of the 
program by returning the values
A method is like a little method.
e.g. like finding a square root, something you might want to do again and again.
*/