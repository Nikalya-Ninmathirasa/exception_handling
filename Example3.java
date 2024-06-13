// user define exception
public class Example3 {

    public static void main(String[] args) {

        // UserDefined ud = new UserDefined();
        // System.out.println(getmsg());
        
    }
    

    class UserDefined extends Exception{
        String msg;

        UserDefined(String str){
            this.msg = str;
        }

        String getmsg(){
            return this.msg;
        }
    }
}
