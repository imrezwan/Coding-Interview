package ExceptionHandling;

public class ExceptionDemo {

    public static void main(String[] args) {
        try{
            int x = 10/0;

        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}


