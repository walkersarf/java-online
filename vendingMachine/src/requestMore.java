import java.util.Scanner;

public class requestMore implements vendingMachineState{
    vendingMachine ECE;
    requestMore(vendingMachine machine){
        ECE = machine;
    }
    @Override
    public void display() {
        System.out.println(ECE.requested.getName() + " -> " + ECE.requested.getPrice() + " Tk.");
        System.out.println("You have inserted: " + ECE.cashInserted + " Tk.");
        System.out.println("Enter " + (ECE.requested.getPrice() - ECE.cashInserted) + " Tk. more to purchase");
    }

    @Override
    public void action() {
        insert();
        ECE.setCurrentState(new moneyDeposited(ECE));
    }
    public void insert() {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        ECE.cashInserted+=cash;
    }
}
