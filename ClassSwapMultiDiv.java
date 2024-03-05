import java.util.Scanner;

public class ClassSwapMultiDiv {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         //with out using third variable (mul % div)
         System.out.println("enter number 1");
         int num1=sc.nextInt();
         System.out.println("enter number 2");
         int num2=sc.nextInt();
         System.out.println("the value of num & num2 before swapping is" +num1+":"+num2);

         //update num1
         num1=num1*num2;

         //updatenum2
         num2=num1/num2;

         //update num1
         num1=num1/num2;

         System.out.println("the value of num1 & num2 after swapping is" +num1+":"+num2);

    }

} 
         
    
    
/*output:
compile time success
run time success
enter number 1
40
enter number 2
80
the value of num & num2 before swapping is40:80
the value of num1 & num2 after swapping is80:40
 */
