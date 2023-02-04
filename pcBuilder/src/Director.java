import java.util.Scanner;

public class Director {
    public static void showBaseOption(){
        System.out.println("Choose a PC");
        System.out.println("1. Gaming PC\n2. PC 1 (Intel i5)\n3. PC 2 (Intel i7)\n4. PC 3 (Intel i9)");
    }
    public static void showRamOption(){
        System.out.println("1. 8 GB 2666 MHz");
        System.out.println("2. 8 GB 3200 MHz");
    }
    public static void showGPUOption(){
        System.out.println("1. 2 GB");
        System.out.println("2. 4 GB");
    }
    public static void printBaseComponents(PC pc){
        System.out.println("Base Components");
        pc.showParts();
        System.out.println("Total Cost: " + pc.getCost()+" Tk");
    }
    public PCBuilder setBase (PCBuilder pc, int n){

        return pc;
    }

    public static void main(String[] args) {
        char c;
        int i;
        orderManage newOrder = new orderManage();
        while(true){
            System.out.println("Press O to open an order\nPress E to close an order");
            Scanner sc = new Scanner(System.in);
            c = sc.next().charAt(0);
            if((c == 'O')||(c == 'o')){
                if(newOrder.getStatus()){
                    System.out.println("Order is already open. Please close current order to proceed");
                }
                else {
                    newOrder.setStatus();
                    showBaseOption();
                    i = sc.nextInt();
                    PCBuilder newPC = new PCBuilder();
                    if (i == 1) {
                        newPC.makeGamingPC();
                    } else if (i == 2) {
                        newPC.makePC1();
                    } else if (i == 3) {
                        newPC.makePC2();
                    } else if (i == 4) {
                        newPC.makePC3();
                    } else {
                        System.out.println("Wrong Input");
                    }
                    System.out.println("Do you want to add RAM? (Y/N)");
                    c = sc.next().charAt(0);
                    if ((c == 'Y') || (c == 'y')) {
                        showRamOption();
                        i = sc.nextInt();
                        if (i == 1) {
                            newPC.getPC().addItem(new ram2666());
                        } else if (i == 2) {
                            newPC.getPC().addItem(new ram3200());
                        }
                    }
                    System.out.println("Do you want to add GPU? (Y/N)");
                    c = sc.next().charAt(0);
                    if ((c == 'Y') || (c == 'y')) {
                        showGPUOption();
                        i = sc.nextInt();
                        if (i == 1) {
                            newPC.getPC().addItem(new gpu2gb());
                        } else if (i == 2) {
                            newPC.getPC().addItem(new gpu4gb());
                        }
                    }
                    newOrder.addPC(newPC.getPC());
                    System.out.println("Added to your order");
                }
            }else if((c == 'E')||(c == 'e')){
                if(newOrder.isEmpty()){
                    System.out.println("You must add an item before you can close the order");
                }
                else {
                    for(PC pc: newOrder.getAdded()){
                        pc.showParts();
                        System.out.println("Total Cost: "+pc.getCost()+ " Tk");
                    }
                    newOrder.closeOrder();
                    break;
                }
            }
            else{
                System.out.println("Wrong Input");
            }
        }
    }
}