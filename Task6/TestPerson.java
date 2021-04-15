public class TestPerson {
    public static void main(String[]args){
        Student s1=new Student("Tan Ah Teck","1 Happy Ave");
        s1.addCourseGrade("IM101",97);
        s1.printGrade();

        System.out.println("Average is: "+s1.getAverageGrade());

        Teacher t1=new Teacher("Paul Tan","8 sunset way");
        System.out.println(t1);

        String[] courses={"TM101","TM102","TM103"};
        for (String course: courses){
            if (t1.addCourse(course)){
                System.out.println(course+" added");
            }else {
                System.out.println(course+" cannot be added");
            }
        }

        for (String course:courses){
            if (t1.removeCourse(course)){
                System.out.println(course+" removed");
            }else {
                System.out.println(course+" cannot be added");
            }
        }

    }
}
