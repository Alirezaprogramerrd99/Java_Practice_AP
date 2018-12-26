package Hobys;

class Course{
    private String CourseName;
    private String[] students = new String[100]; /// **** my bigest mistake ....
    private int NUMBER_OF_STUDENTS;
    Course(String CourseName){
        this.CourseName = CourseName;
    }

    public String getName(){
        return CourseName;
    }

    public void addStudens(String student){
        this.students[NUMBER_OF_STUDENTS] = new String(student);
        NUMBER_OF_STUDENTS++;
    }

    public String [] getStudents(){
        return students;
    }

    public int getNumberOfStudents() {
        return NUMBER_OF_STUDENTS;
    }
}

public class CourseAssignment {

    public static void main(String[] args) {
        Course course1 = new Course("Ap");
        System.out.println(course1.getName());
        course1.addStudens("Alireza");
        course1.addStudens("Sara");
        course1.addStudens("Jack");
        course1.addStudens("Billy");
        String []sts = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++){
            System.out.println(sts[i]);
        }

    }
}
