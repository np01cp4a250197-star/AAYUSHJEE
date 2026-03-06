package week17;

public class Student {

    private String studentId;
    private String name;
    private String course;

    public Student(String studentId, String name, String course) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getFormattedDetails() {
        return "<html>"
                + "<h2>Student ID Card</h2>"
                + "<b>ID:</b> " + studentId + "<br>"
                + "<b>Name:</b>"  + name + "<br>"
                + "<b>Course:</b>"  + course
                + "</html>";
    }
}
