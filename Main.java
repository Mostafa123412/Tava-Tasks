package com.company;

public class Main {

    //الاسم / مصطفي اشرف محمد سعد الصعيدي
    //سكشن / 4

    public static void main(String[] args) throws NotYetSetException {

        // TODO code application logic here
        // Student context
        Student std1 = new Student();
        std1.setName("Mostafa");
        Student std2 = new Student();
        std2.setName("Ashraf");
        // Course context
        Course c1 = new Course();
        c1.setTitle("AI");
        Course c2 = new Course();
        c2.setTitle("SWE");
        // Assignment context
        Assignment as1 = new Assignment();
        as1.setMark(15);
        Assignment as2 = new Assignment();
        as2.setMark(10);
        // CourseRecord context
        CourseRecord cr1 = new CourseRecord();
        cr1.setStudent(std1);
        cr1.addAssignment(as1);
        cr1.addAssignment(as2);
        cr1.addAssignment(as1);
        CourseRecord cr2 = new CourseRecord();
        cr2.setStudent(std2);

        c1.addCourseRecord(cr1);
        c1.addCourseRecord(cr2);

//        test output
        System.out.println(cr1.average());
        System.out.println((cr1.canTakeFinalExam())?"student can take exam " : "student can not take exam");
        c1.printCourceStudents();
        c1.printBestStudent();
        c1.printFinalExamStudents();




    }

}

