package OOP4_java.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import OOP4_java.data.Teacher;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teacherList;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherList.add(new Teacher(firstName, secondName, patronymic, dateOfBirth));
    }
}
