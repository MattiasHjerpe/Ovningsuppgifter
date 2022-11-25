import java.util.Scanner;

public class Haintlont {
    static int basLon = 15000;
    public static void main(String[] args) {
        MySalary();
    }
    public static void MySalary(){
        Scanner input = new Scanner(System.in);
        System.out.print("Vad jobbar du som? ");
        String yrke = input.nextLine();
        yrke = yrke.toLowerCase();
        int totalLon;

        switch(yrke) {
            case "r":
                System.out.println("bra");
                break;
            case "o":
                antalTimmar();
                break;
            case "c":
                // code block
                break;
            default:
                System.out.print("Skriv in R, O eller C: ");
                break;
        }
    }
    public static int antalTimmar(){
        System.out.print("Har du arbetat över något den här månaden? J/N");
        Scanner input = new Scanner(System.in);
        String ot = input.nextLine();
        ot = ot.toLowerCase();
        int overtid = -1;

        do {
            switch (ot) {
                case "j":
                    System.out.print("Hur många timmar? (0-24) ");
                    while (input.nextInt() < 0 || input.nextInt() > 24) {
                        System.out.print("Felaktigt tal. Skriv in antal övertidstimmar mellan 0 och 24: ");
                    }
                    overtid = input.nextInt();
                    break;
                case "n":
                    overtid = 0;
                    break;
                default:
                    System.out.print("Skriv in j eller n: ");
                    break;
            }
        } while (overtid >= 0);



        return overtid;
    }
}
