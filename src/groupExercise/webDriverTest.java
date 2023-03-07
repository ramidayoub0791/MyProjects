package groupExercise;

public class webDriverTest {
    public static void main(String[] args) {
        remoteWebDriver[]webs={new chromeDriver(),new fireFoxDriver(),new safariDriver()};
        for (remoteWebDriver web:webs){
            web.navigate();
            web.open();
            web.close();
            web.getScreenShot();
            System.out.println("we got finished using "+web.getTitle());
            System.out.println("----------------------------------------------");
        }
    }
}
