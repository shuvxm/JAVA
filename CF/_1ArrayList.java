import java.util.ArrayList;
import java.util.List;

public class _1ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(80);

        list.remove(Integer.valueOf(10));
        System.out.println(list);
        
        // List<Integer> list1 = List.of(4,5,6,7,8,9);
        // list.addAll(list1);
        // // System.out.println(list);

        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i)); // to get the elements bvased on index
        // }
        
       
    }
}

/*
    System.out.println(list.size());
        list.add(10);
        list.add(80);
        list.add(50);

        System.out.println(list.size());
        for (int x : list) {
            System.out.println(x);
        }


          ArrayList<Integer> list = new ArrayList<>(1000);
        System.out.println(list.size());  // 0
        System.out.println(list.get(0));  // givesexception bcz no element present
       
 */