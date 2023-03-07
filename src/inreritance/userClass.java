package inreritance;

public class userClass {
   String name;
   int mobile;
   userClass(String name,int mobile){
       this.name =name;
       this.mobile=mobile;}
   void prinn(){
    System.out.println(name+" "+mobile);
}
}
class userInfoo extends userClass{
    String address;
    userInfoo(String address){
        super("Rami",123);
        this.address=address;}
    void prin(){
    //    super.prinn();
        System.out.println(name+" "+mobile+" "+address);}

    public static void main(String[] args) {
        userInfoo info=new userInfoo("Montreal");
        info.prin();
    }
}
/* Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
 Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
 Print users name, mobile number and address in userDetails method. Test your code.*/