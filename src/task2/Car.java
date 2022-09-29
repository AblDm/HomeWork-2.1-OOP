package task2;

public class Car {
    String brand;


    String model;
    double engineVolume;
    String color;
    Integer productionYear;
    String productionCountry;
    public Car(String brand, String model, double engineVolume, String color,
               Integer productionYear, String productionCountry) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <=0.0 || engineVolume >=100.0 ) {
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume ;
        }
        if (color == null ) {
            this.color = "белый" ;
        } else {
            this.color = color ;
        }
        if (productionYear == null ) {
            this.productionYear = 2000;  ;
        } else if  (productionYear <=1885 || productionYear <= java.time.LocalDate.now ().getYear ()){
            this.productionYear = 2000;
        }else {this.productionYear = productionYear;}
//     если else if вложенный оператор его можно исключить из кода
        if (productionCountry == null ) {
            this.productionCountry = "default";  ;
        } else {
            this.productionCountry = productionCountry;
        }
    }
    public Car(String brand, String model, String color,
               Integer productionYear, String productionCountry)
    {
        new Car (this.brand, this.model, 1.5, this.color, this.productionYear, this.productionCountry);
    }

}
