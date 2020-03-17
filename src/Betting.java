import java.util.Scanner;

public class Betting {
    public static int money;
    public static int betoption;
    public static int betmoney;
    int pot;
    static int menuchoice;
    public static String name;

    public static void display() {

    }

    public static void startGame() {
        if(menuchoice == 1) {
            money();
        } else if (menuchoice ==2) {
            help();

        } else {
            notVaild();

        }



    }


    public static void Betoption() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick wich fighter you want to bet on");
        betoption = input.nextInt();
        if (betoption >= 9) {
            System.out.println("thats not a valid option");
            money();
        } else {
            userBet();

        }

    }

    public static void money() {
        money = 500;
        betmoney = 0;
        System.out.println(" you have R + money to gamble with");
        Betoption();

    }

    public static void notVaild() {

    }

    public static void userBet() {
        Scanner input = new Scanner(System.in);
        System.out.println("how much do you want to bet");
        betmoney = input.nextInt();
        if (betmoney < money) {
            System.out.println("you dont have enough");
            userBet();
        } else if (money == 500) {
            System.out.println("you are out of money");
        } else {
            money = money - betmoney;
            System.out.println("youy bet r# +betmoney+ on this game");
            game();
        }
    }

    public static void help() {

    }

    public static void game() {
        int randomnumber = (int) Math.round(Math.random() * 7 + 1);
        int pot = (int) Math.round(Math.random() * 7 + 1 + betmoney);

        if (betoption == randomnumber) {
            System.out.println("you won");
            money = money + pot;
            startGame();
        } else if (money == 0) {
            System.out.println(" lost all money");
        } else {
            Betoption();
        }

    }

    public static void menu() {
        int menuChoice;
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for start, press 2 for help");
        menuChoice = input.nextInt();
        userBet();


    }
}

