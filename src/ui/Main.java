package ui;

import model.Decks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public Decks decks;
        private Scanner sc;
        private String msg_To_Deliver;

        public Main() {
            decks = new Decks();
            sc = new Scanner(System.in);
            msg_To_Deliver = "";
        }

        public static void main(String[] args){
            ui.Main main = new ui.Main();
            main.menu();
        }

        public void menu() {
            int n =0 ;
            do{
            n=sc.nextInt();
            if(n!=0) {
                sc.nextLine();
                decks.create_deck(n);
                msg_To_Deliver += decks.throw_away();
                decks.clearDeck();
            }
            }while(n != 0);
            System.out.println(msg_To_Deliver);
        }

}
