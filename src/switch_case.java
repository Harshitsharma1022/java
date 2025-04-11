import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");

        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thuresday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("tum is desh ka nhi ho");
        }
    }


}
