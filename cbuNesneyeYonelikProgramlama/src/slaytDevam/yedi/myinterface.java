package slaytDevam.yedi;

interface MyInterface {
    double getPara();

    void setPara(double para);

    void kumarMakinesi();
}

class SlotMakinesi implements MyInterface {
    private double para = 500;

    @Override
    public double getPara() {
        return para;
    }

    @Override
    public void setPara(double para) {
        this.para = para;
    }

    @Override
    public void kumarMakinesi() {
        setPara(getPara() - 20);
        int a = (int) (Math.random() * 5 + 1);
        int b = (int) (Math.random() * 5 + 1);
        int c = (int) (Math.random() * 5 + 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if (a == b && b == c) {
            System.out.println("Tebrikler kazandınız");
            para += 300;
        } else {
            System.out.println("Üzgünüz tekrar deneyiniz");
        }
    }
}

class Test {
    public static void main(String[] args) {
        SlotMakinesi slotMakinesi = new SlotMakinesi();
        for (int i = 0; i < 5; i++) {
            System.out.println("Mevcut Para: " + slotMakinesi.getPara());
            slotMakinesi.kumarMakinesi();
            System.out.println("Yeni Para: " + slotMakinesi.getPara());
        }
    }
}
