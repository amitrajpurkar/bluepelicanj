package bpj.lesson16;

public class Student {
    private String name;
    private double sum=0;
    public int numGrades=0;

    public Student(String nm){
        name = nm;
    }

    public String getName(){
        return name;
    }

    public void setGrade(int grd){
        numGrades++;
        sum += grd;
    }

    public double getAverage(){
        return sum / numGrades;
    }
}
