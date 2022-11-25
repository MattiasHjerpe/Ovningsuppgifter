import java.util.Scanner;

public class Kryptera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv in ordet som ska krypteras: ");
        String orginalOrdet = input.nextLine();
        char[] krypteradArray = new char[orginalOrdet.length()];

        for (int i = 0; i < orginalOrdet.length(); i++){
            krypteradArray[i] = orginalOrdet.charAt(i);
            krypteradArray[i] += 3;
        }

        for (char c:krypteradArray){
            System.out.print(c);
        }



    }
}
