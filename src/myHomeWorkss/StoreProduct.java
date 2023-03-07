package myHomeWorkss;

public class StoreProduct {
        String label;
        double price;
        String category;
        boolean hasExpiration;
        int stock;

        StoreProduct( String label,double price,String category,boolean hasExpiration,int stock){
            this.label=label;
            this.price=price;
            this.category=category;
            this.hasExpiration=hasExpiration;
            this.stock=stock;
        this.display();
        }

        StoreProduct(String label,double price,int stock){
            category="misc";
            hasExpiration=false;
            this.label=label;
            this.price=price;
            this.stock=stock;
            this.display();
        }

        StoreProduct(String label,double price){
            stock=0;
            this.label=label;
            this.price=price;
            this.display();
        }
        void display(){
            System.out.println(label+ " "+price+" "+category+" "+hasExpiration+" "+stock);
        }

    public static void main(String [] args){
        StoreProduct pr=new StoreProduct("Eggs", 3.0, "Produce", true, 10);

        StoreProduct pr1=new StoreProduct("Paper towel", 2.0,  24);

        StoreProduct pr2=new StoreProduct("Paper towel", 2.0);


    }
}
