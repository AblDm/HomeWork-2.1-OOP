package task1;

import java.time.LocalDate;

class Human {

    String name;
   private String town;

   String job;
   private Integer yearOfBirth;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        if (!town.isEmpty () && town != null && !town.isBlank ())
        {this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth != null){
        this.yearOfBirth = yearOfBirth;}
        else {yearOfBirth=0;}
    }
    public Human(String name, String town, int age) {
        this.setTown (town);
        this.setName (name);
        this.setYearOfBirth (LocalDate.now ().getYear () - age);
    }
    //Для полей класса, в которых хранится информация о городе проживания и дате рождения, настройте доступ private и напишите геттеры и сеттеры для данных полей.
    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() +
                ". Я из города " + getTown () +
                ". Я родился в " + getYearOfBirth() +
                " году. Будем знакомы!" ;
    }

}

