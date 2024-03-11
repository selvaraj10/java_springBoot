package LamdaExpressions;

public class Main {
    public static void main(String[] args) {
        LambdaInterface lambdaInterface1 = Main::Reverse;
        lambdaInterface1.display("Selva");

    }

    public static void Reverse(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
