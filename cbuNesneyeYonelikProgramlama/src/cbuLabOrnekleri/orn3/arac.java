package cbuLabOrnekleri.orn3;

import gercektenOkuldaYaptiklarimiz.interfaceOrnek.Arac;

public interface arac {
    int hiz = 120;
    String renk = "mavi";
    public default void solaSagaDon()
    {
        System.out.println("solaSagaDon() yordami calisti");
    }
    public default void sur()
    {
        System.out.println("sur() yordami calisti");
    }
}


