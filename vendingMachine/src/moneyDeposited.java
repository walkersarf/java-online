public class moneyDeposited implements vendingMachineState{
    vendingMachine ECE;
    moneyDeposited(vendingMachine machine){
        ECE = machine;
    }
    @Override
    public void display() {
        System.out.println("Please wait while we process your request");
    }

    @Override
    public void action() {
        if(ECE.cashInserted < ECE.requested.getPrice()){
            ECE.setCurrentState(new requestMore(ECE));
        }
        else {
            ECE.setCurrentState(new dispenseProduct(ECE));
        }
    }
}
