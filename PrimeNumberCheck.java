/**
* Task 3: Prime Number Checker
* Write a Java program to determine if a given integer is a prime number.
* 
* @author Tushar Pareek
* @since  03/09/2024
*/
import java.util.Scanner;

public class PrimeNumberCheck {
    
    public static void main(String[] args){
        System.out.println("This program can check if a number is prime or not.");
        System.out.println("Give it a try by entering a number: \n Enter the Number:");
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        numberCheck(num);
        String result= numberCheck(num)? "The given number is PRIME.": "The given number is NOT PRIME.";
        System.out.println(result);
        sc.close();
        

    }

    //This function is to do the given task of checking whether the given number is prime or not 

    public static boolean numberCheck(int x ){

        if(x<=1) 
        {
            return false;

        }
        else if (x==2) 
        {
            return true;
            
        }
        else if (x%2==0) 
        {
          return false;  
        }
        //now checking the divisibility of given number from 3 to sq root of given number 

        int sqroot = (int) Math.sqrt(x);
        for(int i=3; i<=sqroot ; i+=2){
            if (x%i==0) {
                return false;
                
            }

        }
        return true; //when no factor is found then return true value in the last


        

        }
    }
