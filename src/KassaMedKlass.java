import java.util.ArrayList;

public class KassaMedKlass {
    static int counterKopnummer = 1;

    public static void main(String[] args) {
        //Varor();
        System.out.println("hej");





    }
    public static String Stjarnor(){
        String g = "*";
        for (int i = 0; i < 20; i++){
            g += "*";
        }
        return  g;
    }

    public static String Cashier(){
        String ettKop = "";

        return  ettKop;
    }

    public void Varor(){
        Artikel a1= new Artikel();
        Artikel a2= new Artikel();
        a1.assigna(9726, "Mjöl", 12.0);
        a2.assigna(534, "Socker", 20.0);
    }

}
