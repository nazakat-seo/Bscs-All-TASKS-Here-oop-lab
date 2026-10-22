class Multiply{
    int multiply(int a,int b){

        return a*b;
    }
    int multiply(int a,int b,int c) {
        return a * b * c;
    }
}

public class Main {
    public static void main(String[] args) {
        Multiply multi= new Multiply();
        System.out.println(multi.multiply(2, 4));
        System.out.println(multi.multiply(2, 3, 6));

    }
}