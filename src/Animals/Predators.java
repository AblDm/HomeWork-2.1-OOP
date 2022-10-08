package Animals;

import java.util.Objects;

public class Predators extends Mammals {
    String mealsType;

    public static void hunting(){};

    public Predators(String name, Integer age, String placement, String walkingSpeed, String mealsType) {
        super (name, age, placement, walkingSpeed);
        this.setMealsType (mealsType);
    }

    @Override
    protected void eat() {

    }

    public String getMealsType() {
        return mealsType;
    }

    @Override
    public int hashCode() {
        return Objects.hash (super.hashCode (), mealsType);
    }

    public void setMealsType(String mealsType) {
        if (!isNullOrEmpty (mealsType))
        { this.mealsType = mealsType;}
    }

    @Override
    public String toString() {
        return "Predators{" +
                "mealsType='" + mealsType + '\'' +
                ", placement='" + placement + '\'' +
                ", walkingSpeed='" + walkingSpeed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void go() {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals (obj);
    }

    @Override
    public void walking() {

    }
    //Гиена, Тигр, Медведь
}
