package javaForQA.lesson13_Func.Task1;

public class StudentFilter implements Filter{

    @Override
    public boolean test(Student student) {
        return student.getGender().equals(Gender.MALE) && student.getAge() > 20;
    }


}
