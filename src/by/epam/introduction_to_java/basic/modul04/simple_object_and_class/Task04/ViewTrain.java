package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task04;


/*
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 */
public class ViewTrain {

    public ViewTrain(){}

    public void viewInfo(Train[] depo, int trainNumber) {
        for (Train t : depo) {
            if (t.trainNumber == trainNumber) {
                System.out.printf("Destination - %s, train number - %d, departure time - %t", t.destination, t.trainNumber, t.departTime);
            }
        }
    }
}
