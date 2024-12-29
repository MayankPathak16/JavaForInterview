package syncheron;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SyncheronQues {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Orange", "Banana", "Apple", "Orange");
        //hashset
        HashSet<String> h1 = new HashSet<>(names);
        //TreeSet
       // Noduplicate nd = new NoDuplicate();
        //TreeSet<String> h2 = new TreeSet<>(names);
      //  System.out.println(h1.equals(h2));
    }
}
