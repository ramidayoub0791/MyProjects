package homeWorks;

public class ShoppingStore {

        String item;
        double price;
        int quantity;

        int itemTotalPrice(){
            System.out.println(item+" Total Value "+price);
return (int) price;
        }
        ShoppingStore(String item,int quantity,double price){
            this.item=item;
            this.price=price;
            this.quantity=quantity;
            this.itemTotalPrice();
        }
    ShoppingStore(String item,double price,int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
        this.itemTotalPrice();
        }
}

class Mainn {
    public static void main(String[]args){
        ShoppingStore item1=new ShoppingStore ("Blanket",0,99.98);
        ShoppingStore item2=new ShoppingStore("Mattress",439.18,0);
        System.out.println("You purchased "+(99.98+439.18)+" Today");
    }
}
