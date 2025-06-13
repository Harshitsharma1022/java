
import java.util.*;
public class hashandtreeset {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(10);
        hash.add(20);
        hash.add(30);
        System.out.println("HashSet: " + hash);


        hash.remove(10);
        System.out.println("HashSet after remove: " + hash);

        hash.clear();
        System.out.println("HashSet after clear: " + hash);

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(10);
        tree.add(20);
        tree.add(30);
        System.out.println("TreeSet: " + tree);


        tree.remove(10);
        System.out.println("TreeSet after remove: " + tree);

        tree.clear();
        System.out.println("TreeSet after clear: " + tree);


    }
}



