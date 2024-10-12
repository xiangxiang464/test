package student;

/*
    测试类：名字上包含Test，并且有主方法
    类输出：
        student.Student@7ef20235
        全类名：包名+类名
 */

public class StudentTest {
    public static void main(String[] args) {
        Student student1  = new Student();
        System.out.println(student1); //student.Student@7ef20235
        System.out.println(student1.name);
        student1.study();
    }
}
