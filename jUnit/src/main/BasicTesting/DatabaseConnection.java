package BasicTesting;

public class DatabaseConnection {
    static boolean isConnected = false;
    public static void main(String[] args) {

    }

    // the database connection by setting isConnected to true.
    public static void connect(){
        isConnected = true;
        System.out.println("Database Connected");
    }

    // the database disconnected by setting isConnected to false.
    public static void disconnect(){
        isConnected = false;
        System.out.println("Database disconnected");
    }

    // Checks if the database is currently connected.
    public static boolean isConnected(){
        return isConnected;
    }
}
