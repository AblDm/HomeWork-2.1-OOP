package Animals;

public abstract class Birds extends Animals {
    String placement;
    public static void hunting(){};

    public Birds(String name, Integer age, String placement) {
        super(name, age);
        this.setPlacement(placement);
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        if (!isNullOrEmpty (placement))
        {this.placement = placement;}
    }
}
