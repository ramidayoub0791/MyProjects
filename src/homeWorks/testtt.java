package homeWorks;

class Main {

     final double avgElement() {
       int[] a = {2, 7, 3, 8, 4};
        double avgElements ;
        double sum=0;
        for (int i = 0; i < a.length; i++) {
             sum =sum+ a[i];
        }
         avgElements = sum / a.length;
        return avgElements;
    }
   public static void main(String[] args) {
       Main x=new Main();
         x.avgElement();
        System.out.println(x.avgElement()); //should print 4.8
    }


}