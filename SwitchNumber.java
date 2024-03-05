import java.util.Scanner;

public class SwitchNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int number=sc.nextInt();
        System.out.println("enter choice:");
        int key=sc.nextInt();
        
        switch(key)
        {
            case 1: if(number%2==0)
            {
                System.out.println("number is even");
            }
            else
            {
                System.out.println("number is odd");
            }
            break;
            case 2: if(number%7==0 || number%10==7)
            {
                System.out.println("number is buzz");
            }
            else
            {
                System.out.println("number is not buzz");
            }
            break;
            case 3: if(number>=0)
            {
                System.out.println("number is positive");
            }
            else{
                System.out.println("number is negative");
            }
            break;
            case 4: if(number<99 && number>10)
            {
                System.out.println("two digit number");
            }
            else{
                System.out.println("not two digit number");
            }
            break;


        }
    }
}  
    
/*output:
enter the number:
70
enter choice:
2
number is buzz

enter the number:
345
enter choice:
4
not two digit number

enter the number:
44
enter choice:
1
number is even

enter the number:
33
enter choice:
3
number is positive*/