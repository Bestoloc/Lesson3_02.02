import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");
        System.out.println("Это будут:");
        for (String animal : animals){
            System.out.println(animal);
        }
        System.out.println("Расписание кормлений:");
        System.out.println("В 9:00 - " + animals.get(1));
        System.out.println("В 10:00 - " + animals.get(4));
        System.out.println("В 11:00 - " + animals.get(0));
        System.out.println("В 12:00 - " + animals.get(2));
        System.out.println("В 13:00 - " + animals.get(3));

        Scanner scan = new Scanner(System.in);
        int menu = 1;
        while (menu != 0){
            System.out.println("Выберите, что хотите сделать ->");
            System.out.println("1 - Показать список всех животных");
            System.out.println("2 - Добавить животное в список");
            System.out.println("3 - Удалить животное(Не работает)");
            System.out.println("4 - Очистить список");
            System.out.println("0 - Выйти");
            menu = scan.nextInt();

            switch(menu){
                case 1:
                    AllAnimals(animals);
                    break;
                case 2:
                    AddAnimals(animals);
                    break;
                case 4:
                    DeleteAllAnimals(animals);
                    break;
                default:
                    menu = 0;
                    System.out.println("До встречи!");
                    break;
            }

        }
    }
    public static void AllAnimals(ArrayList<String> animals){
        if (!animals.isEmpty()){
            for (String animal : animals){
                System.out.println(animal);
            }
        }
        else{
            System.out.println("Список пуст!");
        }
    }
    public static void AddAnimals(ArrayList<String> animals){
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите, какое животное вы хотите добавить:");
        String NewAnimal = scan.next();
        animals.add(NewAnimal);
        System.out.println("Животное " + NewAnimal + " успешно добавлено!");
    }
    public static void DeleteAllAnimals(ArrayList<String> animals){
        Scanner scan = new Scanner(System.in);
        System.out.println("Очистить список?");
        System.out.println("1 - Да\n2 - Нет");
        Integer answer = scan.nextInt();
        if (answer == 1){
            if (!animals.isEmpty()){
                animals.clear();
                System.out.println("Список очищен.");
            }
            else{
                System.out.println("Список пуст!");
            }
        }
        else{
            System.out.println("Вы передумали");
        }
    }
}
