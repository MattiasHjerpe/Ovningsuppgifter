import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class IngaDubletter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int i = 0, y = 0;
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> namesRensad = new ArrayList<String>();

        while (!input.equals("quit")){
            System.out.print("Skriv in ett namn eller quit: ");
            names.add(scanner.next());
            input = names.get(i).toLowerCase();

            if(input.equals("quit")){
                names.remove(i);
            }
            i++;
        }

        Collections.sort(names);
        int k = names.size();

        for(int p = 0; p < names.size(); p++){
            if(!namesRensad.contains(names.get(p))){
                namesRensad.add(names.get(p));
            }
        }

        System.out.println(namesRensad);
    }
}

