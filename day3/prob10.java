package day3;

class Transport {
    String transportType;

    Transport(String transportType) {
        this.transportType = transportType;
    }
}

class RoadT extends Transport {
    String roadType;

    RoadT(String transportType, String roadType) {
        super(transportType);
        this.roadType = roadType;
    }
}

class Bus extends RoadT {
    int busNumber;

    Bus(String transportType, String roadType, int busNumber) {
        super(transportType, roadType);
        this.busNumber = busNumber;
    }

    void show() {
        System.out.println("Transport Type: " + transportType);
        System.out.println("Road Type: " + roadType);
        System.out.println("Bus Number: " + busNumber);
    }
}

class Car extends RoadT {
    String carModel;

    Car(String transportType, String roadType, String carModel) {
        super(transportType, roadType);
        this.carModel = carModel;
    }

    void show() {
        System.out.println("Transport Type: " + transportType);
        System.out.println("Road Type: " + roadType);
        System.out.println("Car Model: " + carModel);
    }
}

public class prob10 {
    public static void main(String[] args) {
        Bus bus = new Bus("Road Transport", "Highway", 101);
        Car car = new Car("Road Transport", "City", "Sedan");

        bus.show();
        System.out.println();
        car.show();
    }
}