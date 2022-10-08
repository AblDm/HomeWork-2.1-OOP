package Animals;

import java.util.Objects;

public class FlyBirds extends Birds{
    String typeOfGoing;

    public FlyBirds(String name, Integer age, String placement, String typeOfGoing) {
        super(name, age, placement);
        this.setTypeOfGoing (typeOfGoing);
    }

    @Override
    protected void eat() {

    }

    public String getTypeOfGoing() {
        return typeOfGoing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        if (!super.equals (o)) return false;
        FlyBirds flyBirds = (FlyBirds) o;
        return Objects.equals (typeOfGoing, flyBirds.typeOfGoing);
    }

    @Override
    public int hashCode() {
        return Objects.hash (super.hashCode (), typeOfGoing);
    }

    public void setTypeOfGoing(String typeOfGoing) {
        if (!isNullOrEmpty (typeOfGoing))
        {this.typeOfGoing = typeOfGoing;}
    }

    @Override
    public String toString() {
        return "FlyBirds{" +
                "typeOfGoing='" + typeOfGoing + '\'' +
                ", placement='" + placement + '\'' +
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
    public void fly (){};

}
