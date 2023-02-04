import java.util.Scanner;

public class idle implements vendingMachineState {
    vendingMachine ECE;
    idle(vendingMachine machine){
        ECE = machine;
    }
    @Override
    public void display() {
        System.out.println("Press 1 to select our only available product: Naga Mojo");
    }

    @Override
    public void action() {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        ECE.setCurrentState(new requested(ECE, choice));
    }
}
