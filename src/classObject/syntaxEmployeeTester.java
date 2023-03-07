package classObject;

public class syntaxEmployeeTester {
    public static void main(String[] args) {
        syntaxEmployee employee=new syntaxEmployee();
        employee.emID=123;
        employee.salary=2500;


        syntaxEmployee employee1=new syntaxEmployee();
        employee1.emID=456;
        employee1.salary=3000;


        System.out.println(employee1.emID);
        System.out.println(employee1.salary);
        System.out.println( syntaxEmployee.CEO);
        //OR:
        System.out.println(employee1.CEO);

        System.out.println(employee.emID);
        System.out.println(employee.salary);
        System.out.println( syntaxEmployee.CEO);
        //OR:
        System.out.println(employee.CEO);

    }
}
