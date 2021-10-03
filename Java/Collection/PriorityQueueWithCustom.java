package Java.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueWithCustom {
    public static void main(String[] args) {
        Queue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Student("Pranto1", 33));
        priorityQueue.add(new Student("Pranto2", 3));
        priorityQueue.add(new Student("Pranto3", 1));
        priorityQueue.add(new Student("Pranto4", 62));
        priorityQueue.add(new Student("Pranto5", 222));

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }



    }
}

class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    public Student(final String name, final Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return o.getAge().compareTo(this.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}\n";
    }
}
