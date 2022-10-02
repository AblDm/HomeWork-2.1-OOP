package task2;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final Integer productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumbers;
    private final int numberOfSteam;
    private boolean seasonTyres;

    //private Key key;
    //private Insurance insurance


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               Integer productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumbers,
               int numberOfSteam,
               boolean seasonTyres) {
        this.brand = brand;
        this.model = model;

        if (engineVolume == 0){
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }
        if (isNullOrEmpty (color)){
            this.color = "black";
        } else {
            this.color=color;
        }
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumbers = registrationNumbers;

        this.numberOfSteam = numberOfSteam;
        this.seasonTyres = seasonTyres;
    }

    public Car(String brand, String model, Integer productionYear, String productionCountry, String bodyType, int numberOfSteam) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.bodyType = bodyType;
        this.numberOfSteam = numberOfSteam;


    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumbers() {
        return registrationNumbers;
    }

    public void setRegistrationNumbers(String registrationNumbers) {
        this.registrationNumbers = registrationNumbers;
    }

    public boolean isSeasonTyres() {
        return seasonTyres;
    }

    public void setSeasonTyres(boolean seasonTyres) {
        this.seasonTyres = seasonTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSteam() {
        return numberOfSteam;
    }

    public static boolean isNullOrEmpty (String value) {
        return value == null || value.isBlank ();
}
public void changeTiers () {
        this.seasonTyres = !this.seasonTyres;
}
public boolean checkNumber () {

    if (this.registrationNumbers.length () < 8) {
        System.out.println ("неправильный регистрационный номер");
        return false;
    }
    char [] numbers = this.registrationNumbers.toCharArray ();
    if(!Character.isAlphabetic (numbers[0])){
        System.out.println ("неправильный регистрационный номер");
        return false;
    }
    if(!Character.isDigit (numbers[1])){
        System.out.println ("неправильный регистрационный номер");
        return false;
    }
    if(!Character.isDigit (numbers[2])){
        System.out.println ("неправильный регистрационный номер");
        return false;
    }
    if(!Character.isDigit (numbers[3])){
        System.out.println ("неправильный регистрационный номер");
        return false;
    }
    if(!Character.isAlphabetic (numbers[4])){
        System.out.println ("неправильный регистрационный номер");
        return false;
    }
    if(!Character.isAlphabetic (numbers[5])){
        System.out.println ("неправильный регистрационный номер");
        return false;
    }
    if(!Character.isDigit (numbers[6])){
        System.out.println ("неправильный регистрационный номер");
        return false;}
    if(!Character.isDigit (numbers[7])){
        System.out.println ("неправильный регистрационный номер");
        return false;}
    if(!Character.isDigit (numbers[8])){
        System.out.println ("неправильный регистрационный номер");
        return false;}

    return true;
}
public static class Key {
        private boolean remoteLaunch;
        private boolean keylessAcceess;

    public Key(boolean remoteLaunch, boolean keylessAcceess) {
        this.remoteLaunch = remoteLaunch;
        this.keylessAcceess = keylessAcceess;
    }
}
public static class Insurrance {
        private final LocalDate validUntil;
        private final double cost;
        private final String insurranceNumber;

    public Insurrance(LocalDate validUntil, double cost, String insurranceNumber) {
        this.validUntil = validUntil;
        if (validUntil.isBefore (LocalDate.now ())){
            System.out.println ("Срок страховки истёк");}

        if (insurranceNumber.length () < 9) {
            System.out.println ("Слишком короткий номер");
        }

        if (insurranceNumber.length () > 9) {
            System.out.println ("Слишком длинный номер");
        }
        this.cost = cost;
        this.insurranceNumber = insurranceNumber;
    }
}
}



