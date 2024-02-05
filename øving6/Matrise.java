import java.util.Arrays;

public class Matrise {
    private final int M;             // number of rows
    private final int N;             // number of columns
    private final double[][] data;
    private static double[][] resultatMatrise;

    public Matrise(double[][] data) {
        M = data.length;
        N = data[0].length;
        this.data = new double[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                this.data[i][j] = data[i][j];
    }
    public void show() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%9.4f ", data[i][j]);
            System.out.println();
        }
    }
    public void addere(double[][] data) {
        resultatMatrise = new double[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++){
                resultatMatrise[i][j] = this.data[i][j];
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++){
                resultatMatrise[i][j] += data[i][j];
            }
        }
    }
    public void multiplisere(double[][] data) {
        resultatMatrise = new double[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++){
                resultatMatrise[i][j] = this.data[i][j];
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++){
                resultatMatrise[i][j] *= data[i][j];
            }
        }
    }
    public void transponere() {
        resultatMatrise = new double[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++){
                resultatMatrise[j][i] = this.data[i][j];
            }
        }

    }
    public static String getResult(){
        return (Arrays.toString((resultatMatrise[0])) + "\n" + Arrays.toString(resultatMatrise[1]) + "\n" + Arrays.toString(resultatMatrise[2]) +"\n");
    }
}