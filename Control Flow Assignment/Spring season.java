public class SpringSeason {
    pu
        if (args.length < 2) {
            System.out.println("Please provide month and day as command-line arguments.");
            return;
        }

        
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

       
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||  // March 20–31
                           (month == 4 && day >= 1 && day <= 30)  ||  // April
                           (month == 5 && day >= 1 && day <= 31)  ||  // May
                           (month == 6 && day >= 1 && day <= 20);     // June 1–20

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
