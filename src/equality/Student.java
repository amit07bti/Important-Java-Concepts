package equality;

import java.util.Objects;

public class Student {
    String name;
    int rollNum;

    public Student(String name,int rollNum){
        this.name=name;
        this.rollNum=rollNum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNum == student.rollNum && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNum);
    }
}
