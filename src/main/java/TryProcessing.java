import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 680;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int SPEED_FACTOR_A = 1;
    public static final int SPEED_FACTOR_D = 4;
    public static final int SPEED_FACTOR_C = 3;
    public static final int SPEED_FACTOR_B = 2;
    public static final int HEIGHT_FACTOR_A = 5;
    public static final int HEIGHT_FACTOR_B = 4;
    public static final int HEIGHT_FACTOR_C = 3;
    public static final int HEIGHT_FACTOR_D = 2;
    private static int positionA=1;
    private static int positionB=1;
    private static int positionC=1;
    private static int positionD=1;
    
    ArrayList<Circle> listOfCircle ;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

        Circle c1 = new Circle(SPEED_FACTOR_A,DIAMETER,HEIGHT_FACTOR_A,positionA);
        Circle c2 = new Circle(SPEED_FACTOR_B,DIAMETER,HEIGHT_FACTOR_B,positionB);
        Circle c3 = new Circle(SPEED_FACTOR_C,DIAMETER,HEIGHT_FACTOR_C,positionC);
        Circle c4 = new Circle(SPEED_FACTOR_D,DIAMETER,HEIGHT_FACTOR_D,positionD);

        listOfCircle = new ArrayList<>(Arrays.asList(c1,c2,c3,c4));
    }

    @Override
    public void draw() {
        for (Circle element: listOfCircle) {
            PrintCircle(element);
        }
        Speed(listOfCircle);
    }

    private void PrintCircle(Circle element) {
        ellipse(element.getPosition(), HEIGHT/element.getHeightFactor() ,element.getDIAMETER(),element.getDIAMETER());
    }

    private void Speed(ArrayList<Circle> listOfCircle) {
        for (Circle element:listOfCircle) {
            element.setPosition(element.getPosition()+element.getSpeed());
        }
    }
}
