package HashMap;

import java.util.Map;
import java.util.TreeMap;

public class HomeWork1 {

      public static class Person{
          private String name;
            private String lastName;
            private int age;
            private double salary;
           public Person(String name,String lastName,int age,double salary){
                this.name=name;
                this.lastName=lastName;
                this.age=age;
                this.salary=salary;
            }
            void print(){
                System.out.println("Name : "+name+" Last Name : "+lastName+" Age : "+age+" Salary : "+salary);
            }
        }
    }




/*2) Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
 In that map store personId and a Person Object. Print each object details.
 */
