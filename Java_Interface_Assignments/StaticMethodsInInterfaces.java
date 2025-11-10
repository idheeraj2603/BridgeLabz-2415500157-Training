
// Static Methods in Interfaces
import java.text.SimpleDateFormat;
import java.util.Date;

interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*");
    }
}

interface UnitConverter {
    static double kmToMiles(double km) { return km * 0.621371; }
    static double kgToLbs(double kg) { return kg * 2.20462; }
}

interface DateFormatter {
    static String formatDate(Date date) {
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}

public class StaticMethodsInInterfaces {
    public static void main(String[] args) {
        System.out.println("Password strong: " + SecurityUtils.isStrongPassword("Hello123"));
        System.out.println("10 km in miles: " + UnitConverter.kmToMiles(10));
        System.out.println("Formatted Date: " + DateFormatter.formatDate(new Date()));
    }
}
