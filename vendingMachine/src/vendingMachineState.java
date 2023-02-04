public interface vendingMachineState {
    public void display();
    public void action();
    default void doYourJob(){
        display();
        action();
    }
}
