import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, ArrayList<String>> customers = new HashMap<>();

        customers.put("Иванов И.И.", new ArrayList<>(Arrays.asList("+8 800 2000 500", "+8 800 200 600")));
        customers.put("Петров П.П.", new ArrayList<>(Arrays.asList("+8 800 2000 700")));
        customers.put("Сидоров С.С.", new ArrayList<>(Arrays.asList("+8 800 2000 800","+8 800 2000 900","+8 800 2000 000")));
        customers.put("Васечкин В.В.", null);

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите пользователя: ");
            String s = in.nextLine().trim();

            String s1[] = customers.get(s).toArray(new String[customers.get(s).size()]);//номера телефонов в массив чтобы выводить с циферками
            for (int i = 1; i < s1.length + 1; i++) {
                System.out.println(i + ". " + s1[i - 1]);
            }
        }
        catch (java.lang.NullPointerException e){//если не найдется фамилии или будет отсутствовать номер
            System.out.println("Такого ФИО в БД нет!!!");
        }
    }
}
