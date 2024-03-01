public class BloodDonation {
    public static void main(String[] args) {
        int hemoglobin=13;
        int age=25;
        boolean disease=false;
        boolean drugaddict=false;

        if (age>18 && age<60) {

            if (hemoglobin>=13) {

                if (disease==false) {

                    if (drugaddict==false) {
                        System.out.println("you are eligible for blood donation");
                    }
                    else{
                        System.out.println("you can not donate because you are drug addict");
                    }  
                }
                else{
                    System.out.println("you can not donate blood because you have cold");
                }
            }
            else{
                System.out.println("you can not donate blood because your hemoglobin is less than 13");
            } 
        } 
        else{
            System.out.println("you age is not valid for donating blood");
        }
    }
}    


     /*output:
     * Compile Time Success
     * Run Time Success
     * you are eligible for blood donation
      */                   
                    
                    
                
                
            

            
                
            

        
                
            
            
        


        
    
    

