public class ATM {
    private boolean userAuthenticated;
    private int currentAccountNumber;
    private Screen screen;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    private DepositSlot depositSlot;
    private BankDatabase bankDatabase;

    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;

    public ATM() {
        userAuthenticated = false;
        currentAccountNumber = 0;
        screen = new Screen();
        keypad = new Keypad();
        cashDispenser = new CashDispenser();
        depositSlot = new DepositSlot();
        bankDatabase = new BankDatabase();
    }

    public void run() {
        while (true) {
            while (!userAuthenticated) {
                screen.displayMessageLine("\nHo�geldiniz!");
                authenticateUser();
            }
            performTransactions();
            userAuthenticated = false;
            currentAccountNumber = 0;
            screen.displayMessageLine("\nTe�ekk�rler! G�leg�le!");
        }
    }

    public void authenticateUser() {
        screen.displayMessage("\nL�tfen kullan�c� numaran�z� giriniz: ");
        int accountNumber = keypad.getInput();
        screen.displayMessage("\n�ifrenizi giriniz: ");
        int pin = keypad.getInput();

        userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);

        if (userAuthenticated) {
            currentAccountNumber = accountNumber;
        } else
            screen.displayMessageLine("Ge�ersiz kullan�c� ad� veya �ifre girdiniz. L�tfen tekrar deneyin.");
    }

    private void performTransactions() {
        Transaction currentTransaction = null;
        boolean userExited = false;

        while (!userExited) {
            int mainMenuSelection = displayMainMenu();

            switch (mainMenuSelection) {
                case BALANCE_INQUIRY:
                case WITHDRAWAL:
                case DEPOSIT:
                    currentTransaction = createTransaction(mainMenuSelection);
                    currentTransaction.execute();
                    break;

                case EXIT:
                    screen.displayMessageLine("Sistemden ��k�l�yor...");
                    userExited = true;
                    break;

                default:
                    screen.displayMessageLine("\nGe�erli giri� yapmad�n�z. Tekrar deneyin.");
                    break;
            }
        }
    }

    private int displayMainMenu() {
        screen.displayMessageLine("\nAnaMen�");
        screen.displayMessageLine("1 - Hesap G�r�nt�le");
        screen.displayMessageLine("2 - Bor� Alma");
        screen.displayMessageLine("3 - Fon Al�m�");
        screen.displayMessageLine("4 - ��k��\n");
        screen.displayMessage("L�tfen birini se�iniz: ");
        return keypad.getInput();
    }

    private Transaction createTransaction(int type) {
        Transaction temp = null;

        switch (type) {
            case BALANCE_INQUIRY:
                temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
                break;
            case WITHDRAWAL:
                temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
                break;
            case DEPOSIT:
                temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
                break;
        }

        return temp;
    }
}