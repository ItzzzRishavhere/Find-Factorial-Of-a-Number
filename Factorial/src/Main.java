import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Factorial of 5 , 5! = 5x4x3x2x1 = 120
        Scanner sc = new Scanner(System.in);    //new Scanner class

        System.out.println("What is the Number?"); //Initializing the Number

        int num = sc.nextInt(); //reading the number

        int Fact = 1;   //A var needed to find the factorial

        for(int j=1;j<=num;j++){
            Fact=Fact*j;
        }               //a loop which won't end until j<= the number
                        // and 1 is added to j each and every time the loop is repeated
                        /* e.g. 5 is the num and j is 1 so j<5 so fact will be multiplied by 1
                                again 1 is added to j so j=2  and since 2<1 so fact will be multiplied 2 which is 2
                                again 1 is added to j and the loop continues.
                         */
        System.out.println("Factorial of "+num+" is "+Fact);
        System.out.println(num+"! = "+Fact);
    }
}

//@author ItzzzRishavhere - Github

//Haven't I given  very well explained comments? ^_^
