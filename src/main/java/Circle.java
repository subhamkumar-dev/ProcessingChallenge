public class Circle {
    private int speed;
    private int DIAMETER ;
    private int heightFactor ;
    private int position;

    public Circle(int speed, int DIAMETER, int heightFactor, int position) {
        this.speed = speed;
        this.DIAMETER = DIAMETER;
        this.heightFactor = heightFactor;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDIAMETER() {
        return DIAMETER;
    }

    public void setDIAMETER(int DIAMETER) {
        this.DIAMETER = DIAMETER;
    }

    public int getHeightFactor() {
        return heightFactor;
    }

    public void setHeightFactor(int heightFactor) {
        this.heightFactor = heightFactor;
    }
}
