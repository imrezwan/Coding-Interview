package Java.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Prnato");
        myList.add("Akram");
        myList.add("Mahmud");
        myList.add("Reza");
        Collections.sort(myList);
        System.out.println(myList);


        List<Student> studentList=  new ArrayList<>();
        studentList.add(new Student("Rezwan", 33));
        studentList.add(new Student("Alim", 3));
        studentList.add(new Student("Madus", 1));
        studentList.add(new Student("Yusuf", 62));
        studentList.add(new Student("Imran", 222));

        Collections.sort(studentList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(studentList);
    }
}
