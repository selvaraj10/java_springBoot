package Thread;

public class MultiThreadSub1 extends Thread {
    MultiThreadMethod multiThreadMethod;
    public MultiThreadSub1(MultiThreadMethod multiThreadMethod){
        this.multiThreadMethod = multiThreadMethod;
    }
    public void run(){
        multiThreadMethod.display("Hello World ");
    }
}
