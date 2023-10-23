package dev.lesechko.designpatterns.theory.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logfile = "This is log file.\n\n";

    private ProgramLogger() {}

    public static synchronized ProgramLogger getProjectLogger() {
        if (programLogger == null)
            programLogger = new ProgramLogger();

        return programLogger;
    }

    public void addLogInfo(String loginfo) {
        logfile += loginfo + "\n";
    }

    public void showLogfile() {
        System.out.println(logfile);
    }
}
