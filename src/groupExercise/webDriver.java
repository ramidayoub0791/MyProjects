package groupExercise;
public interface webDriver{
void open();
void close();
String getTitle();
}
interface takeScreenShot {
    void getScreenShot();
}
interface remoteWebDriver extends webDriver,takeScreenShot{
    void navigate();
}

 class chromeDriver implements remoteWebDriver{
     String title="Google Chrome";
     @Override
     public void open() {
         System.out.println("open : https://www.google.ca/");
     }

     @Override
     public void close() {
         System.out.println("close : https://www.google.ca/");
     }

     @Override
     public String getTitle() {
         return title;
     }

     @Override
     public void navigate() {
         System.out.println("navigate to chromeDriver ..!");
     }
    public void getScreenShot(){
        System.out.println(" take screenShot please ");
     }
 }
 class fireFoxDriver implements remoteWebDriver{
     String title="FireFox";
     @Override
     public void open() {
         System.out.println("open https://www.mozilla.org/en-US/firefox/");
     }

     @Override
     public void close() {
         System.out.println("close https://www.mozilla.org/en-US/firefox/");
     }

     @Override
     public String getTitle() {
         return title;
     }

     @Override
     public void navigate() {
         System.out.println("navigate to FireFox");
     }

     @Override
     public void getScreenShot() {
         System.out.println("will get a screenShot of FireFox");
     }
 }
 class safariDriver implements remoteWebDriver{
     String title="safari";
     @Override
     public void open() {
         System.out.println("open safari");
     }

     @Override
     public void close() {
         System.out.println("close safari");
     }

     @Override
     public String getTitle() {
         return title;
     }

     @Override
     public void navigate() {
         System.out.println("navigate to safari");
     }

     @Override
     public void getScreenShot() {
         System.out.println("get a Screen shot of safari");
     }
 }
/* 4. Provide Implementation for the diagram below. Then
create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and
see which methods available to them.*/