package Thread;

public class ExtendThread extends Thread {

    public void run(){
        int i = 1;
        while(true){
            System.out.println("sub" + i);
            i++;
        }
    }
}
