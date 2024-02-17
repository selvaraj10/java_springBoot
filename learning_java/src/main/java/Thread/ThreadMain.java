package Thread;

public class ThreadMain {
    public static void main(String []args) throws InterruptedException {

        ExtendThread thread =new ExtendThread("Learning Thread");

//        System.out.println("name" + " " + thread.getName());
//        System.out.println("Priority" + " " + thread.getPriority());
//        System.out.println("ID"+ " " + thread.getId());
//        thread.start();
//        System.out.println("State" + " " + thread.getState());
//        System.out.println("Alive" + " " + thread.isAlive());

        thread.setDaemon(true);
        thread.join();
        Thread mainThread = Thread.currentThread();
//        mainThread.join();

        System.out.println("Current thread " + mainThread + " " + mainThread.getName() + " " + mainThread.getId() + " " + mainThread.getThreadGroup() + " "
        + mainThread.getPriority());

//        int i = 1;
//        while (i < 100) {
//            System.out.println("main" + i);
//            i++;w
//        }
    }
}
