package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Database database;
        database = Database.getInstance();
        database.getConnection();

    }
}
