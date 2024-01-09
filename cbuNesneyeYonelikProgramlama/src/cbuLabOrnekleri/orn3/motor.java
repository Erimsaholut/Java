package cbuLabOrnekleri.orn3;

public class motor{
    int motorHacmi = 1400;
    public disliSeti ds = new disliSeti();

    public motor ()
    {
        // ??? ödev
        disliSeti ds = new disliSeti();
        ds.calistir();
    }
    //inner class
    public static class disliSeti {
        public void calistir ()
        {
            System.out.println("calistir() yordami calisti");
        }
    }
}
