import java.util.*;


public class task03
{
    public static void main(String[] args) {
      printPlanets();
      }
    static void printPlanets() {
        Random random = new Random();
        String[] list = {"Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун"};
        List<String> newList = new ArrayList<String>();
        for (int i = 0; i < list.length; i++) {
            newList.add(list[random.nextInt(list.length)]);
        }
        System.out.println(newList);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " встречается " + Collections.frequency(newList, list[i]) + " раз(а)");
        }
        
    }
}