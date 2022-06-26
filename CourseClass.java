package lesson99;

public class CourseClass implements Course {
    String subject;

    public CourseClass(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "CourseClass{" +
                "Курсы " + subject + '\'' +
                '}';
    }
}
