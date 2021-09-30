package OOP;


// parameter and return type same
// Covariant return type: each method from different class's return type must be same or subclass
// final method, private method, static method can not be "override"
// constructor can not be override
public class MethodOverloading {
    public static void main(String[] args) {
        ParentClass obj = new ChildClass();
        obj.talk(); //child class's talk() method overriden parent class's talk() method
    }
}


class ChildClass extends ParentClass{
    public void talk(){
        System.out.println(" I am from Child Class");
    }
}

class ParentClass{
    public void talk(){
        System.out.println("I am from Parent Class");
    }
}