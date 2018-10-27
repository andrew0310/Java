package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentBook {

    private List<Student> studentList;

    public StudentBook(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentBook() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }


    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    public boolean removeStudent(String indexNo) {

        for (Student student : studentList) {
            if (student.getIndexNo().equals(indexNo)) {
                studentList.remove(indexNo);
                return true;
            }
        }
        return false;
    }

    public Optional<Student> getStudent(String indexNo) {

        for (Student student : studentList) {
            if (student.getIndexNo().equals(indexNo)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> getAverage(String indexNo) {
        Optional<Student> studentOptional = getStudent(indexNo);
        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            double result = 0;
            for (Double mark : student.getMarks()) {
                result += mark;
            }
            if (studentList.size() > 0) {
                result = result / studentList.size();
            }
            return Optional.of(result);
        } else {
            return Optional.empty();
        }

    }

    public List<Student> getStudentsInDanger() {
        List<Student> result = new ArrayList<>();
        for (Student student : studentList) {
            Optional<Double> avfOptional = getAverage(student.getIndexNo());
            if (avfOptional.isPresent()) {
                if (avfOptional.get() < 3.0) result.add(student);
            }
        }
        return result;
    }
}
