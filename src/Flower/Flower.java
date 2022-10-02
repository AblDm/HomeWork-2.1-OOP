package Flower;


public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flower(String name, String flowerColor, String country, double cost, Integer lifeSpan) {
        this.name =name;
        this.setFlowerColor (flowerColor);
        this.setCountry (country);
        this.setCost (cost);
        this.setLifeSpan (lifeSpan);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null)
        {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public String getCountry() {


        return country;
    }

    public void setCountry(String country) {
        if (!country.isEmpty () && country != null && !country.isBlank ())
        {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <=0) {
            this.cost = 1.00;
        } else {
            this.cost =cost;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <=0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan =lifeSpan;
        }
    }
}