package myHomeWorkss;

public class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies(){
        System.out.println(schoolName+" "+ batch+" "+year+" "+lastDayOfClass);
    }
    SyntaxTechnologies( String schoolName,int batch,int year,String lastDayOfClass){

            System.out.println(schoolName+" "+ batch+" "+year+" "+lastDayOfClass);

        this.batch=batch;
        this.lastDayOfClass=lastDayOfClass;
        this.year=year;
        this.schoolName=schoolName;
    }
}

class result {
    public static void main(String[] args){
        SyntaxTechnologies dis=new SyntaxTechnologies();


         SyntaxTechnologies diss=new SyntaxTechnologies("Syntax",15,2023,"Mondat");

    }
}
