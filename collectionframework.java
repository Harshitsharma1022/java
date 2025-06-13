import java.util.*;
public class collectionframework {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println("List: "+ arr);

        arr.get(0);
        System.out.println( arr.get(0));

        arr.set(0, 50);
        System.out.println(arr.set(0, 50));



        arr.remove(0);
        System.out.println("List after remove: " + arr);

        arr.clear();
        System.out.println( "List after clear: " + arr);

        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(10);
        linked.add(20);
        linked.add(30);
        System.out.println("LinkedList: " + linked);

        linked.get(0);
        System.out.println(linked.get(0));

        linked.set(0, 50);
        System.out.println(linked.set(0, 50));

        linked.remove(0);
        System.out.println("LinkedList after remove: " + linked);

        linked.clear();
        System.out.println("LinkedList after clear: " + linked);

    }
}