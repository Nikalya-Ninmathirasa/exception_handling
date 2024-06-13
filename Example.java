// user define exception

public class Example {

    public static void main(String[] args) {
        
        int a=5;
        int b=0;

        try{
            System.out.println(a/b);
        }

        catch(ArithmeticException A){
            System.out.println("b is 0");
    
        }

        catch(Exception E){
            System.out.println("b is 0 value");
           

        }

        //finally
        // finally{
        //     System.out.println("finally block");
        // }
   
      

    }
    
}
