package game;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class game {

//    static ArrayList<Integer> npc = new ArrayList<>();
    static int temp[];
    static Timer timer = new Timer();
    static Scanner input = new Scanner(System.in);
    static Queue<Integer> npc = new LinkedList<>();
    static Stack poin_npc = new Stack();

    static void antrian_npc() {
        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                npc.add((int) (Math.random() * 10) + 1);
                System.out.println("---------------------");
                    System.out.println(npc);
                if(npc.size() == 10){
                    timer.cancel();
                }
            }
        }, 0, 2000);
    }
    
    static void turn2back(){
        
    }

    static void poin() {

    }

    public static void main(String[] args) {
        antrian_npc();
    }
}
