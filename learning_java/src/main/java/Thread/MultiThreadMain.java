package Thread;

public class MultiThreadMain {
    public static void main(String [] args){
        MultiThreadMethod multiThreadMethod = new MultiThreadMethod();
        MultiThreadSub1 multiThreadSub1 = new MultiThreadSub1(multiThreadMethod);
        MultiThreadSub2 multiThreadSub2 = new MultiThreadSub2(multiThreadMethod);

        multiThreadSub1.start();
        multiThreadSub2.start();
    }
}
