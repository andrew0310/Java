package kolejki;

import Student.Student;

import java.util.Comparator;

public class MyStudentComparator implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {

        int index1 = Integer.parseInt(s1.getIndexNo());
        int index2 = Integer.parseInt(s1.getIndexNo());

        if(index1 > index2) return -1;
        if(index1 < index2) return -1;
        return 0;
    }
}
