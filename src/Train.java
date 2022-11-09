public class Train extends Transport {
   private    double priceOfTrip;
    private    int travelTime;
    private   String departureStation;
    private   String finalStation;
    private   int numberOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, double priceOfTrip, int travelTime, String departureStation, String finalStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        setPriceOfTrip(priceOfTrip);
        setTravelTime(travelTime);
        setDepartureStation(departureStation);
        setFinalStation(finalStation);
        setNumberOfWagons(numberOfWagons);
    }


   public double getPriceOfTrip() {
        return priceOfTrip;
    }
    public void setPriceOfTrip(double priceOfTrip) {
        if (priceOfTrip != 0) {
            this.priceOfTrip = priceOfTrip;
        }
    }
        public int getTravelTime() {
        return travelTime;
    }
    public void setTravelTime(int travelTime) {
            if (travelTime != 0 ) {
                this.travelTime = travelTime;
            }
        }
        public String getDepartureStation() {
        return departureStation;
    }
    public void setDepartureStation(String departureStation) {
        if (departureStation != null || departureStation.isEmpty()) {
            this.departureStation = departureStation;
        }
    }
            public String getFinalStation () {
                return finalStation;
            }
            public void setFinalStation (String finalStation){
                if (finalStation != null || finalStation.isEmpty()) {
                    this.finalStation = finalStation;
                }
            }

            public int getNumberOfWagons () {
                return numberOfWagons;
            }
            public void setNumberOfWagons (int numberOfWagons){
                if (numberOfWagons != 0) {
                    this.numberOfWagons = numberOfWagons;
                }
            }
        }