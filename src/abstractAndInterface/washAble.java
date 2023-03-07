package abstractAndInterface;

public interface washAble {

    void wash();
}

class SmartWatch implements washAble{

    @Override
    public void wash() {
        System.out.println("You can wash this smartwatch with out any issues");
    }
}

class Phone implements washAble{

    public   void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }

}

class Inverter implements washAble{
    public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}
