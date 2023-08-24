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
        final String WITHDRAWLS  = "Withdrawls";
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

        do{
            switch(screen){
                case DASHBOARD: 
                System.out.println("\t[1]. Open New Account");
                System.out.println("\t[2]. Depositst");
                System.out.println("\t[3]. Withdrawls");
                System.out.println("\t[4]. Transfers");
                System.out.println("\t[5]. Delete Account");
                System.out.println("\t[6]. Print Account");
                System.out.println("\t[7]. Exit\n");
                System.out.println("-".repeat(45));
                System.out.print("\tEnter an option to continue: ");
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option){
                    case 1: screen = NEW_ACCOUNT; break;
                    case 2: screen = DEPOSITS; break;
                    case 3: screen = WITHDRAWLS; break;
                    case 4: screen = TRANSFERS; break;
                    case 5: screen = DELETE_ACC; break;
                    case 6: screen = PRINT_ACC; break;
                    case 7: System.out.println(CLEAR); System.exit(0);
                    default: continue;
                }
                break;







            }







        }while(true);
        
    }
    
}
