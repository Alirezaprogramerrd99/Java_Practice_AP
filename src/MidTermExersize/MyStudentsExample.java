package MidTermExersize;

class Student2 {
    private String name;
    private long id;

    Student2() {
        name = "Ali";
        id = 12345;
    }

    Student2(String name, long id) {
        this();  // calling default constractor.
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


public class MyStudentsExample {

    public static void ForEachMethodPrint(Student2[] student) {
        for (Student2 elements : student) {
            System.out.println(elements.getName() + "    " + elements.getId());
        }
    }

    public static void ForiMethodPrint(Student2[] student2) {   //fori

        for (int i = 0; i < student2.length; i++) {
            System.out.println(student2[i].getName() + "    " + student2[i].getId());
        }
    }

    public static void main(String[] args) {

        Student2[] students = new Student2[10];

/*        for (Student2 element: students){    // inja nullpointer rogh medee!!  chon new nakardim.
            System.out.println(element.getName() + "    " + element.getId());
        }*/

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student2("dede", 99866);
        }

        ForiMethodPrint(students);  /// ba for addii.

        //-------------------------------------------------------------------------
        System.out.println("-------------------------------------------");

        ForEachMethodPrint(students);  // ba for each..

    }
}
