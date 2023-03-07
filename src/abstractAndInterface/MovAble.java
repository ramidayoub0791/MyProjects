package abstractAndInterface;

public interface MovAble {
    void move();
}

interface OwnAble{
    void own();
}

class Car implements MovAble, OwnAble{

    @Override
    public void move() {
        System.out.println(" I can move");
    }

    @Override
    public void own() {
        System.out.println("You can own me");
    }
}

class  Dog implements MovAble, OwnAble{

    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {
        System.out.println("you can own me");
    }
}
