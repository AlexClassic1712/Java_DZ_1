import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.KeyStore;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;


public class PhoneBook implements Comparable<PhoneBook> {


    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

   private ArrayList<Integer> phoneNum = new ArrayList<>();

    public void PhoneBook( String name,int phoneNum) {
            phoneBook.put(name, new ArrayList<>(Arrays.asList(phoneNum)));
             this.phoneNum.add(phoneBook.get(name).size());
    }



    static void add(String name, int phoneNum) {


        if (phoneBook.get(name) == null) {

            phoneBook.put(name, new ArrayList<>(Arrays.asList(phoneNum)));
            //phoneBook.get(name).add(phoneNum);
        } else
            phoneBook.get(name).add(phoneNum);
    }
//    public static HashMap<String, ArrayList<Integer>> sortByValue(HashMap<String, ArrayList<Integer>> hm)
//    {
//        // Create a list from elements of HashMap
//        Set<Map.Entry<String, ArrayList<Integer>>> list = phoneBook.entrySet();
//
//        // Sort the list
//        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList<Integer>> >() {
//


//            public int compare(Map.Entry<String, ArrayList<Integer>> o1,
//                               Map.Entry<String, ArrayList<Integer>> o2)
//            {
//                return (o1.getValue()).compareTo(o2.getValue());
//            }
//        });
//
//        // put data from sorted list to hashmap
//        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
//        for (Map.Entry<String, Integer> aa : list) {
//            temp.put(aa.getKey(), aa.getValue());
//        }
//        return temp;
//    }


    public static void PhoneBook1() {


        Collection.sort(phoneBook, new Comparator<Map.Entry<String, ArrayList<Integer>>(){
            @Override
            public int compare(KeyStore.Entry<String, List<Integer>> o1, KeyStore.Entry<String, List<Integer>> o2){

            }
        });


    }


  /*  public static HashMap<String, ArrayList<Integer>> getByPassNum() {
        return phoneBook;
    }*/

    public static ArrayList<Integer> find(String name) {
        ArrayList<Integer> arFind = new ArrayList<>();
        if (phoneBook.get(name) != null)
            return arFind = phoneBook.get(name);
        else
            return arFind;
    }

    @Override
    public int compareTo(PhoneBook o) {


        return this.getPhoneBook()-o.getPhoneBook() ;
    }
}



