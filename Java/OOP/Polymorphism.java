package OOP;

public class Polymorphism {

    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.whoAreYou();
        animal2.whoAreYou();
    }
}

class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void whoAreYou(){
        System.out.println("I am "+this.name);
    }

}

class Dog extends Animal{

    public Dog(){
        super("Dog");
    }
}


class Cat extends Animal{

    public Cat(){
        super("Cat");
    }
}