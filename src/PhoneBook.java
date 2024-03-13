import com.sun.jdi.PrimitiveValue;

import java.awt.image.AreaAveragingScaleFilter;
import java.security.KeyStore;
import java.util.*;


public class PhoneBook {


    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public List<ArrayList<Integer>> phoneNum = new ArrayList<>(phoneBook.values());



    public void phoneBookList() {


        List<Map.Entry<String, ArrayList<Integer>>> entries = new ArrayList<>();


        for (var entry : phoneBook.entrySet()) {

            entries.add(entry);

        }


        Collections.sort(entries, new Comparator<Map.Entry<String, ArrayList<Integer>>>() {

            public int compare(Map.Entry<String, ArrayList<Integer>> a,
                               Map.Entry<String, ArrayList<Integer>> b) {
                if (a.getValue().size() - b.getValue().size() > 0)
                    return 1;
                if (a.getValue().size() - b.getValue().size() < 0)
                    return -1;
                return 0;
            }
        });
        System.out.println(entries);
//
//            phoneNum.entrySet()
//                    .stream()
//                    .sorted(Map.Entry.comparingByValue())
//                    .forEach(System.out::println);
//        for (var entry : phoneNum.entrySet()) {
//            String key = entry.getKey();
//            var value = entry.getValue();
//            System.out.println(key + ": "+ phoneNum.get(key));


    }

    static void add(String name, int phoneNum) {


        if (phoneBook.get(name) == null) {

            phoneBook.put(name, new ArrayList<>(Arrays.asList(phoneNum)));
            //phoneBook.get(name).add(phoneNum);
        } else
            phoneBook.get(name).add(phoneNum);
    }


    public static ArrayList<Integer> find(String name) {
        ArrayList<Integer> arFind = new ArrayList<>();
        if (phoneBook.get(name) != null)
            return arFind = phoneBook.get(name);
        else
            return arFind;
    }
}



