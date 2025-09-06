import java.util.ArrayList;
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Сегодня в зоопарке можно увидеть кормления животных.");
        animals.add("Это будут:");
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        animals.add("Расписание кормлений:");
        animals.add("В 9:00 - " );
        animals.add("В 10:00 - " );
        animals.add("В 11:00 - " );
        animals.add("В 12:00 - " );
        animals.add("В 13:00 - " );

       int AnimSize = animals.size();

       for (String animal : animals){
        System.out.println(animal);
       }
    }
}