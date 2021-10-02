package ExceptionHandling;

import org.w3c.dom.Node;

public class FinallyBlockDemo {

    public static void main(String[] args) {

        try{
            int x = 10/0;
            System.out.println(x);
        }
        catch (Exception e){
            System.out.println("Handling Exception : "+e.getMessage());
        }
        finally {
            System.out.println("Finally block Do something");
        }

        System.out.println("Program didn't crash");
    }
}
