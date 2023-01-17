package LE3Q1;

public class MyStudent {
    private String firstName;
    private Double score;
    public MyStudent(){
        firstName = "Dasol";
        score = 89.55;
    }
    public MyStudent(String firstName, Double score){
        this.firstName = firstName;
        this.score = score;
    }
    public String toString(){
        return String.format("%s: %.2f", firstName, score);
    }
}
