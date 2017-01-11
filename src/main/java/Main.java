import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> customers = new HashMap<>();
        //tring [] string = {"89517625373","8445921251"};
        customers.put("Иван", new ArrayList<>(Arrays.asList("sf", "saf")));
        //customers.put("Иван", Collections.addAll(new {"da,ad,ad"}));


        for(String s : customers.keySet()){
            System.out.println(s + " имеет");
            for (String t : customers.get(s)){
                System.out.println("  " + t);
            }
        }

        //System.out.println("FIO");
    }
}
