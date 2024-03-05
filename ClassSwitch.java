 
 public class ClassSwitch {
 
    public static void main(String[]args)
    {
        int number=20;
        int key=2;
        int result;
        switch(key)
        {

            case 1: if (number%2==0)
                    {
                   System.out.println("number is even");             
                   }
                    else
                   {
                    System.out.println("number is odd");
                    }

            case 2: if (number%7==0||number%10==7) {
                   System.out.println("number is buzz");
                   }
                   else{
                    System.out.println("number is not buzz");
                   }

            case 3: if (number>=0) {
                   System.out.println("number is positive");
                   }    
                   else{
                    System.out.println("number is negative");
                   }  

             case 4: if (number>=10&&number>=99) {
                    System.out.println("number is 2 digit");
                    }      
                    else{
                      System.out.println("number is not 2 digit");  
                    }
                }        
            }
        }   


  /*output:
  compile time success
  run time success
  number is not buzz
  number is positive
  number is not 2 digit
   */  

