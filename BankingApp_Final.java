import java.util.Scanner;

public class BankingApp_Final {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD   = "Welcome to Smart Banking App";
        final String NEW_ACCOUNT = "Open New Account";
        final String DEPOSITS    = "Deposits";
        final String TRANSFERS   = "Transfers";
        final String DELETE_ACC  = "Delete Account";
        final String PRINT_ACC   = "Print Account";
        

        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String[][] Customers = new String[3][];

        String screen = DASHBOARD;


        final String APP_TITLE = String.format("%s%s%s",
        COLOR_BLUE_BOLD, screen, RESET);

        System.out.println(CLEAR);
        System.out.println("-".repeat(45));
        System.out.println("\t" + APP_TITLE );
        System.out.println("-".repeat(45));
        
    }
    
}
