package LE3Q2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DriverForStudentClass {
    public static void main (String args[]){

        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student s0 = new Student();
        Student s1 = new Student("Harry","Potter", 75.5);
        Student s2 = new Student("Ronald","Weasley", 86.0);
        Student s3 = new Student("Hermione","Granger", 91.7);
        Student s4 = new Student("Parvati","Patil", 93.75);

        myHeader(s0,3,2);

        studentArrayList.add(s0);
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);

        System.out.println("The Score Card: \n" +studentArrayList.toString() + "\b");

        Collections.sort(studentArrayList, Collections.reverseOrder());

        System.out.println("The sorted list in terms of score in descending order.... \n" + studentArrayList.toString() + "\b");

        HelperClassCompareLastNames helperL = new HelperClassCompareLastNames();
        Collections.sort(studentArrayList, helperL);
        System.out.println("The sorted list in terms of Last Names.... \n" + studentArrayList.toString() + "\b");

        HelperClassCompareFirstNames helperF = new HelperClassCompareFirstNames();
        Collections.sort(studentArrayList, helperF);
        System.out.println("The sorted list in terms of First Names.... \n" + studentArrayList.toString() + "\b");

        myFooter("Dasol",3,2);
    }
    //This is myHeader method containing my name and student number
    public static void myHeader(Student myInfo, int labE_number, int q_number){
        System.out.println("=====================================================");
        System.out.printf("Lab Exercise %d-Q%d \n", labE_number, q_number);
        System.out.printf("Prepared By:  %s \n", myInfo.getFirstName() + " " + myInfo.getLastName());
        System.out.println("Student Number: 251224110");
        System.out.println("Goal of this Exercise: Checking the code-execution time!");
        System.out.println("=====================================================");
    }
    //This is myFooter containing a good-bye message
    public static void myFooter(String firstName, int labE_number, int q_number) {
        System.out.println("=====================================================");
        System.out.printf("Completion of Lab Exercise %d-Q%d is successful! \n", labE_number, q_number);
        System.out.printf("Signing off - %s \n", firstName);
        System.out.println("=====================================================");
    }
}
