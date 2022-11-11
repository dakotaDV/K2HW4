import java.security.Key;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean summerTires;
    private Key key;
    private Insurance insurance;


    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }


    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerTires, int maxSpeed, String statusRefill ) {
      super(brand, model, productionYear, productionCountry, color, maxSpeed,statusRefill);

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (summerTires == true) {
            this.summerTires = true;
        } else {
            this.summerTires = summerTires;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance =insurance;
        }

        //public void changeTyres () { //подчеркивает
        //  summerTires = !summerTires;
        //  }

        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return;
        }

       // System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, " + "сборка  " + productionCountry + ", " + color + " цвета, " + "объем двигателя" + " коробка передач" + transmission + " тип кузова " + bodyType + " регистрационный номер " + registrationNumber + " количество мест " + numberOfSeats + " резина" + summerTires);

    }



    @Override
    protected void refill(Boolean benzin, Boolean diesel, Boolean electro) {
        if(benzin || diesel || electro) {
            statusRefill = "заправлен";
        }else{
            statusRefill = "не заправлен";
        }
    }

    public static class Key {

        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {

        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }
        public Insurance(){
            this(null, 10000, null);
        }
        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
        public void checkExpireDate(){
            if(expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now()) ){
                System.out.println("Нужно срочно оформлять новую страховку");
            }
        }
        public void checkNumber(){
            if(number.length() != 9){

                System.out.println("Номер страховки некорректный");
            }
        }
    }
}

