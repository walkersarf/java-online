public class dispenseProduct implements vendingMachineState{
    vendingMachine ECE;
    dispenseProduct(vendingMachine machine){
        ECE = machine;
    }
    @Override
    public void display() {
        System.out.println("\n\t\t"+ECE.requested.getName()+" delivered :)\n");
    }

    @Override
    public void action() {
        if(ECE.cashInserted == ECE.requested.getPrice()){
            ECE.adjust();
            ECE.setCurrentState(new idle(ECE));
        }
        else{
            ECE.setCurrentState(new returnChange(ECE));
        }
    }
}
