package by.epam.introduction_to_java.basic.modul02.multidimensional_array;


import by.epam.introduction_to_java.basic.modul02.ViewHelper.ViewHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public int insertSideNumber() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        String message = "Введите сторону квадрата больше 2: \n->...";

        ViewHelper.helpView(message);

        try {
            result = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int[][] createMagicSquare() {
        int sideNumber = insertSideNumber();
        int[][] resultSquare = null;

        if (sideNumber <= 2)
            throw new NumberFormatException();

        if (sideNumber % 2 != 0) {
            resultSquare = createOddMagicSquare(sideNumber);
        }
        if (sideNumber % 4 == 0) {
            resultSquare = createEvenOddMagicSquare(sideNumber);
        }
        if (sideNumber % 2 == 0) {
            resultSquare = createEvenEvenMagicSquare(sideNumber);
        }

        return resultSquare;
    }

    private int[][] createOddMagicSquare(int sideNumber) {
        int[][] magicSquare = new int[sideNumber][sideNumber];
        int number = 1;
        int i = 0;
        int j = sideNumber / 2;
        int next = sideNumber;
        int last = (int) Math.pow(sideNumber, 2);

        while (number <= last) {
            magicSquare[i][j] = number++;
            if (number > next) {
                next += sideNumber;
                i++;
            } else {
                if (--i < 0) {
                    i += sideNumber;
                }
                if (++j >= sideNumber) {
                    j -= sideNumber;
                }
            }
        }

        return magicSquare;
    }

    private int[][] createEvenEvenMagicSquare(int sideNumber) {
        int[][] magicSquare = new int[sideNumber][sideNumber];

        magicSquare = line(magicSquare, sideNumber);

        for (int i = 0; i < sideNumber / 2; i++) {
            for (int j = (i + 1) & 1; j < sideNumber / 2; j += 2) {
                reflect(magicSquare, i, j, sideNumber);
                reflect(magicSquare, i, sideNumber - j - 1, sideNumber);
            }
        }

        return magicSquare;
    }

    public int[][] line(int[][] magicSquare, int sideNumber) {
        int number = 1;

        for (int i = 0; i < sideNumber; i++) {
            for (int j = 0; j < sideNumber; j++) {
                magicSquare[i][j] = number++;
            }
        }

        return magicSquare;
    }

    public int[][] reflect(int[][] magicSquare, int i, int j, int sideNumber) {

        int temp = magicSquare[i][j];
        magicSquare[i][j] = magicSquare[sideNumber - i - 1][sideNumber - j - 1];
        magicSquare[sideNumber - i - 1][sideNumber - j - 1] = temp;

        return magicSquare;
    }

    private int[][] createEvenOddMagicSquare(int sideNumber) {
        int[][] magicSquare = new int[sideNumber][sideNumber];
        int[][] pieceMagicSquare = new int[sideNumber - 2][sideNumber - 2];

        pieceMagicSquare = createEvenEvenMagicSquare(sideNumber - 2);



        return null;
    }

}
