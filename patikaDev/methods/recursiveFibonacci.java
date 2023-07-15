package methods;

public class recursiveFibonacci {

    static int fib(int a){
        if (a==0){
            return 0;
        }else if(a==1){
            return 1;
        }

        return fib(a-1) + fib(a-2);
    }

    public static void main(String[] args) {

        System.out.println(fib(7));
    }
}
