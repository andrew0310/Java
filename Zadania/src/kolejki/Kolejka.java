package kolejki;

import Student.Student;

import java.util.LinkedList;
import java.util.Queue;

public class Kolejka {

    public static void main(String[] args) {

        Student student1 = new Student("163", "Mercin", "Kowalski");
        Student student2 = new Student("163", "Bartek", "markocki");
        Student student3 = new Student("163", "Asia", "Mała");
        Student student4 = new Student("163", "Wojtek", "zły");
        Student student5 = new Student("163", "Mariusz", "Czuba");
        Student student6 = new Student("123", "Marcin", "Karta");
        Student student7 = new Student("285", "Marta", "Krysa");
        Student student8 = new Student("770", "Katarzyna", "Frose");
        Student student9 = new Student("400", "Wiesław", "Wróbel");
        Student student10 = new Student("065", "Jerzy", "Szwejca");

        Queue<Student> queue = new LinkedList<>();

        queue.add(student1);
        queue.add(student2);
        queue.add(student3);
        queue.add(student4);
        queue.add(student5);
        queue.add(student6);
        queue.add(student7);
        queue.add(student8);
        queue.add(student9);
        queue.add(student10);

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue);
        queue.remove();
    }
}
