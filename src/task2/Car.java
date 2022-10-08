package task2;

import java.time.LocalDate;

public class Car extends Transport {


    private double engineVolume;
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
               String assemblyCountry,
               String transmission,
               String bodyType,
               String registrationNumbers,
               Integer numberOfSteam,
               boolean seasonTyres
    ) {
        super(brand, model, productionYear, assemblyCountry, color);
        if (engineVolume == 0){
            this.engineVolume = 1.6;
        } else {
            this.engineVolume = engineVolume;
        }

        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumbers = registrationNumbers;
        this.numberOfSteam = numberOfSteam;
        this.seasonTyres = seasonTyres;

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

    @Override
    public void refill() {
        System.out.println ("Машина заправлеяется дизилем, или бензином, или заряжаяется электричеством");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSteam() {
        return numberOfSteam;
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
        private boolean keylessAccess;

    public Key(boolean remoteLaunch, boolean keylessAcceess) {
        this.remoteLaunch = remoteLaunch;
        this.keylessAccess = keylessAcceess;
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
    public static boolean isNullOrEmpty (String value) {
        return value == null || value.isEmpty ();
    }
}



