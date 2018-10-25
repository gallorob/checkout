import Checkout.Checkout;

public class Main {

    public static void main(String[] args) {

        Checkout co = new Checkout();

        co.scan('A');
        co.scan('A');
        co.scan('A');
        co.scan('A');
        co.scan('A');
        co.scan('A');
        int a = co.total();
        System.out.println(a);

        a = co.scan("AAAAAA");
        System.out.println(a);

    }

}
