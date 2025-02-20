package day3;

class Transport {
    String transport_id, transport_name;

    Transport(String transport_id, String transport_name) {
        this.transport_id = transport_id;
        this.transport_name = transport_name;
    }
}

class RoadTransport extends Transport {
    String vehicle_type;
    int no_of_wheels;

    RoadTransport(String transport_id, String transport_name, String vehicle_type, int no_of_wheels) {
        super(transport_id, transport_name);
        this.vehicle_type = vehicle_type;
        this.no_of_wheels = no_of_wheels;
    }

    void show() {
        System.out.println("Road Transport ID: " + transport_id);
        System.out.println("Transport Name: " + transport_name);
        System.out.println("Vehicle Type: " + vehicle_type);
        System.out.println("Number of Wheels: " + no_of_wheels);
    }
}

class WaterTransport extends Transport {
    String ship_type;

    WaterTransport(String transport_id, String transport_name, String ship_type) {
        super(transport_id, transport_name);
        this.ship_type = ship_type;
    }

    void show() {
        System.out.println("Water Transport ID: " + transport_id);
        System.out.println("Transport Name: " + transport_name);
        System.out.println("Ship Type: " + ship_type);
    }
}

class AirTransport extends Transport {
    String aircraft_type;

    AirTransport(String transport_id, String transport_name, String aircraft_type) {
        super(transport_id, transport_name);
        this.aircraft_type = aircraft_type;
    }

    void show() {
        System.out.println("Air Transport ID: " + transport_id);
        System.out.println("Transport Name: " + transport_name);
        System.out.println("Aircraft Type: " + aircraft_type);
    }
}

class prob8 {
    public static void main(String[] args) {
        RoadTransport roadTransport = new RoadTransport("RT001", "Bus", "Passenger", 4);
        WaterTransport waterTransport = new WaterTransport("WT001", "Ferry", "Cargo");
        AirTransport airTransport = new AirTransport("AT001", "Jet", "Commercial");

        roadTransport.show();
        System.out.println();
        waterTransport.show();
        System.out.println();
        airTransport.show();
    }
}