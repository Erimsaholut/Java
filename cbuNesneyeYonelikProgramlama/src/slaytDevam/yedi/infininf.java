package slaytDevam.yedi;

interface a {
    interface b {
        void method2();
    }

    void method1();
}

interface c {
    interface a{};
    void method3();

}

class test implements c{

    @Override
    public void method3() {
        System.out.println();
    }
}