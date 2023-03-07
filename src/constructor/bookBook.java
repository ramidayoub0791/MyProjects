package constructor;

public class bookBook {


        String author;
        String title;
        int year;

    bookBook(String author,String title){
            this.author=author;
            this.title=title;
        }
    bookBook(String author,String title,int year){
            this(author,title);
            this.year=year;
        }
        void info(){
            System.out.println("Author:"+author+", Title: "+title+", published: "+year);
        }

        public static void main(String[] args) {

            bookBook book =new bookBook("Judy Kerolus", "Java Priciples", 2023 );
            book.info();
        }
    }

