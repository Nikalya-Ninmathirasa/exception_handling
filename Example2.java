
public class Example2 {


    static void check(int age){
        if(age<18){
            throw new ArithmeticException("Age is Invalid");
        }
    }

    public static void main(String[] args) {
         

        try{
            check(16);
        }

        catch(ArithmeticException A){
            System.out.println("status:"+A.getMessage());
    
        }

        

        //finally
        // finally{
        //     System.out.println("finally block");
        // }
   
      

    }
    
}
    

