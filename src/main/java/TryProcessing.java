import processing.core.PApplet;

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
    }

    @Override
    public void draw() {
        PrintCircle(positionA, HEIGHT_FACTOR_A);
        PrintCircle(positionB, HEIGHT_FACTOR_B);
        PrintCircle(positionC, HEIGHT_FACTOR_C);
        PrintCircle(positionD, HEIGHT_FACTOR_D);
        Speed();
    }

    private void PrintCircle(int position,int heightFactor) {
        ellipse(position, HEIGHT/heightFactor ,DIAMETER, DIAMETER);
    }

    private void Speed() {
        positionA+=SPEED_FACTOR_A;
        positionB+=SPEED_FACTOR_B;
        positionC+=SPEED_FACTOR_C;
        positionD+=SPEED_FACTOR_D;
    }
}
