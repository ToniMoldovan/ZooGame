import GUI.g_Welcome;
import classes.DBConnect;

public class Main {
    public static void main(String[] args) {
        g_Welcome welcome = new g_Welcome();

        DBConnect.getInstance().Connect();

        DBConnect.getInstance().printDatabaseUsers();

        DBConnect.getInstance().Disconnect();
    }
}