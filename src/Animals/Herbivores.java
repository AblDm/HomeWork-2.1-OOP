package Animals;

import java.util.Objects;

public class Herbivores extends Mammals{
    String mealsType;

    public Herbivores(String name, Integer age, String placement, String walkingSpeed, String mealsType) {
        super (name, age, placement, walkingSpeed);
         this.setMealsType (mealsType);
    }

    public String getMealsType() {
        return mealsType;
    }

    public void setMealsType(String mealsType) {
        if (!isNullOrEmpty (mealsType))
        {this.mealsType = mealsType;}
    }
        // проверка



    public static void graze(){};

    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void go() {

    }

    @Override
    public void walking() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        if (!super.equals (o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals (mealsType, that.mealsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash (mealsType);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                " mealsType= '" + mealsType + '\'' +
                ", placement='" + placement + '\'' +
                ", walkingSpeed='" + walkingSpeed + '\''+
                '}';

    }
// Газель, Жираф, Лошадь

}
