
public class Cafemachine {
     int br1st;
     int br2st;
     int br5st;
     int br10st;
     int br20st;
     int br50st;
     int br100st;
    
    
    
    public Cafemachine(){
    br1st=5;
   
    
    
}
    //defoult constructor 
    public Cafemachine(int br1st,int br2st,int br5st,int br10st
            ,int br20st,int br50st,int br100st){
        this.br1st=br1st;
        this.br2st=br2st;
    }
    //method for reading
    public int getBr1st(){
        return br1st;
    }
    //set method
    public void setBr1st(int br1st){
        this.br1st=br1st;
        this.br100st=br100st;
        this.br10st=br10st;
        this.br20st=br20st;
    }
    int checkTotal(){
        System.out.println(" Suma ot monetite e:");
        return 1*br1st +2*br2st+5*br5st+1*br10st+20*br20st;
    }
    public String toString(){
        return " Sumata na monetite v momenta e:"+this.checkTotal()+"/n"+
                "/t"+" Broi moneti ot 1 stotinka:"+ br1st+"/n"+
                " Broi moneti ot 2 stotinki:"+br2st+"/n";
    }
   public String takeResto(int resto){
        String result=" Vasheto resto e:";
        int count=0;
        count=resto/100;
        result+=" Vasheto resto ot 1 lv. e:"+count;
        resto =resto%100;
        count=resto/50;
        result+=" Vasheto resto ot 50 st. e:"+count;
        resto= resto%50;
        count=resto/20;
        result+="Vasheto resto ot 20 st. e:"+count;
        resto=resto%20;
        count=resto/10;
        result+="Vasheto resto ot 10 st. e:"+count;
        resto=resto%10;
        count=resto/5;
        result+="Vasheto resto ot 5st. e:"+count;
        resto=resto%5;
        count=resto/2;
        result+="Vasheto resto ot 2 st. e:"+count;
        resto=resto%2;
        result+="Vasheto resto ot 1 st. e:"+count;
        
        return result;
    }
}

