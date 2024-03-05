public class DoWhileEven {
    public static void main(String[] args) {
        
        int a=1;
        do{
            int b=(3*a);
            if(b%2==0)
            {
                System.out.println(b);
            }
            a++;
        }while(a<=10);

        }
    }
    

/*output:
6
12
18
24
30
 
 */