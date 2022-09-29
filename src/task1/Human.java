package task1;

public class Human {


    String name;
    String town;
    int age;
    String job;
    int yearOfBirth;




    public Human(String name, String town, int age) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        this.yearOfBirth = java.time.LocalDate.now ().getYear () - age;
        if (yearOfBirth < 0) {
            yearOfBirth = 0;
        }
    }

    //.gitignore
    //Привет! Меня зовут …. Я из города …. Я родился в … году. Будем знакомы!
    // так как возраст не может быть
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth +
                " году. Будем знакомы!" ;
    }

}

