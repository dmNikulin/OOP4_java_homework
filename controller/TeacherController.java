package OOP4_java.controller;

import java.time.LocalDate;

import OOP4_java.data.Teacher;
import OOP4_java.service.TeacherService;
import OOP4_java.view.TeacherView;

public class TeacherController implements UserController<Teacher>{
    
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public void sendOnConsoleTeacherList(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
    
