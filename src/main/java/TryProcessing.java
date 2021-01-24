import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 680;
    public static final int HEIGHT = 480;
    public static PApplet ap;

    private final ArrayList<Integer> diameterList = new ArrayList<>(Arrays.asList(10, 10, 10, 10));
    private final ArrayList<Integer> speedFactorList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    private final ArrayList<Integer> heightFactorList = new ArrayList<>(Arrays.asList(5, 4, 3, 2));
    private ArrayList<Integer> positionList = new ArrayList<>(Arrays.asList(1, 1, 1, 1));

    ArrayList<Circle> listOfCircle = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        int size = positionList.size();
        for (int i = 0; i < size; i++) {
            Circle c = new Circle(speedFactorList.get(i), diameterList.get(i), heightFactorList.get(i), positionList.get(i),this);
            listOfCircle.add(c);
        }
    }

    @Override
    public void draw() {
        for (Circle element : listOfCircle) {
            element.printCircle();
        }
    }
}
