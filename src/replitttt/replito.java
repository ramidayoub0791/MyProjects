package replitttt;

class Account{
    private long acc_no;
    private String name;
    private String email;
    private double amount;

    public void setAccno(long accno){
        acc_no=accno;
    }
    public long getAccno(){
        return acc_no;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
}
class mmmain {
    public static void main(String[] args) {
        Account obj=new Account();
        obj.setAccno( 7560504000l);
        System.out.print(obj.getAccno()+" ");
        obj.setName("Sumair");
        System.out.print(obj.getName()+" ");
        obj.setEmail("sumair@syntax.com");
        System.out.print(obj.getEmail()+" ");
        obj.setAmount(50000.0);
        System.out.print(obj.getAmount());
    }
}