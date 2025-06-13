import java.util.*;
class prevlistit {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rohit");
        list.add("Mohit");
        list.add("Rahul");
        list.add("Ram");
        list.add("Shyam");
        list.add("Sam");

        System.out.println("List" + list);
        ListIterator<String> it = list.listIterator();
        // Forward iteration
        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);
        }
        System.out.println("hiiiiii");
        // Backward iteration
        while (it.hasPrevious()) {
            String PreviousData = it.previous();
            System.out.println(PreviousData);


        }
    }
}