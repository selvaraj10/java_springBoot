package Thread;

public class MultiThreadMethod {
    public void display(String string){
        synchronized (this){
        for (int i = 0 ; i < string.length();  i++){
            System.out.print(string.charAt(i));
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
}
