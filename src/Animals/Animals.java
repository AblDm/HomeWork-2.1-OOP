package Animals;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {
    protected String name;
    protected  Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!isNullOrEmpty (name))
        { this.name=name;}
    }

    public Integer getAge() {
        return age;
    }
 // проверка на значение
    public void setAge(Integer age) {
        if (age!=0&& age>=0)
        {  this.age = age;} else {
            System.out.println ("Установите верное значение возраста");
        }
    }

    public Animals(String name, Integer age) {
        this.setName (name);
        this.setAge (age);
    }

    protected abstract void eat();
    protected abstract void sleep();
    protected abstract void go();

    @Override
    public int hashCode() {
        return Objects.hash (name, age);
    }

    public static boolean isNullOrEmpty (String value) {
        return value == null || value.isBlank ();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals (obj);
    }
}
