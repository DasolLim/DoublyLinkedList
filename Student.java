package LE3Q2;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private Double score;
    private String firstName;
    private String lastName;

    public Student(){
        firstName = "Dasol";
        lastName = "Lim";
        score = 100.00;
    }
    public Student (String firstName ,String lastName, Double score){
        this.firstName= firstName;
        this.lastName = lastName;
        this.score = score;
    }
    public Double getScore(){
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String toString(){

            return String.format("\b\b%s %s: %.2f\n", firstName, lastName, score);
    }
    public int compareTo(Student studentScore) {
        int value = 0;
        if(this.score> studentScore.score)
            value = 1;
        else if(this.score< studentScore.score)
            value = -1;
        else
            value = 0;
        return value;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName= firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
}
