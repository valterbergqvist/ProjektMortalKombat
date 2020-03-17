import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;


public class Main {
   public static Controller controller;


    public static void main(String[] args) {


        Turnering turnering = new Turnering();
        turnering.login();
        controller = new Controller();
        controller.combat1();
        System.out.println();




    }
}

