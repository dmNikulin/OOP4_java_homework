package OOP4_java.view;

import java.util.List;
import java.util.logging.Logger;

import OOP4_java.data.Teacher;

public class TeacherView implements UserView<Teacher>{

    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher i: teachers){
            logger.info(i.toString());
        }
    }
    
}
