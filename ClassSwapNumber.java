import java.util.Scanner;
public class ClassSwapNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");

        int num1=sc.nextInt();
        System.out.println("enter number 2");

        int num2=sc.nextInt();
        int c=0;
        System.out.println("the value of num1&num2 before swapping is "+num1+":"+num2);
        
        c=num1;
        num1=num2;
        num2=c;
        System.out.println("after swapping is"+num1+":"+num2);

    }
    
}


/*output:
compile time success
run time success
*enter number 1
*20
*enter number 2
*40
*the value of num1&num2 before swapping is 20:40
*after swapping is40:20
*/
 
 