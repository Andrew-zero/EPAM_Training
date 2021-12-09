package by.epam.introduction_to_java.basic.modul04.simple_object_and_class;

public class Main {

    public static void main(String[] args) {
        /*
        Task03 create group of Students
        _______________________________
         */
        Student[] groupOfStudent = new Student().initializeStudent();
        for(Student s : groupOfStudent){
            if(s.isTopStudent()){
                s.view();
                System.out.println();
            }
        }
        /*
        _______________________________
         */


        /*
        Task04 create Train
        _______________________________
         */

        /*
        _______________________________
         */

    }
}
