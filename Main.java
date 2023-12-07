package OOP4_java;

import java.time.LocalDate;

import OOP4_java.controller.TeacherController;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        TeacherController controller = new TeacherController();

        controller.create("Александр", "Иванов", "Сергеевич", date);
        controller.create("Юлия", "Петрова", "Ивановна", date);
        controller.sendOnConsoleTeacherList();
    }
}
