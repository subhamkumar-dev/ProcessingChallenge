import processing.core.PApplet;

public class Circle {
    private int speed;
    private int diameter;
    private int heightFactor ;
    private int position;
    private final PApplet applet;

    public int getSpeed() {
        return speed;
    }

    public Circle(int speed, int diameter, int heightFactor, int position,PApplet applet) {
        this.speed = speed;
        this.diameter = diameter;
        this.heightFactor = heightFactor;
        this.position = position;
        this.applet = applet;
    }

    public void printCircle() {
        applet.ellipse(position,TryProcessing.WIDTH/heightFactor,diameter,diameter);
        position+=speed;
    }
}
