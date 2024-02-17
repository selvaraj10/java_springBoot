package Thread;

public class ThreadCustomer extends Thread {
    ThreadATMMethod threadATMMethod;
    String name;
    int amountWithDraw;
    public ThreadCustomer(ThreadATMMethod threadATMMethod, String name, int amountWithdraw){
        this.threadATMMethod = threadATMMethod;
        this.name = name;
        this.amountWithDraw=amountWithdraw;
    }
    public void useAtm() {
        long balance = threadATMMethod.balanceCheck(name);
        System.out.println(name + "'s" + " Current Balance " + balance);
        threadATMMethod.withDraw(name, amountWithDraw);
    }

    public void run(){
        useAtm();
    }

}
