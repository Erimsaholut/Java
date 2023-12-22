package slaytlar;

class EnUstClass {
    int maas = 9000;


    void printMaas() {

        System.out.println(maas);
    }
}

class OrtaClass extends EnUstClass {
    OrtaClass() {
        super();
        maas = 6000;
    }
}

class AltClass extends OrtaClass {
    AltClass() {
        maas = 3000;
    }
}

class EnAltClass extends OrtaClass {
    EnAltClass() {
        maas = 0;
    }
}
