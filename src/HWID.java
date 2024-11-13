public class HWID {
    private static String hwid;

    public HWID(){


    }

    public static String getHWID(){
        hwid = System.getProperty("user.name") + " "
                + System.getenv("COMPUTERNAME") + " "
                + System.getenv("os") + " "
                + System.getProperty("os.name") + " "
                + System.getenv("PROCESSOR_IDENTIFIER") + " "
                + System.getProperty("os.arch") + " "
                + System.getProperty("os.version") + " "
                + System.getProperty("user.language") + " "
                + System.getenv("SystemRoot") + " "
                + System.getenv("HOMEDRIVE") + " "
                + System.getenv("PROCESSOR_LEVEL") + " "
                + System.getenv("PROCESSOR_REVISION") + " "
                + System.getenv("PROCESSOR_IDENTIFIER") + " "
                + System.getenv("PROCESSOR_ARCHITECTURE") + " "
                + System.getenv("PROCESSOR_ARCHITEW6432") + " "
                + System.getenv("NUMBER_OF_PROCESSORS");
        return hwid;
    }
}
