import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;

public class TryProcessing extends PApplet {
    public final int WIDTH = 680;
    public final int HEIGHT = 480;
    private final int DIAMETER = 10;

    private ArrayList<Integer> speedFactorList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    private ArrayList<Integer> heightFactorList = new ArrayList<>(Arrays.asList(5, 4, 3, 2));
    private ArrayList<Integer> positionList = new ArrayList<>(Arrays.asList(1, 1, 1, 1));

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
    }

    @Override
    public void draw() {
        int listSize = speedFactorList.size();
        for (int i = 0; i < listSize; i++) {
            PrintCircle(positionList.get(i), heightFactorList.get(i));
            updatePosition(i);
        }

    }

    private void updatePosition(int i) {
        positionList.set(i, positionList.get(i) + speedFactorList.get(i));
    }

    private void PrintCircle(int position, int heightFactor) {
        ellipse(position, HEIGHT / heightFactor, DIAMETER, DIAMETER);
    }

}
