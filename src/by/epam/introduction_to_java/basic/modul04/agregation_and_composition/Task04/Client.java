package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task04;


import java.util.ArrayList;

/*
4.	Счета. Клиент может иметь несколько счетов в банке.

Учитывать возможность блокировки/разблокировки счета.

Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.

Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Client {
    private Count[] arrayCount = new Count[1];
    private String name;

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public Client(Count[] arrayCount, String name) {
        this.arrayCount = arrayCount;
        this.name = name;
    }

    public Count[] addCount(Count count) {
        int capacity = arrayCount.length + 1;
        Count[] newCount = new Count[capacity];

        System.arraycopy(arrayCount, 0, newCount, 0, newCount.length - 1);
        newCount[newCount.length - 1] = count;

        return newCount;
    }

    public void removeCount(Count count) {
        int capacity = arrayCount.length - 1;
        Count[] newCount = new Count[capacity];

        for (int i = 0, j = 0; i < arrayCount.length; i++) {
            if (!(arrayCount[i].equals(count))) {
                newCount[j] = arrayCount[i];
                j++;
            }
        }

        arrayCount = newCount;
    }


    public void sortCount(Count[] counts) {
        int d = counts.length >> 1;

        while (d > 0) {
            for (int i = 0; i < counts.length - d; i++) {
                int j = i;
                while ((j >= 0) && counts[j].getNumberCount() > counts[j + d].getNumberCount()) {
                    Count temp = counts[j + d];
                    counts[j + d] = counts[j];
                    counts[j] = temp;
                    j--;
                }
            }
            d = d >> 1;
        }
    }

    public Count findCount(Count count){


        return null;
    }
}
