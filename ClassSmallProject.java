import java.util.Scanner;

public class ClassSmallProject {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        int key1=sc.nextInt();
        switch (key1){
            case 1:
            {
                System.out.println("choose the college:");
                System.out.println("enter your choice:");
                int key2=sc.nextInt();
                switch (key1)
                {
                    case 1:
                    {
                        System.out.println("place of college:");
                        System.out.println("enter your grade:");
                        String grade=sc.next();
                        System.out.println("enter your percentage:");
                        float per=sc.nextFloat();

                        System.out.println("enter your choice:");
                        int key3=sc.nextInt();
                        switch(key2){
                            case 1:
                            {
                                if(per>=70|| grade=="A")
                                {
                                    System.out.println("congrats you get college in your native");
                                }
                                else
                                {
                                    System.out.println("sorry you cannot get college in your native");
                                }
                            }
                            break;
                            case 2:
                            {
                                if(per>=60 || grade=="B"|| grade=="B")
                                {
                                    System.out.println("congrats you get college in india");
                                }
                                else{
                                    System.out.println("sorry you cannot get college in india");
                                }
                            }
                            break;
                            case 3:
                            {
                                if(per>=90 || grade=="A")
                                {
                                    System.out.println("congrats you get college in the world");
                                }
                                else{
                                    System.out.println("sorry you cannot get college in the world");
                                }
                            }
                            break;
                            case 4:
                            {
                                if(per>=35 || grade=="C")
                                {
                                    System.out.println("congrats you get college in remote area");
                                }
                                else{
                                    System.out.println("sorry you cannot get college in remote area");
                                }
                            }
                            break;
                            
                        }

                    }
                }
            }
        }
    }
    
}


/*output:
compile time success
run time success
enter your choice
1
choose the college:
enter your choice:
1
place of college:
enter your grade:
1
enter your percentage:
80
enter your choice:
1
congrats you get college in your native
 */