import java.util.Scanner;

public class Turnering {
    private Fighter fighter;
    private Match match;
    private Controller controller;


    public void login (){
        String Username;
        String Password;

        Password = "Java";
        Username = "Kalle";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.nextLine();

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Access Granted! Welcome!");
        }

        else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
            login();
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
            login();
        } else {
            System.out.println("Invalid Username & Password!");
        }


    }


    public Fighter combat(Match e) {



        match = new Match();
        Fighter fighter1 = e.getfighter1(e);
        Fighter fighter2 = e.getfighter2(e);
        int fighter1Hp = fighter1.getHp();
        int fighter2Hp = fighter2.getHp();

        System.out.println("Klicka på enter för att starta");
        Scanner input = new Scanner(System.in);
        input.nextLine();

        while (fighter1Hp >= 0 && fighter2Hp >=0) {

            fighter1Hp = fighter1Hp - fighter2.attack();
            System.out.println(fighter1.getUserName() + " attacks " + fighter2.getUserName() + " for " + fighter1.attack());
            System.out.println(fighter1.getUserName() + " has " + fighter1Hp + " hp " );
            fighter2Hp = fighter2Hp - fighter1.attack();
            System.out.println(fighter2.getUserName() + " attacks " + fighter1.getUserName() + " for " + fighter2.attack());
            System.out.println(fighter2.getUserName() + " has " + fighter2Hp + " hp " );

           try {
               Thread.sleep(500);
           }
            catch (InterruptedException e1) {

            }
            }

        if (fighter1Hp > fighter2Hp) {
            System.out.println("winner is " + fighter1);
            return fighter1;
        } else {
            System.out.println("winner is " + fighter2);
            return fighter2;


        }







    }











}

