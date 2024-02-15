 class operator
  {

    public static void main (String[]args)
    {
        int cs =100;
        int AI =88;
        int wt =100;
        int dsbda =60;
        int cns =90;

        int total=cs+AI+wt+dsbda+cns;
        System.out.println(total);

        float percentage =(total/500)*100;
        System.out.println(percentage);

        int percentage1 =(int) percentage;
        System.out.println(percentage1);

        char result =(percentage1 >=90 && percentage1 <=100)?('A'): ((percentage1 <90 && percentage1 >=75)?('B'): (percentage1 <75 && percentage1 >= 85)?('C'): (percentage1 < 65 && percentage1 >= 35)?('E'):('F'));
        System.out.println(result);





    }
}
 
  output: Compile Time error:Success
           RunTime : success  // 438
                                 0.0
                                 0
                                 F                    
         
            
        
        





