package Thread;

public class ThreadATMMethod {

     long Selva_Balance = 12000;
     long Harini_Balance = 125000;

    synchronized public long balanceCheck(String name) {
        if (name.equalsIgnoreCase("selva")) {
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            return Selva_Balance;

        } else if (name.equalsIgnoreCase("harini")) {
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            return Harini_Balance;

        } else {
            System.out.println("Invalid User");
            return -0;
        }

    }
    synchronized public void withDraw(String name, int amount){
        if (name.equalsIgnoreCase("selva")) {
              Selva_Balance = Selva_Balance -  amount;
            System.out.println("User : " + name);
            System.out.println("Withdraw amount : " + amount);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println("Hi " + name + " Your Current Balance = " + Selva_Balance);

        } else if (name.equalsIgnoreCase("harini")) {
            Harini_Balance = Harini_Balance - amount;
            System.out.println("User : " + name);
            System.out.println("Withdraw amount : " + amount);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println("Hi " + name + " Your Current balance " + Harini_Balance);

        } else {
            System.out.println("Invalid User");
        }
    }
}
