package task2;

public class Bus extends Transport {
    @Override
    public void refill() {
        System.out.println ("Автобус можно заправлять бензином или дизелем ");
    }

    public Bus(String brand, String model, int productionYear, String assemblyCountry, String bodyColor,
               double maxSpeed) {
            super(brand, model, productionYear, assemblyCountry, bodyColor, maxSpeed);
    }
    public String toString() {
            return" Автобус - "+ getBrand()+ " , модель - "+ getModel()+"  , произведен в - "+ getProductionYear() +" году, страна-производитель - "
                    + getAssemblyCountry ()+" , цвет кузова - "+ getBodyColor()+" , максимальная скорость - "+ getMaxSpeed()+" км/ч.";
    }
}

