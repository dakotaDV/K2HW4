
public abstract class Transport {

protected String brand;
    protected String model;
    protected int productionYear;
    protected String productionCountry;
    protected String color;
    protected int maxSpeed;
    protected String statusRefill;


    public Transport( String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String statusRefill) {
        setStatusRefill(statusRefill);
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setColor(color);
        setMaxSpeed(maxSpeed);

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null || color.isEmpty()) {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed (int setMaxSpeed) {
       if (maxSpeed <= 0) {
           this.maxSpeed = 220;
       }else{
            this.maxSpeed = maxSpeed;
        }
    }
    public String getStatusRefill() {
        return statusRefill;
    }

    public void setStatusRefill(String statusRefill) {
        this.statusRefill = statusRefill;
    }
    protected abstract void refill(Boolean gasoline, Boolean diesel, Boolean electro);

}

