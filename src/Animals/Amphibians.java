package Animals;

import java.util.Objects;

public class Amphibians extends Animals{

    protected String placement;

    public Amphibians(String name, Integer age, String placement) {
        super(name, age);
        this.setPlacement (placement);
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        if (!isNullOrEmpty (placement)){
        this.placement = placement;}
    }

    public static void hunting(){};

    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        if (!super.equals (o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals (placement, that.placement);
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "placement='" + placement + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash (super.hashCode (), placement);
    }

    @Override
    protected void go() {

    }
    public static boolean isNullOrEmpty (String value) {
        return value == null || value.isBlank ();
    }


}
