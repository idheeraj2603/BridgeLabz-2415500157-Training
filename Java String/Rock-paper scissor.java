import java.util.Scanner;

public class RockPaperScissorsGame {

    // Method to get computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0, 1, or 2
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    // Method to determine winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "draw";
        } else if ((user.equals("rock") && computer.equals("scissors")) ||
                   (user.equals("paper") && computer.equals("rock")) ||
                   (user.equals("scissors") && computer.equals("paper"))) {
            return "user";
        } else {
            return "computer";
        }
    }

    // Method to calculate stats
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        double userWinPercent = (userWins * 100.0) / totalGames;
        double compWinPercent = (compWins * 100.0) / totalGames;

        String[][] stats = {
            {"User Wins", String.valueOf(userWins), String.format("%.2f%%", userWinPercent)},
            {"Computer Wins", String.valueOf(compWins), String.format("%.2f%%", compWinPercent)},
            {"Draws", String.valueOf(totalGames - userWins - compWins), "-"}
        };
        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("Category\tCount\tPercentage");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1] + "\t" + stat[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine();

        String[][] gameResults = new String[totalGames][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, totalGames);
        displayResults(gameResults, stats);

        sc.close();
    }
}
