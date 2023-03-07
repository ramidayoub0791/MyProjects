package replitttt;

public class Person {

    private String firstname;
    private String lastname;
    private String birthmonth;
    private String birthday;
    private String birthyear;
    private String ssn;

   public Person(String firstname, String lastname, String birthmonth, String birthday, String birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }
    public String getFirstname (){
            return firstname;
        }

    public String getLastname (){
        return lastname;
    }

    public String getSsn (){
        return ssn;
    }

        public String formatBirthday (){
            return (birthmonth+"/"+birthday+"/"+birthyear);
        }
    }

class main {
    public static void main(String[] args) {
         Person per=new Person("John","Doe","10","25","1900","123-45-6789");
        System.out.println(per.getFirstname());
        System.out.println(per.getLastname());
        System.out.println(per.formatBirthday());
        System.out.println(per.getSsn());
    }
}

