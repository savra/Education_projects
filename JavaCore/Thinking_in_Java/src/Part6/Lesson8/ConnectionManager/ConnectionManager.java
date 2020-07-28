package Part6.Lesson8.ConnectionManager;

public class ConnectionManager {
    ConnectionManager() {
    }

    private static Connection[] connections = new Connection[]{Connection.makeConnection("1"),
            Connection.makeConnection("2"),
            Connection.makeConnection("3"),
            Connection.makeConnection("4"),
            Connection.makeConnection("5")};

    private static int currentItem = 0;

    public Connection getCurrentConnection()
    {
        if(currentItem > connections.length - 1)
            return Connection.makeConnection();
        else {
            Connection c = connections[currentItem];
            currentItem++;
            return c;
        }
    }
}

class Connection {
    String str;

    private Connection() {
        System.out.println("private constructor");
    }

    private Connection(String s) {
        str = s;
        System.out.println("private constructor with 1 arg");
    }

    public static Connection makeConnection() {
        return new Connection();
    }

    public static Connection makeConnection(String str) {
        return new Connection(str);
    }
}

class Lesson8Test {
    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        System.out.println(cm.getCurrentConnection().str);
        System.out.println(cm.getCurrentConnection().str);
        System.out.println(cm.getCurrentConnection().str);
        System.out.println(cm.getCurrentConnection().str);
        System.out.println(cm.getCurrentConnection().str);
        System.out.println(cm.getCurrentConnection().str);
    }
}
