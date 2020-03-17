import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
    private Turnering tunering;
    private Match match;


    ArrayList<Fighter> fighter = new ArrayList<Fighter>();
    ArrayList<Match> matchList = new ArrayList<Match>();
    ArrayList<Match> matchListsemifinals = new ArrayList<>();
    ArrayList<Match> matchListfinals = new ArrayList<>();


Scanner input3 = new Scanner(System.in);


    public void addFighters() {

        Scanner input3 = new Scanner(System.in);
        System.out.println("välj ditt namn");
        String userinput =  input3.nextLine();
        System.out.println("välj ditt namn");
        String userinput2 =  input3.nextLine();

        Fighter one = new Fighter("Valter", 100, "Supreme skill");
        fighter.add(one);
        Fighter two = new Fighter(userinput2, 100, "random ability");
        fighter.add(two);
        Fighter three = new Fighter("Elliot", 100, "test");
        fighter.add(three);
        Fighter fpur = new Fighter("Skaug", 100, "test");
        fighter.add(fpur);
        Fighter five = new Fighter("Robin", 100,"test");
        fighter.add(five);
        Fighter six = new Fighter("Kristoffer", 100, "test");
        fighter.add(six);
        Fighter seven = new Fighter("Emil", 100, "test");
        fighter.add(seven);
        Fighter eight = new Fighter(userinput, 100, "random ability");
        fighter.add(eight);



    }

    public void matchcreator() {
     Collections.shuffle(matchList);
        addFighters();
        Match matchquarters = new Match(fighter.get(0), fighter.get(1));
        matchList.add(matchquarters);
        Match matchquarters2 = new Match(fighter.get(2), fighter.get(3));
        matchList.add(matchquarters2);
        Match matchquarters3 = new Match(fighter.get(4), fighter.get(5));
        matchList.add(matchquarters3);
        Match matchquarters4 = new Match(fighter.get(6), fighter.get(7));
        matchList.add(matchquarters4);
        match = new Match();

    }

    public void semifinals () {
        matchcreator();
        Match semi1 = new Match(tunering.combat(matchList.get(0)), tunering.combat(matchList.get(1)));
        matchListsemifinals.add(semi1);
        Match semi2 = new Match(tunering.combat(matchList.get(2)), tunering.combat(matchList.get(3)));
        matchListsemifinals.add(semi2);
        match = new Match();
    }    //System.out.println("" + matchListsemifinals-);

    public void finals () {
       semifinals();
        Match final1  = new Match(tunering.combat(matchListsemifinals.get(0)), tunering.combat(matchListsemifinals.get(1)));
        matchListfinals.add(final1);
        //match = new Match();

    }    //System.out.println("" + matchListsemifinals-);


    //}
   public void combat1 () {
       matchcreator();
       tunering = new Turnering();
       finals();


   }

}
