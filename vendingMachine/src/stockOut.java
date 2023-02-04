public class stockOut implements vendingMachineState{
    vendingMachine ECE;
    stockOut(vendingMachine machine){
        ECE = machine;
    }
    @Override
    public void display() {
        System.out.println("Out of Stock");
    }

    @Override
    public void action() {
        System.exit(0);
        ECE.setCurrentState(new idle(ECE));
    }
}
