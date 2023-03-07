package HashMap;

import java.util.HashMap;

public class duty {
    public static void main(String[] args) {

        HashMap<Integer, String> build = new HashMap<>();
        build.put(1,"Google");
        build.put(2,"syntax");
        build.put(3,"tesla");
        build.put(4,"facebook");
        build.put(3,"youtube");
        build.put(6,"tweeter");
        build.put(7,"Google");

        System.out.println(build.size());
        build.replace(4,"yahoo");
        build.remove(7);
        System.out.println(build);

    }
}
/*Create a map of a building. Store floor number and it is associated company name.
 (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map*/