package LE3Q2;

import java.util.Comparator;

public class HelperClassCompareFirstNames implements Comparator <Student> {
    public int compare(Student s1, Student s2){
        String student1 = s1.getFirstName();
        String student2 = s2.getFirstName();

        String min;
        if (student1.length()>student2.length()){
            min = student2;
        } else if (student1.length()<student2.length()){
            min = student1;
        } else {
            min = student1;
        }

        for(int i=0;i<min.length();i++){
            if((int)student1.charAt(i)<(int)student2.charAt(i))
                return -1;
            else if ((int)student1.charAt(i)>(int)student2.charAt(i))
                return 1;
        }
        return 0;

//        if((int)student1.charAt(0)<(int)student2.charAt(0))
//            return -1;
//        else if ((int)student1.charAt(0)>(int)student2.charAt(0))
//            return 1;
//        else if ((int)student1.charAt(0)==(int)student2.charAt(0)){
//            if((int)student1.charAt(1)<(int)student2.charAt(1))
//                return -1;
//            else if ((int)student1.charAt(1)>(int)student2.charAt(1))
//                return 1;
//        }
//        return 0;
    }
}
