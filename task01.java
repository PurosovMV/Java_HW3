import java.util.*;


public class task01
{
    public static void main(String[] args) {
      arr(rnd());
     }
    public static ArrayList<Integer> rnd () {
    Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list.add(val);
            }
      System.out.println(list);
      return list;
    }
    static void arr (ArrayList<Integer>list1){
      int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.print(list1);
      
    }
    }