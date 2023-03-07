package abstractt;

public class FileTester {
    public static void main(String[] args) {
           File[] files={new javaFile(545),new wordFile(23),new pdfFile(0)};
            for (int i=0;i<files.length;i++){
                File f=files[i];
                f.open();
                f.edit();
                f.close();
            }
            }
        }

