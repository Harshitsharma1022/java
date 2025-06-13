

import java.lang.reflect.Array;
import java.util.*;
class listiterator {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Rohit");
        list.add("Mohit");
        list.add("Rahul");
        list.add("Ram");
        list.add("Shyam");
        list.add("Sam");

        System.out.println("List" + list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String data = it.next();
            if (data.startsWith("R")) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}