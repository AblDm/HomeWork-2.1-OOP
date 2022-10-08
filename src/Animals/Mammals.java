package Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    protected String placement;
    protected String walkingSpeed;



    public Mammals (String name, Integer age, String placement, String walkingSpeed) {
        super (name, age);
        this.setPlacement (placement);
        this.setWalkingSpeed (walkingSpeed);

    }

    public String getPlacement() {
        return placement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        if (!super.equals (o)) return false;
        Mammals mammals = (Mammals) o;
        return Objects.equals (placement, mammals.placement) && Objects.equals (walkingSpeed, mammals.walkingSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash (placement, walkingSpeed);
    }

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    public String getWalkingSpeed() {
        return walkingSpeed;
    }

    public void setWalkingSpeed(String walkingSpeed) {
       this.walkingSpeed = walkingSpeed;
    }

    public abstract void walking();

    public static boolean isNullOrEmpty (String value) {
        return value == null || value.isEmpty ();
    }

}
