package Thread;

public class ThreadMainATM {
    public static void main(String []args) {
        ThreadATMMethod threadATMMethod = new ThreadATMMethod();
        ThreadCustomer threadCustomer_1 = new ThreadCustomer(threadATMMethod, "Selva", 2000);
        ThreadCustomer threadCustomer_2 = new ThreadCustomer(threadATMMethod, "Harini", 1200);
        threadCustomer_1.start();
        threadCustomer_2.start();
    }
}
