package cbuLabOrnekleri.orn3;

public class motorluArac {
    int beygirGucu;
    public benzin b = new benzin ();
    public motor mm = new motor ();

    public void motorCalistir(int a)
    {

    }
    public boolean arizaKontrol (){
        System.out.println("Arıza yok");
        return true;
    }

    // oluşturulurken otomatik olarak arizaKontrol metodu çalissin(yapici metod)
    public motorluArac (){
        arizaKontrol();
    }
}
