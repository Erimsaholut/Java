package finalHazilik;

public class SonOlarakTest implements mirasyediInterface {
    private int para = 3000;

    @Override
    public void paraHarca(int x) {
        para -= x;
    }

    @Override
    public int getPara(int x) {
        return para;
    }

    @Override
    public void paraBiriktir(int x) {
        para += x;
    }

    @Override
    public int getPara() {
        return para;
    }

    public static void main(String[] args) {
        SonOlarakTest test = new SonOlarakTest();
        System.out.println("Başlangıçtaki para: " + test.getPara());

        test.paraBiriktir(200);
        System.out.println("Para biriktirildikten sonra: " + test.getPara());

        test.paraHarca(100);
        System.out.println("Para harcandıktan sonra: " + test.getPara());
    }
}
