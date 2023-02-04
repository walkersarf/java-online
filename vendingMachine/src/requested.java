import java.util.Scanner;

public class requested implements vendingMachineState{
    vendingMachine ECE;

    requested(vendingMachine machine, int choice){
        ECE = machine;
        if(choice==1){
            ECE.requested = new nagaMojo();
        }
    }
    @Override
    public void display() {
        System.out.println(ECE.requested.getName() + " -> " + ECE.requested.getPrice()+ " Tk.");
        System.out.println("Insert Cash");
    }

    @Override
    public void action() {
        if(ECE.available.getStock()==0)
            ECE.setCurrentState(new stockOut(ECE));
        else {
            insert();
            ECE.setCurrentState(new moneyDeposited(ECE));
        }
    }
    public void insert() {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        ECE.cashInserted+=cash;
    }
}
