public class returnChange implements vendingMachineState {
    vendingMachine ECE;
    returnChange(vendingMachine machine){
        ECE = machine;
    }
    @Override
    public void display() {
        System.out.println("\t\t"+(ECE.cashInserted-ECE.requested.getPrice()+" Tk. returned\n"));
    }
    @Override
    public void action() {
        ECE.adjust();
        ECE.setCurrentState(new idle(ECE));
    }
}
