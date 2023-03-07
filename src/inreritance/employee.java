package inreritance;

public class employee {
  String position="worker";
  int salary=30000;

    public employee(String position, int salary) {

    }

    public employee() {

    }


    void assign(){
      System.out.println("the salary of the "+position+" position "+salary);
  }
  void est(){
      System.out.println("he is worth "+salary);
  }

}
class fullTime extends employee{
    int workHours;
    void statement(){
        super.assign();
        System.out.println("work hard for "+workHours);
    }
    fullTime(int workHours){
        super();
        this.workHours=workHours;

    }
}
class partTime extends employee{
String workPeriod;
void evening(){
    System.out.println(" he prefers to work at "+workPeriod+" time");
}
    partTime(String position, int salary,String workPeriod) {
        super(position, salary);
        this.workPeriod=workPeriod;
    }
}

/* 2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code! */