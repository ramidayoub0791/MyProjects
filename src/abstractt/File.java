package abstractt;

public abstract class File {
    int size;
    File(int size){
        this.size=size;
    }
    abstract void open();

    void edit(){
        System.out.println("edit super class");
    }

    void close(){
        System.out.println("close super class");
    }
}

 class  javaFile extends File{

    javaFile(int size){
       super(size);
    }
    void open(){
        System.out.println("to open javaFile we need notepad++");
    }
     void edit(){
         System.out.println("edit javaFiles");
     }
}

 class  wordFile extends File{

     wordFile(int size){
         super(size);
     }
void open(){
    System.out.println("to open wordFile we need Microsoft word");
}
}

 class  pdfFile extends File{

     pdfFile(int size){
         super(size);
     }
void open(){
    System.out.println("to open wordFile we need acrobat");
}
     void close(){
         System.out.println("close pdf");
     }
}
