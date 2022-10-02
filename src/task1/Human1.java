package task1;

public class Human1 {

    String name;
    private String town;
    int age;
    String job;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 1000) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (!town.isEmpty () && town != null && !town.isBlank ())
        { this.town = town;} else {
            this.town = "Информация не указана";
        }
    }

    Human1(String name, String town, Integer age, String job) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
        this.setTown(town);
        this.setAge (age);

    }
        //Если не указано имя, город проживания или должность, то программа должна подставить значение
        //"Информация не указана" при выводе в консоль.
    //вариант ищз урока
    // public void Human1 (String town, Integer age, String job)
   // { this ("Информация не указана", this.town, this.age, this.job);}

    //"Привет! Меня зовут …. Я из города …. Мне … лет. Я работаю на должности… . Будем знакомы!"


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + getTown () +
                ". Мне " + getAge() +" лет. Я работаю на должности "+ job
                + ". Будем знакомы!";
    }
}
