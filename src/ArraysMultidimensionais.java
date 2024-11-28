import java.util.Random;

public class ArraysMultidimensionais {
    public static void main(String[] args) {

        // 1 - matriz 3x3

        int[][] matrizExemplo1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrizExemplo1.length; i++) {
            for (int j = 0; j < matrizExemplo1[i].length; j++) {
                System.out.println(matrizExemplo1[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] array : matrizExemplo1) {
            for(int elemento : array) {
                System.out.println(elemento + " ");
            }
            System.out.println();
        }


        // 2 - soma matriz 2x3

        int[][] matrizExemplo2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int sumMatriz2 = 0;

        for (int i = 0; i < matrizExemplo2.length; i++) {
            for (int j = 0; j < matrizExemplo2[i].length; j++) {
                sumMatriz2 += matrizExemplo2[i][j];
            }
        }

        for (int[] array : matrizExemplo2) {
            for (int elemento : array) {
                sumMatriz2 += elemento;
            }
        }

        // 3

        Random random = new Random();

        int[][] minhaMatriz = new int[3][4];

        for (int i = 0; i < minhaMatriz.length; i ++) {
            for (int j = 0; j < minhaMatriz[i].length; j++) {
                minhaMatriz[i][j] = random.nextInt(50) + 1;
            }
        }
        for (int i = 0; i < minhaMatriz.length; i++) {
            for (int j = 0; j < minhaMatriz[i].length; j++) {
                System.out.println(minhaMatriz[i][j] + " ");
            }
            System.out.println();
        }

        // 4

        int[][] matrizDiagPrincipal = new int[4][5];
        for (int i = 0; i < matrizDiagPrincipal.length; i++) {
            for (int j = 0; j < matrizDiagPrincipal.length; j++) {
                matrizDiagPrincipal[i][j] = random.nextInt(101);
            }
        }
        for (int i = 0; i < matrizDiagPrincipal.length; i++) {
            System.out.println(matrizDiagPrincipal[i][i]);
        }

        // 5

        int[][] matrizOriginal = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] matrizTransposta = new int[2][3];

        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

    }
}
