import java.util.ArrayList;

public class Student extends User {
    protected ArrayList<String> enrolledCourse = new ArrayList<String>();

    public Student(String name, int id) {
        super(name, id);
    }

    public void enrollInCourse(String course) {
        enrolledCourse.add(course);
    }

    @Override
    public String getUserDetail() {
        return super.getUserDetail() + ", Enrolled Course: " + enrolledCourse;
    }
}