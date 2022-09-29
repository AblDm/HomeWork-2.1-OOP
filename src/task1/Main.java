package task1;

public class Main {
    public static void main(String[] args) {

        //1. Максим из города Минск, которому 35 лет
        //2. Максим работает бренд-менеджером
        Human max1= new Human ("Максим", "Минск", 35);
        Human1 max2= new Human1 ("Максим", "Минск", 35, "бренд-менеджер");
        System.out.println (max1);
        System.out.println (max2);
        //1. Аня из города Москва, которой 29 лет
        //2. Аня работает методистом образовательных программ.
        Human anna1 = new Human ("Аня","Москва",29);
        Human1 anna2 = new Human1  ("Аня","Москва",29,"методист образовательных программ");
        System.out.println (anna1);
        System.out.println (anna2);
        //1. Катя из города Калининград, которой 28 лет
        //2. Катя работает продакт-менеджером
        Human kate1 = new Human ("Катя", "Калининград", 28);
        Human1 kate2 = new Human1("Катя", "Калининград", 28,"продакт-менеджер");
        System.out.println (kate1);
        System.out.println (kate2);
        //Артем из города Москва, которому 27 лет
        //Артем работает директором по развитию бизнеса
        Human artem1 = new Human ("Артем", "Москва",27);
        Human1 artem2 = new Human1 ("Артем", "Москва",27,"директор по развитию бизнеса");
        System.out.println (artem1);
        System.out.println (artem2);

    }




}