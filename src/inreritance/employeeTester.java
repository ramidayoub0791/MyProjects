package inreritance;

public class employeeTester {
    public static void main(String[] args) {
        fullTime job=new fullTime(8);
        job.statement();

        partTime period=new partTime("mamager",100000,"morning");
  period.est();
  period.evening();
    }
}
