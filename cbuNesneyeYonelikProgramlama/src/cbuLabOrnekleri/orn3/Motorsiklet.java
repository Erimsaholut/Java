package cbuLabOrnekleri.orn3;

public class Motorsiklet extends motorluArac implements arac,suratMotoru {
    public void sur (int a)
    {
        System.out.println("sur() yordami calisti");
    }
    
    public void motorCalistir()
    {
        System.out.println("motorCalistir() yordami calisti");
    }
}
