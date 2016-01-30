/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author work
 */
public class People {
     private String name;
    private char gender;
    private int years;
    private String birthDate;
   
    public People (){
        //this.years=19;
        this("Yanislav",'m',19,"07.1993");
}
    //the order of the parameters matters
    public People(String name, char gender,int years, String birthDate ){
        this.birthDate=birthDate;
        this.gender=gender;
        this.name=name;
        this.years=years;
    }
    //copy constructor
    public People(People p){
        this.birthDate=p.birthDate;
        this.gender=p.gender;
        this.name=p.name;
        this.years=p.years;
    }
    public void setMethod(String name){
    this.name=name;
}
    public String getMethod(){
        return name;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return String.format(" name %s, with age %d, gender: %c and date of birth %s",name,years, gender,birthDate);
    }
    }

    

