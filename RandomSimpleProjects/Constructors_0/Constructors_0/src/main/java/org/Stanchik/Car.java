package org.Stanchik;

public class Car {
    String model; //модель
    int maxSpeed; //максимальная скорость
    int wheels; //ширина дисков
    double engineVolume; //объем двигателя
    String color; //цвет
    int yearOfIssue; //год выпуска
    String ownerFirstName; //имя владельца
    String ownerLastName; //фамилия владельца
    long price; //цена
    boolean isNew; //новая или нет
    int placesInTheSalon; //число мест в автомобиле
    String salonMaterial; //материал салона

    public Car (String model, int maxSpeed, int wheels, double engineVolume, String color,
                int yearOfIssue, String ownerFirstName, String ownerLastName, long price,
                boolean isNew, int placesInTheSalon, String salonMaterial)
    {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
        this.engineVolume = engineVolume;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.price = price;
        this.isNew = isNew;
        this.placesInTheSalon = placesInTheSalon;
        this.salonMaterial = salonMaterial;
    }

    public Car (String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

}

