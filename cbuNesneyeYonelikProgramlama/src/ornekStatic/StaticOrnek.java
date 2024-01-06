package ornekStatic;

public class StaticOrnek {
    public static int staticA;
    public int a;

    public static void setStaticA(int deger) {
        staticA = deger;
    }

    public void setA(int deger) {
        a = deger;
    }

    public int getStaticA() {
        return staticA;
    }

    public int getA() {
        return a;
    }
}

