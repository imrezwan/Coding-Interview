

public class Stack<T>{

    private T[] array ;
    private int mylen = 0;

    public void push(T value) {

        array = (T[]) new Object[mylen+1];

        array[mylen++] = value;
    }

    public void pop() {
        mylen--;
    }

    public T peek() {
        return mylen>0?array[mylen-1]: null;
    }

    public int length(){
        return mylen;
    }
}
