package methods;

public class method1 {
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    static void print(){
        System.out.println("Method with no paramater");
    }

    static void print(int a){
        System.out.println("Method with int "+a+" paramater");
    }
    static void print(double a){
        System.out.println("Method with double "+a+" paramater");
    }
    static void print(int a,int b){
        System.out.println("Method with int "+a+" and "+b+" paramater");
    }

    static void print(char a,int b){
        System.out.println("Method with char "+a+" and int "+b+" paramater");
    }

    static void print(int b,char a){
        System.out.println("Method with int int "+a+" and char "+b+" paramater");
    }

    public static void main(String[] args) {

        System.out.println(power(2, 3));
        print();
        print(5);
        print(5.0);
        print(5, 9);
        print('a',5);
        print(5,'b');
    }
}
