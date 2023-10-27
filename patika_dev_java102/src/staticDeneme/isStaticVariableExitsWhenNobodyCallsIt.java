package staticDeneme;

public class isStaticVariableExitsWhenNobodyCallsIt {
    static String myStaticVariable = "Yes";

    static void isItAlsoTrueForFunctions() {
        System.out.println("Yes");
    }

    {
        System.out.println("Naber");
    }
}
