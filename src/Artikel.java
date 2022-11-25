import java.util.ArrayList;

public class Artikel {
    static int counter, counterArtikelnummer = 1;
    int artikelNummer, kvantitet;
    String artikelNamn;
    Double prisPerArtikel, varde;

    void assigna(int y, String z, Double f){
        artikelNummer = counterArtikelnummer;
        counterArtikelnummer++;
        if (y < 0){
            kvantitet = 0;
        } else {
            kvantitet = y;
        }

        artikelNamn = z;
        prisPerArtikel = f;
        counter++;
        kalkylera();
        enArrayList(artikelNummer, kvantitet, artikelNamn, prisPerArtikel, varde);
    }

    void kalkylera(){
        if ((kvantitet * prisPerArtikel) < 0){
            varde = 0.0;
        } else{
            varde = kvantitet * prisPerArtikel;
        }
    }

    public ArrayList<String> enArrayList(int x, int y, String z, Double f, Double v){
        ArrayList<String> arrayListan = new ArrayList<String>();
        arrayListan.add(String.valueOf(x));
        arrayListan.add(String.valueOf(y));
        arrayListan.add(z);
        arrayListan.add(String.valueOf(f));
        arrayListan.add(String.valueOf(v));
        return arrayListan;

    }

}
