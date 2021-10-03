package Java.FunProblems;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStackDemo {

    static Stack<Integer> myStack = new Stack<>();
    public static void main(String[] args) {


        myStack.addAll(Arrays.asList(1,3,5,7,9,11));
        System.out.println(myStack);
        reverseTheStack();
        System.out.println(myStack);
    }

    private static void reverseTheStack() {

        if(myStack.size()==0){
            return;
        }
        insertAtBottom(myStack.pop());

        reverseTheStack();


        return;
    }

    private static void insertAtBottom(int top){
        if(myStack.isEmpty()){
            myStack.push(top);
            return;
        }
        else{
            myStack.push(top);

        }
    }
}
