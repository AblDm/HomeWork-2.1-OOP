package Animals;

import java.util.Objects;

public class NoFlyBirds extends Birds{
    String typeOfGoing;

    @Override
    public String toString() {
        return "NoFlyBirds{" +
                "typeOfGoing='" + typeOfGoing + '\'' +
                ", placement='" + placement + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        if (!super.equals (o)) return false;
        NoFlyBirds that = (NoFlyBirds) o;
        return Objects.equals (typeOfGoing, that.typeOfGoing);
    }

    @Override
    public int hashCode() {
        return Objects.hash (super.hashCode (), typeOfGoing);
    }

    public NoFlyBirds(String name, Integer age, String placement, String typeOfGoing) {
        super(name, age, placement);
        this.setTypeOfGoing (typeOfGoing);
    }

    public String getTypeOfGoing() {
        return typeOfGoing;
    }

    public void setTypeOfGoing(String typeOfGoing) {
        if (!isNullOrEmpty (typeOfGoing))
        {this.typeOfGoing = typeOfGoing;}
    }

    public void wanting(){};

    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void go() {

    }
}
