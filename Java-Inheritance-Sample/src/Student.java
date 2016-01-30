/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author work
 */


public class Student extends People{
    
    private int number;
    private int grade;
    private String spec;
    // super refers to the fields and methods in the base class
    public Student(){
    super();
    this.grade=1;
    this.number=61548;
    this.spec="SE";
    
}
    public Student(String name,char gender,int years,String birthDate
            ,int number,int grade,String spec)
    {
        super(name,gender,years,birthDate);
        this.grade=grade;
        this.number=number;
        this.spec=spec;
        
    }
    public String toString(){
        String result=" Student with"+ super.toString()
                + " with faculty number"+ this.number+ " with gender"+ super.getGender();
        return result;
    }
    public String getInfo(){
        return " Students datum:"+super.toString()+ "  "
                + this.grade+ " "+ this.number;
    }
}
