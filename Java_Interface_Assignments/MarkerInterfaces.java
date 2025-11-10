
// Marker Interfaces
interface BackupSerializable {}

class EmployeeData implements BackupSerializable {
    String name;
    EmployeeData(String name) { this.name = name; }
}

interface Sensitive {}

class UserCredentials implements Sensitive {
    String username, password;
    UserCredentials(String u, String p) { username = u; password = p; }
}

public class MarkerInterfaces {
    public static void main(String[] args) {
        EmployeeData e = new EmployeeData("John");
        UserCredentials c = new UserCredentials("admin", "1234");
        System.out.println("Backup and encryption markers implemented.");
    }
}
