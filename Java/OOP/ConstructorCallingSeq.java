package OOP;

public class ConstructorCallingSeq {

    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A(){
        System.out.println("I am constructor of A");
    }
}


class B extends A{
    public B(){
        System.out.println("I am constructor of B");
    }
}

class C extends B{
    public C(){
        System.out.println("I am constructor of C");
    }
}