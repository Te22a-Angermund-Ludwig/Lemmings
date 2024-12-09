import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        List<Lemming> Characters = new ArrayList<>();
        Random rnd = new Random();
        int amount = 0;
        int type;

        while(amount<=0){
            System.out.println("Hur många Lemmings vill du skapa?");
            amount = myScanner.nextInt();
        }

        for (int i = 0; i < amount; i++) {
            type = rnd.nextInt(0,5);
            if (type==1){
                Lemming lemming = new Lemming();
                Characters.add(lemming);
            } else if (type==2) {
                Exploder exploder = new Exploder();
                Characters.add(exploder);
            }else if(type==3){
                Jumper jumper = new Jumper();
                Characters.add(jumper);
            } else if (type==4) {
                Digger digger = new Digger();
                Characters.add(digger);
            }
        }
    }
}