package OOP;

public class UpDownCasting {
    public static void main(String[] args) {
        Liquid milk = new  Milk(); //upcasting ==>  subclass to super class
        Liquid honey = new Honey(); //upcasting ==>  subclass to super class

        milk.getState();
        honey.getState();

        //honey.getName() couldn't call so we have to downcast "honey" object from "Liquid" to "Honey"

        if(honey instanceof Honey) //check if actually object of Honey
            ((Honey)honey).getName();  // downcasting: superclass to subclass
    }
}


class Liquid{
    public void getState(){
        System.out.println("Just Liquid");
    }
}

class Milk extends Liquid{

    public void getState(){
        System.out.println("White Liquid");
    }
}

class Honey extends Liquid{

    public void getState(){
        System.out.println("Brown Liquid");
    }
    public void getName(){
        System.out.println("Honey Honey");
    }
}