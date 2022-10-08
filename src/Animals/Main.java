package Animals;

public class Main {
    public static void main(String[] args) {
        // Herbivores : Газель, Жираф, Лошадь
        // Predators : Гиена, Тигр, Медведь

        Herbivores gazelle = new Herbivores ("Газелька", 2, "Равнина", "Быстра", "Мятлик");
        System.out.println (gazelle);
        Herbivores giraffe =  new Herbivores ("Жирафушка", 3, "Саванна" , "таинственно бродит", "Листва");
        System.out.println (giraffe);
        Herbivores horse =  new Herbivores ("Лошадка", 3, "Прерии" , "Скачет", "Мятлик");
        System.out.println (horse);

        System.out.println ("Есть ли копии:");
        System.out.println (gazelle.equals (giraffe));
        System.out.println (gazelle.equals (horse));
        System.out.println (giraffe.equals (horse)+ "\n");

        Predators hyena = new Predators ("Гиена", 4, "Прерии" , "бегает-прыгает", "Мясо");
        System.out.println (hyena);
        Predators tiger = new Predators ("Тигр", 5, "Леса" , "бегает-прыгает", "Мясо");
        System.out.println (tiger);
        Predators bear = new Predators ("Медведь", 4, "Прерии" , "бегает-прыгает", "Мясо");
        System.out.println (bear);
        System.out.println ("Есть ли копии:");
        System.out.println (hyena.equals (bear));
        System.out.println (hyena.equals (tiger));
        System.out.println (bear.equals (tiger)+ "\n");

        Amphibians frog = new Amphibians ("Жабка",1, "озеро");
        System.out.println (frog);
        Amphibians snake = new Amphibians ("Уж",2, "озеро");
        System.out.println (snake);
        System.out.println (frog.equals (snake)+ "\n");

        NoFlyBirds peacock = new NoFlyBirds ("павлин", 2,"Южная азия", "Ходит");
        System.out.println (peacock);
        NoFlyBirds penguin = new NoFlyBirds ("пингвин", 2,"Антарктида", "Ходит, плавает");
        System.out.println (penguin);
        NoFlyBirds dodo = new NoFlyBirds ("додо", 2,"океания", "Ходит, бегает");
        System.out.println (dodo);

        System.out.println (peacock.equals (penguin));
        System.out.println (peacock.equals (dodo));
        System.out.println (penguin.equals (dodo)+ "\n");

        FlyBirds seagull = new FlyBirds ("Чайка", 1, "морское повережье", "полёт, хлодбьба");
        System.out.println (seagull);
        FlyBirds albatross = new FlyBirds ("Альбатрос", 1, "морское повережье", "полёт, хлодбьба");
        System.out.println (albatross);
        FlyBirds falcon = new FlyBirds ("Сокол", 2, "Горы", "полёт, хлодбьба");
        System.out.println (falcon);

        System.out.println (seagull.equals (falcon));
        System.out.println (seagull.equals (albatross));
        System.out.println (falcon.equals (albatross)+ "\n");


    }
}
