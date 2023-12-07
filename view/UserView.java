package OOP4_java.view;

import java.util.List;

import OOP4_java.data.User;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
