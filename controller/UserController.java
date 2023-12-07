package OOP4_java.controller;

import java.time.LocalDate;

import OOP4_java.data.User;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
