public class vendingMachine {
    int cashInserted;
    product requested;
    product available;
    private vendingMachineState currentState;

    vendingMachine(){
        available = new nagaMojo();
        available.setStock(2);
        currentState = new idle(this);
    }

    public void adjust(){
        available.setStock(available.getStock()-1);
        cashInserted = 0;
    }


    public void setCurrentState(vendingMachineState st) {
        this.currentState = st;
    }

    public void insert (){
    }

    public void action(){
        currentState.doYourJob();
    }
}
