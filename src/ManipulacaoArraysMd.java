import java.util.Random;
import java.util.Scanner;

public class ManipulacaoArraysMd {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 1
        int dataUser = scanner.nextInt();
        System.out.println("numero de verificação");

        boolean checkData = false;

        int[][] minhaMatriz = new int[3][3];
        for (int i = 0; i < minhaMatriz.length; i++) {
            for (int j = 0; j < minhaMatriz[i].length; j++) {
                minhaMatriz[i][j] = random.nextInt(11);
            }
        }

        for (int i = 0; i < minhaMatriz.length; i++) {
            for (int j = 0; j < minhaMatriz[i].length; j++) {
                if (dataUser == minhaMatriz[i][j]) checkData = true;
                break;
            }
        }
        System.out.println(checkData);





    }
}
