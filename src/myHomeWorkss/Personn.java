package myHomeWorkss;




class Personn{
    String name;
    String lastName;
    int age;
}

class Employee extends Personn {

    int Salary;
    void dis(String name,String lastName,int age,int Salary){
        System.out.println(name+" "+lastName+" "+age+" "+Salary);
    }
}

class Student extends Employee{
  //  this.name=name;
    int grade;
    void dis1(String name,String lastName,int grade,int age){
        System.out.println(name+" "+lastName+" "+grade+" "+age);
    }
}

class Retiree extends Student{
    String seniorActivity;
    void dis2(String name,String lastName,int age,String seniorActivity){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}

class Mainnn {
    public static void main(String[] args){
        Employee E=new Employee();
        E.dis("Joe","Smith",35,35000);
        Student S=new Student();
        S.dis1("Adam","Smith",15,10);
        Retiree R=new Retiree();
        R.dis2("Frank","Smith",15,"tour");
    }
}