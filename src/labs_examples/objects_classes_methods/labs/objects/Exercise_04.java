package labs_examples.objects_classes_methods.labs.objects;

class Exercise_04 {
    public static void main(String[] args) {
        Bicycle mountainBike = new Bicycle();
        Bicycle bmx = new Bicycle("BMX");
        Bicycle racingBike = new Bicycle("Racing bicycle", 28, "aluminium");

        System.out.println(mountainBike.toString());
        System.out.println(bmx.toString());
        System.out.println(racingBike.toString());
    }
}

class Bicycle {
    private String type;
    private int wheelSize;
    private String frame;

    public Bicycle() {
    }

    public Bicycle(String type) {
        this.type = type;
    }

    public Bicycle(String type, int wheelSize, String frame) {
        this.type = type;
        this.wheelSize = wheelSize;
        this.frame = frame;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "type='" + type + '\'' +
                ", wheelSize=" + wheelSize +
                ", frame='" + frame + '\'' +
                '}';
    }
}