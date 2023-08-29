package labs_examples.objects_classes_methods.labs.objects;

class Exercise {
    public static void main(String[] args) {
        Cockpit cockpit = new Cockpit(true, "modern");
        AirplaneEngine engine = new AirplaneEngine(1992, "Propeller", "Airbus");
        Pilot pilot1 = new Pilot("Clancy Abbott", 54, "British");
        Seating eco = new Seating(109, 670, "Economy");

        Airplane myAirplane = new Airplane(1400.60, 666.98, engine, pilot1, cockpit, eco);

        System.out.println(myAirplane.toString());

        myAirplane.pilot.setName("Herschel Heimann");
        System.out.println(myAirplane.pilot.toString());
        System.out.println(myAirplane.getAirplaneEngine());
    }
}

class Airplane {
    private double fuelCapacity;
    private double currentFuelLevel;
    AirplaneEngine AirplaneEngine;
    Pilot pilot;
    Cockpit cockpit;
    Seating seating;

    public Airplane(double fuelCapacity, double currentFuelLevel, labs_examples.objects_classes_methods.labs.objects.AirplaneEngine airplaneEngine, Pilot pilot, Cockpit cockpit, Seating seating) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        AirplaneEngine = airplaneEngine;
        this.pilot = pilot;
        this.cockpit = cockpit;
        this.seating = seating;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public labs_examples.objects_classes_methods.labs.objects.AirplaneEngine getAirplaneEngine() {
        return AirplaneEngine;
    }

    public void setAirplaneEngine(labs_examples.objects_classes_methods.labs.objects.AirplaneEngine airplaneEngine) {
        AirplaneEngine = airplaneEngine;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Cockpit getCockpit() {
        return cockpit;
    }

    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public Seating getSeating() {
        return seating;
    }

    public void setSeating(Seating seating) {
        this.seating = seating;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", AirplaneEngine=" + AirplaneEngine +
                ", pilot=" + pilot +
                ", cockpit=" + cockpit +
                ", seating=" + seating +
                '}';
    }
}

class AirplaneEngine {
    private int year;
    private String type;
    private String make;

    public AirplaneEngine(int year, String type, String make) {
        this.year = year;
        this.type = type;
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "AirplaneEngine{" +
                "year=" + year +
                ", type='" + type + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}

class Pilot {
    private String name;
    private int age;
    private String nationality;

    public Pilot(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

class Cockpit {
    private Boolean placeForCopilot;
    private String cockpitType;

    public Cockpit(Boolean placeForCopilot, String cockpitType) {
        this.placeForCopilot = placeForCopilot;
        this.cockpitType = cockpitType;
    }

    public Boolean getPlaceForCopilot() {
        return placeForCopilot;
    }

    public void setPlaceForCopilot(Boolean placeForCopilot) {
        this.placeForCopilot = placeForCopilot;
    }

    public String getCockpitType() {
        return cockpitType;
    }

    public void setCockpitType(String cockpitType) {
        this.cockpitType = cockpitType;
    }

    @Override
    public String toString() {
        return "Cockpit{" +
                "placeForCopilot=" + placeForCopilot +
                ", CockpitType='" + cockpitType + '\'' +
                '}';
    }
}

class Seating {
    private int rows;
    private int seats;
    private String flightClass;

    public Seating(int rows, int seats, String flightClass) {
        this.rows = rows;
        this.seats = seats;
        this.flightClass = flightClass;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    @Override
    public String toString() {
        return "Seating{" +
                "rows=" + rows +
                ", seats=" + seats +
                ", flightClass='" + flightClass + '\'' +
                '}';
    }
}