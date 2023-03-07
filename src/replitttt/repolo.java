package replitttt;

class repolo implements Functions {
    double firstNumber = 100.00;
    double secondNumber = 20.00;

    public void display(String result){
        System.out.println(result);
    }
    public double addNumbers(double firstNumber, double SecondNumber){
        return (firstNumber + SecondNumber);
    }

    public double subNumbers(double firstNumber ,double SecondNumber){
        return (firstNumber - SecondNumber);
    }

    public double multyNumbers(double firstNumber ,double SecondNumber){
        return (firstNumber * SecondNumber);
    }

    public double divideNumbers(double firstNumber ,double SecondNumber){
        return (firstNumber / SecondNumber);
    }

    public static void main(String[] args) {
        double firstNumber = 100.00;
        double secondNumber = 20.00;
        repolo obj=new repolo();
        System.out.println("Result is :::"+obj.addNumbers(firstNumber,secondNumber));
        System.out.println("Result is :::"+obj.subNumbers(firstNumber,secondNumber));
        System.out.println("Result is :::"+obj.multyNumbers(firstNumber,secondNumber));
        System.out.println("Result is :::"+obj.divideNumbers(firstNumber,secondNumber));
    }

}
interface Outputs{
    void display(String result);
}


interface Functions extends Outputs{
    public double addNumbers(double firstNumber, double SecondNumber);

    public double subNumbers(double firstNumber ,double SecondNumber);

    public double multyNumbers(double firstNumber ,double SecondNumber);

    public double divideNumbers(double firstNumber ,double SecondNumber);

}