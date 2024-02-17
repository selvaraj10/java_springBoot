package Thread;

public class ExtendThread extends Thread {

    public ExtendThread(String name){
        super(name);
//        setPriority(Thread.MAX_PRIORITY - 3);
    }
    public void run(){
        int i = 1;
        while (i< 50){
            System.out.println("run" + i++);
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
