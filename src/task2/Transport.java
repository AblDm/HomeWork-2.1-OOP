package task2;

public abstract class Transport {
    String brand;
    String model;
    int productionYear;
    String assemblyCountry;
    String color;
    double maxSpeed;

    public Transport(String brand, String model, int productionYear, String assemblyCountry, String color) {
        this.brand = brand;
        this.model = model;
        if (isNullOrEmpty (color)){
            this.color = "black";
        } else {
            this.color=color;
        }
        this.productionYear = productionYear;
        this.assemblyCountry = assemblyCountry;

    }
    public abstract void refill ();
    public Transport(String brand,
                     String model,
                     int productionYear,
                     String assemblyCountry,
                     String color,
                     double maxSpeed) {
        this.brand = brand;
        this.model = model;
                if (isNullOrEmpty (color)){
            this.color = "black";
        } else {
            this.color=color;
        }
        this.productionYear = productionYear;
        this.assemblyCountry = assemblyCountry;
        this.maxSpeed= maxSpeed;
    }


    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getBodyColor() {
        return color;
    }
    public String getAssemblyCountry() {
        return assemblyCountry;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setBodyColor(String color) {
        if (isNullOrEmpty (color)) {
            color = " данные записаны некорректно";
        } else {
            this.color = color;
        }
    }


    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
    public static boolean isNullOrEmpty (String value) {
        return value == null || value.isBlank ();
    }
}