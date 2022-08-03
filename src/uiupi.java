import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class uiupi {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Random r = new Random();
        int randomValue = r.nextInt();
        if (randomValue <= 2) {
            System.out.println("April");
        } else {
            System.out.println("May");
        }
        if (randomValue % 2 == 0) {
            System.out.println("September");
        } else {
            System.out.println("January");
        }

        Random random = new Random();
        int month = random.nextInt(12);

        if(month%2==0)
        {
        System.out.println("Lose");
        }
        else
        {
        System.out.println("Win");
        }
}
}