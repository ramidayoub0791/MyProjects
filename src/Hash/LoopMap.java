package Hash;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class LoopMap {
    public static <Iterator> void main(String[] args) {


       LinkedHashMap<String, Integer> classroomMap = new LinkedHashMap<>();
        classroomMap.put("Table", 20);//Entry<Key, Value>
        classroomMap.put("Chair", 60);//Entry<String, Integer>
        classroomMap.put("Screen", 3);
        classroomMap.put("Student", 60);
        classroomMap.put("Instructor", 3);

        Set<Map.Entry<String, Integer>> entrySet = classroomMap.entrySet();
        System.out.println("---------using for each loop to get all entry objects");


        for (Map.Entry<String, Integer> ent: entrySet) {
            System.out.println(ent.getKey() + ":" + ent.getValue());
        }
        System.out.println("---------using iterator to get all entry objects");
        java.util.Iterator<Map.Entry<String, Integer>> Iterator = (java.util.Iterator<Map.Entry<String, Integer>>) entrySet.iterator();
        while (Iterator.hasNext()) {
            Map.Entry<String, Integer> ent = Iterator.next();
            String entry = ent.getKey() + "----" + ent.getValue();
            System.out.println(entry);
        }
    }
}