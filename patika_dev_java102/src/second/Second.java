package second;

import first.First;

public class Second {
    public static void main(String[] args) {

        First accessModifiersTest2 = new First("turgutluluyum");

    }
}
class PrivateExample {
    private int privateVariable;

    private void privateMethod() {
        // Metot içeriği
    }
}
 class PublicExample {
    public int publicVariable;

    public void publicMethod() {
        // Metot içeriği
    }
}
class ProtectedExample {
    protected int protectedVariable;

    protected void protectedMethod() {
        // Metot içeriği
    }
}