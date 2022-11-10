public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String statusRefill) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, statusRefill);
    }

    @Override
    protected void refill(Boolean benzin, Boolean diesel, Boolean electro) {
        if(benzin || diesel ) {
            statusRefill = "заправлен";
        }else{
            statusRefill = "не заправлен";
        }
    }




}
