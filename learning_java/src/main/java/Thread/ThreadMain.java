package Thread;

public class ThreadMain {
    public static void main(String []args){

        ExtendThread thread =new ExtendThread();
        thread.start();

        int i = 1;
        while(true){
            System.out.println("main" + i);
            i++;
        }
    }
}
