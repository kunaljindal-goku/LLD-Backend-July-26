public class Client {

    public static void main(String args[]) throws InterruptedException {
        System.out.println("hello");

//        NumberPrinter numberPrinter = new NumberPrinter();
//       Thread t = new Thread(numberPrinter);
//       t.start();

        for(int i=1;i<=10000;i++) {
            IndividualNumberPrinter inp = new IndividualNumberPrinter(i);
            Thread t = new Thread(inp);
            t.start();
        }

        System.out.println("Hello");
    }
}
