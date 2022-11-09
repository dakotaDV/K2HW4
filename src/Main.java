import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "в России", "АКПП", "хэтчбэк", "а555тл333", 6, false, 240);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный ", 2020, "в Германии", "АКПП", "седан", "л478гн963", 6, true, 240);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "в Германии", "МКПП", "хэтчбэк", "к777нг444", 5, true, 240); //подчеркивает
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "в Южной Корее", "МКПП", "седан", "а333чс5555", 6, false, 240);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "в Южной Корее", "АКПП", "хэтчбэк", "и223до789", 4, true, 240);

        Train lastochka = new Train(" Ласточка", " B-901", 2011, "Россия", " ", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирски", 8);


        Bus vector = new Bus("Вектор", "NEXT 8.8", 2019, "Россия", "белый", 220);
        Bus paz = new Bus("Паз", "4234", 2020, "Беларусь", "зеленый", 200);
        Bus kavz = new Bus("Кавз Аврора", "4235", 2021, "Россия", "красный", 180);

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

        printInfo(lastochka);
        printInfo(leningrad);

        printInfo(vector);
        printInfo(paz);
        printInfo(kavz);
    }

    public static void printInfo(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        " , год выпуска: " + car.getProductionYear() +
                        " , страна сборки: " + car.getProductionCountry() +
                        " , цвет кузова: " + car.getColor() +
                        " , объем двигателя : " + car.getEngineVolume() +
                        " , коробка передач: " + car.getTransmission() +
                        " , тип кузова: " + car.getBodyType() +
                        " , рег.номер: " + car.getRegistrationNumber() +
                        " , количество мест: " + car.getNumberOfSeats() +
                        ", " + ((car.isSummerTires()) ? "летняя" : "зимняя") + "резина" +
                        ", " + (car.getKey().isWithoutKeyAccess() ? "безключевой доступ" : "ключевой доступ") +
                        ", " + ((car.getKey().isRemoteRunEngine()) ? "удаленный запуск" : "ключевой запуск") +
                        ", номер страховки " + car.getInsurance().getNumber() +
                        ", стоимость страховки " + car.getInsurance().getCost() +
                        ", срок действия страхвки " + car.getInsurance().getExpireDate() +
                        ", максимальная скорость " + car.getMaxSpeed()

        );
    }

    public static void printInfo(Train train) {
        System.out.println(
                "Поезд" + train.getBrand() +
                        ", модель " + train.getModel() +
                        train.getProductionYear() + ", год выпуска в " + train.getProductionCountry() +
                        " скорость передвижения - " + train.getMaxSpeed() +
                        ", отходит от станции " + train.getDepartureStation() +
                        " и следует до станции " + train.getFinalStation() +
                        ". Цена поездки - " + train.getPriceOfTrip() + " рублей, " +
                        " в поезде " + train.getNumberOfWagons() + " вагонов." +
                        ", максимальная скорость " + train.getMaxSpeed()
        );
    }

    public static void printInfo(Bus bus) {
        System.out.println(
               "Автобус " + bus.getBrand() + " " + bus.getModel()+
                        ", год выпуска " + bus.getProductionYear() +
                        ", страна сборки " + bus.getProductionCountry() +
                        ", цвет кузова: " + bus.getColor() +
                        ", максимальная скорость " + bus.getMaxSpeed()

        );


    }
}