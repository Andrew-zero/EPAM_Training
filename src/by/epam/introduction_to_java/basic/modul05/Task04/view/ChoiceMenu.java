package by.epam.introduction_to_java.basic.modul05.Task04.view;


public class ChoiceMenu {
    private View view;

    public ChoiceMenu(View view) {
        this.view = view;
    }

    public int choiceMenu() {
        String message = "Выберите номер меню: -> ";
        String menuMessage =
                """
                        0 - Просмотр всех сокровищ;
                        1 - Выбор самого дорогого по стоимости сокровища;
                        2 - Выбор сокровищ на заданную сумму.""";

        view.printMessage(message);
        view.printMessage(menuMessage);

        return view.inputNumber();
    }


}
