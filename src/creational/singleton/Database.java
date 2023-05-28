package creational.singleton;

public class Database {

    private static Database dbObject;
    public static Database getInstance() {
        if (dbObject == null){
            dbObject = new Database();
        }
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You're now connected to the database.");
    }
}
