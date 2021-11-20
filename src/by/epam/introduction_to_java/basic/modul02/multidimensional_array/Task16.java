package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

/*
Магическим квадратом порядка n называется квадратная матрица размера nxn,
составленная из чисел 1,2,3,..., n^2 так, что суммы по каждому столбцу,
каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
Пример магического квадрата порядка 3:
6 1 8
7 5 3
2 9 4
 */
public class Task16 {


    public static void createMagicSquare(int sideNumber) {
        if (sideNumber <= 2)
            throw new NumberFormatException();

        if (sideNumber % 2 != 0) {
            createOddMagicSquare(sideNumber);
        }
        if (sideNumber % 4 == 0) {
            createEvenOddMagicSquare(sideNumber);
        }
        if (sideNumber % 2 == 0) {
            createEvenEvenMagicSquare(sideNumber);
        }
    }

    private static int[][] createOddMagicSquare(int sideNumber) {
        int[][] magicSquare;
        int[][] initialMatrix;

        magicSquare = new int[sideNumber][sideNumber];
        initialMatrix = new int[sideNumber][sideNumber];

        int number = 1;

        for(int i = 0; i < initialMatrix.length; i++){
            for(int j = 0; j < initialMatrix[i].length; j++){
                initialMatrix[i][j] = number;
                number++;
            }
        }

        ViewHelper.helpViewArray(initialMatrix);

        return null;
    }

    private static int[][] createEvenOddMagicSquare(int sideNumber) {
        int[][] magicSquare = new int[sideNumber][sideNumber];


        return null;
    }

    private static int[][] createEvenEvenMagicSquare(int sideNumber) {
        int[][] magicSquare = new int[sideNumber][sideNumber];


        return null;
    }

}
