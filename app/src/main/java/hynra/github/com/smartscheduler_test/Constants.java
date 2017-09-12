package hynra.github.com.smartscheduler_test;

public class Constants {


    public interface ACTION {
        public static String MAIN_ACTION = "foregroundservice.action.main";
        public static String INIT_ACTION = "foregroundservice.action.init";
        public static String PREV_ACTION = "foregroundservice.action.prev";
        public static String PLAY_ACTION = "foregroundservice.action.play";
        public static String NEXT_ACTION = "foregroundservice.action.next";
        public static String STARTFOREGROUND_ACTION = "foregroundservice.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "foregroundservice.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }
}