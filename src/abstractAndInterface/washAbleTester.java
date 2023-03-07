package abstractAndInterface;

public class washAbleTester {

    public static void main(String[] args) {

        washAble [] washAbles={new SmartWatch(),
                new Inverter(),new Phone()};

        for(washAble w:washAbles){
            w.wash();
        }
    }
}