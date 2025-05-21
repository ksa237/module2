import java.util.Random;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE];
        System.out.println("-=Исходная матрица=-");
        initMatrix(colors);
        printMatrix(colors);

        int[][] rotateColors = new int[SIZE][SIZE];
        rotateMatrix(colors, rotateColors);
        System.out.println("-=Поворот на 90 град.=-");
        printMatrix(rotateColors);
    }

    static void initMatrix(int[][] pColors) {
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                pColors[i][j] = random.nextInt(256);
            }
        }

    }

    static void printMatrix(int[][] pColors) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", pColors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void rotateMatrix(int[][] mOrigin, int[][] mRotate) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                mRotate[j][SIZE - i - 1] = mOrigin[i][j];
            }
        }
    }
}
