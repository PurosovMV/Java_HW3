import java.util.*;
/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max() */

public class task02 {
  public static void main(String[] args) {
    arr(rnd());
  }

  public static ArrayList<Integer> rnd() {
    Random rnd = new Random();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      int val = rnd.nextInt(-100, 100);
      list.add(val);
    }
    System.out.println(list);
    return list;
  }

  static void arr(ArrayList<Integer> list1) {
    int min = Collections.min(list1);
    int max = Collections.max(list1);
    float sum = 0;
    for (int i = 0; i < list1.size(); i++) {
      sum += Integer.valueOf(list1.get(i));
    }
    float average = sum / list1.size();
    System.out.println(min);
    System.out.println(max);
    System.out.println(average);

  }
}