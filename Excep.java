public class Excep {

    public static void main(String[] args) {
        int a=5;
        int b=0;

        try{
            System.out.println(a/b);
        }

        catch(Exception E){
            System.out.println("b is 0");
            b=5;

        }

      System.out.println("Hello");
      System.out.println(a/b);

    }
    
}
