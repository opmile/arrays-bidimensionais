import java.util.Random;

public class ArraysIrregulares {
    public static void main(String[] args) {

        // 1

        int[][] meuArrayIrregular = {
                {2, 3},
                {2, 3, 1},
                {2}
        };

        for (int i = 0; i < meuArrayIrregular.length; i++) {
            for (int j = 0; j < meuArrayIrregular[i].length; j++) {
                System.out.println(meuArrayIrregular[i][j] + " ");
            }
            System.out.println();
        }


        // 2

        int[][] somaDeArraysIrr = {
                {1, 2, 3},
                {1, 2},
                {1, 4, 5, 6, 7},
        };

        int somaPriLinha = 0;
        int somaSegLinha = 0;
        int somaTercLinha = 0;

        for (int j = 0; j < somaDeArraysIrr[0].length; j++) {
            somaPriLinha += somaDeArraysIrr[0][j];
        }

        for (int j = 0; j < somaDeArraysIrr[1].length; j++) {
            somaSegLinha += somaDeArraysIrr[1][j];
        }

        for (int j = 0; j < somaDeArraysIrr[2].length; j++) {
            somaTercLinha += somaDeArraysIrr[2][j];
        }

        // outra forma

        for (int i = 0; i < somaDeArraysIrr.length; i++) {
            for (int j = 0; j < somaDeArraysIrr.length; j++) {
                if (i == 0) somaPriLinha += somaDeArraysIrr[0][j];
                if (i == 1) somaSegLinha += somaDeArraysIrr[1][j];
                if (i == 2) somaTercLinha += somaDeArraysIrr[2][j];
            }
        }


        // 3 - maior elemento do array irregular

        int[][] maiorDoArrIrr = {
                {17, 20},
                {31, 43, 9},
                {60},
                {78, 81}
        };

        int maiorElemento = 0;

        for (int i = 0; i < maiorDoArrIrr.length; i++) {
            for ( int j = 0; j < maiorDoArrIrr[i].length; j++) {
                if (maiorDoArrIrr[i][j] > maiorElemento) maiorElemento = maiorDoArrIrr[i][j];
            }
        }

        // 4 - criando triangulo numerico

        Random random = new Random();

        int[][] trianguloNumerico = new int[4][];

        for (int i = 0; i < trianguloNumerico.length; i++) {
            trianguloNumerico[i] = new int[i + 1];
        }

        for (int i = 0; i < trianguloNumerico.length; i++) {
            for (int j = 0; j < trianguloNumerico[i].length; j++) {
                trianguloNumerico[i][j] = random.nextInt(11) + 1;
            }
        }

    }
}
