import java.util.Scanner;

public class GissaTalIgen {
    static int counter = 0;

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu(){
        Scanner input = new Scanner(System.in);
        System.out.printf("1. Nytt Spel%n2. Visa Statistik%n3. Avsluta%n");
        while (true){
            int selectMenu = input.nextInt();
            switch (selectMenu){
                case 1: {
                    playGame();
                    break;
                }
                case 2: {
                    System.out.println(counter);
                    break;
                }
                case 3: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Ogilitigt menyval, försök igen: ");
                    break;
                }
            }
        }
    }

    public static void playGame(){
        Scanner gissatTal = new Scanner(System.in);
        int secretNumber = 1 + (int)(Math.random() * 5);
        System.out.printf("%nGissa ett tal mellan 1 och 5: ");
        int tal = gissatTal.nextInt();

        if (tal == secretNumber){
            System.out.printf("Grattis, 5 poäng!%n");
            statistics(5);
        } else {
            System.out.printf("FEL!%n");
        }
        showMenu();
    }

    public static void statistics(int x){
        counter += x;
    }
}
