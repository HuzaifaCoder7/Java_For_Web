import java.util.*;

public class t4_arraylist {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // arr.add(5);
        // arr.add(4);
        // arr.add(3);
        // System.out.println(arr.get(2));
        ArrayList<String> cars = new ArrayList<String>();
        Scanner obj = new Scanner(System.in);
        System.out.println("How many cars you want to add?");
        int inp = obj.nextInt();
        int cno = 0;
        for(int i = 0; i <= inp; i++){
            System.out.println("Enter car no "+cno);
            String input = obj.nextLine();
            cno++;
            cars.add(input);
        }
        System.out.println(cars);
    }
}
