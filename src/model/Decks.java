package model;

import java.util.LinkedList;
import java.util.Queue;

public class Decks {

    public Queue<Integer> queue;

    public Decks() {
        queue = new LinkedList<>();
    }

    public void create_deck(int n){
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
    }

    public String throw_away(){
        String threw="";
        do{
        int top_removed= queue.poll();
        int to_bot= queue.peek();
        queue.remove();
        queue.add(to_bot);
        threw += top_removed + " ";
        }
        while(queue.size()>1);
        int bot = queue.peek();
        String remaining = "";
        remaining += bot;
        String solved = msg(threw,remaining);
        return solved;
    }

    public void clearDeck(){
        queue.clear();
    }
    public String msg(String threw, String remaining) {
        String msg="Discarded cards: " + threw + "\n"
                + "Remaining cards : " + remaining + "\n";
        return msg;
    }

}
