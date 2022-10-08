package task2;

public class Train extends Transport {
        double tripPrice;
        Integer travelTime;
        String departureStationName;
        String endingStation;
        int numberOfWagons;


        public Train(String brand, String model, int productionYear, String assemblyCountry, String bodyColor,double maxSpeed,double tripPrice, Integer travelTime, String departureStation, String endingStation, int numberOfWagons) {
            super(brand,model,productionYear,assemblyCountry,bodyColor,maxSpeed);
            this.setTripPrice (tripPrice);
            if(travelTime==null||travelTime<=0)
            {this.travelTime = 1;} else
            {this.travelTime = travelTime;}
            this.departureStationName = departureStation;
            this.endingStation = endingStation;
            this.numberOfWagons = numberOfWagons;
        }

    public double getTripPrice() {
        return tripPrice;
    }



    public void setTripPrice(double tripPrice) {
            if (tripPrice == 0 || tripPrice <=0)
        this.tripPrice = tripPrice;
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
    @Override
    public String toString() {
        return "Train{" +
                "tripPrice=" + tripPrice +
                ", travelTime=" + travelTime +
                ", departureStationName='" + departureStationName + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", numberOfWagons=" + numberOfWagons +
                '}';
    }

    public void refill() {
        System.out.println ("Поезд заправлеяется дизилем");
    }
}
