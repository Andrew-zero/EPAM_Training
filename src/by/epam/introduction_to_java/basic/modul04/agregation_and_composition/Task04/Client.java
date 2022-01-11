package by.epam.introduction_to_java.basic.modul04.agregation_and_composition.Task04;


import java.util.Arrays;

/*
4.	Счета. Клиент может иметь несколько счетов в банке.

Учитывать возможность блокировки/разблокировки счета.

Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.

Вычисление суммы по всем счетам, имеющим положеитльный и отрицательный балансы отдельно.
 */
public class Client {
    private Count[] arrayCounts;
    private String name;

    public Client() {
        arrayCounts = new Count[0];
    }

    public Client(String name) {
        this.name = name;
        arrayCounts = new Count[0];
    }

    public Client(Count[] arrayCount, String name) {
        this.arrayCounts = arrayCount;
        this.name = name;
    }

    public Count[] getArrayCounts() {
        return arrayCounts;
    }

    public void setArrayCounts(Count[] arrayCounts) {
        this.arrayCounts = arrayCounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCount(Count count) {
        int capacity;
        if (arrayCounts.length == 0) {
            capacity = 1;
        } else {
            capacity = arrayCounts.length + 1;
        }
        Count[] newCount = new Count[capacity];

        System.arraycopy(arrayCounts, 0, newCount, 0, newCount.length - 1);
        newCount[newCount.length - 1] = count;

        arrayCounts = newCount;
    }

    public void removeCount(int countNumber) {
        int capacity = arrayCounts.length - 1;
        Count[] newCount = new Count[capacity];

        for (int i = 0, j = 0; i < arrayCounts.length; i++) {
            if (!(arrayCounts[i].getNumberCount() == countNumber)) {
                newCount[j] = arrayCounts[i];
                j++;
            }
        }

        arrayCounts = newCount;
    }

    public double negativeSum() {
        double result = 0.0;

        for (Count c : arrayCounts) {
            if (c.getValue() < 0) {
                result += c.getValue();
            }
        }

        return result;
    }

    public double positiveSum() {
        double result = 0.0;

        for (Count c : arrayCounts) {
            if (c.getValue() > 0) {
                result += c.getValue();
            }
        }

        return result;
    }

    public double totalSum() {
        double result = 0.0;

        for (Count c : arrayCounts) {
            result += c.getValue();
        }

        return result;
    }

    public void sortCount() {
        int d = arrayCounts.length >> 1;

        while (d > 0) {
            for (int i = 0; i < arrayCounts.length - d; i++) {
                int j = i;
                while ((j >= 0) && arrayCounts[j].getNumberCount() > arrayCounts[j + d].getNumberCount()) {
                    Count temp = arrayCounts[j + d];
                    arrayCounts[j + d] = arrayCounts[j];
                    arrayCounts[j] = temp;
                    j--;
                }
            }
            d = d >> 1;
        }
    }

    public Count findCount(int numberCount) {
        sortCount();
        int index = binarySearch(arrayCounts, -1, arrayCounts.length, numberCount);

        return arrayCounts[index];
    }

    public int binarySearch(Count[] array, int fromIndex, int toIndex, int keyNumberCount) {
        if (toIndex < fromIndex)
            return -1;

        int low = fromIndex;
        int high = toIndex;

        while (low < high - 1) {
            int mid = low + (high - low) / 2;

            if (array[mid].getNumberCount() < keyNumberCount) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return high;
    }

    @Override
    public String toString() {
        return "Client{" +
                "arrayCounts=" + Arrays.toString(arrayCounts) +
                ", name='" + name + '\'' +
                '}';
    }
}
