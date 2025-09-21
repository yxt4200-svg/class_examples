package study.unit4.practice1;

public class Kids extends ManKind{
    int yearsOld; // 年龄

    public Kids(){

    }

    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public int getYearsOld(){
        return yearsOld;
    }

    public void setYearsOld(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("I am " + yearsOld + " years old.");
    }

    public void employeed(){
        System.out.println("Kids should study and no job.");
    }
}
