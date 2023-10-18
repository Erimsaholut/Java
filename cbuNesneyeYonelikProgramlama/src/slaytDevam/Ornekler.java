package slaytDevam;

public class Ornekler {
    public static void main(String[] args) {
        String[] beerBrands = new String[5];
        beerBrands[0] = "Efes";
        beerBrands[1] = "Tuborg";
        beerBrands[2] = "Carlsberg";
        beerBrands[3] = "Bomonti";
        beerBrands[4] = "Amsterdam";


        for (String a:beerBrands) {
            System.out.println(a);
        }

        Student muhammed = new Student("Mohammad","El Buhr-i Kaddayifi bin laddame ül sıddık.",711711);
        muhammed.fireTheStudent();




        Student secondOne;
        secondOne = new Student("Ahmet","düzİnsanEvladı",123123);
        secondOne.appreciate();
        System.out.println(secondOne.assesTheExam());

        int sembolSayisi;
        VeriDondur eleman = new VeriDondur();
        sembolSayisi = eleman.veriYazidir();
        System.out.println("sembolSayisi = "+ sembolSayisi);
        sembolSayisi = eleman.veriYazidir();
        System.out.println("sembolSayisi = "+ sembolSayisi);
    }
}
