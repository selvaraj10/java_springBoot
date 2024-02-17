package Thread;

public class MultiThreadSub2 extends Thread{
    MultiThreadMethod multiThreadMethod;
    public MultiThreadSub2(MultiThreadMethod multiThreadMethod){
        this.multiThreadMethod = multiThreadMethod;
    }
    public void run(){
        multiThreadMethod.display("Welcome ");
    }
}
