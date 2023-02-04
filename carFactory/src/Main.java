import java.util.Scanner;

public class Main {
    public static void printDetails(carFactory car){
        System.out.println("Maker\t\t\t\t: "+car.getMakerName());
        System.out.println("Colour\t\t\t\t: "+car.getColour());
        System.out.println("Manufacturing Country: "+car.getManufacturingCountry());
        System.out.println("Engine\t\t\t\t: "+car.getEngine());
        System.out.println("Drivetrain\t\t\t: "+car.getDrivetrain());
    }
    public static void main(String[] args) {

        System.out.println("Welcome! \nPlease select your continent:\n1) Asia \n2) Europe \n3)North America");
        int continent;
        Scanner sc = new Scanner(System.in);
        continent = sc.nextInt();

        System.out.println("Please wait while we find the perfect car suitable for your region");
        if(continent==1){
            toyotaFactory resultCar = new toyotaFactory();
            printDetails(resultCar);
        }
        else if(continent==2){
            bmwFactory resultCar = new bmwFactory();
            printDetails(resultCar);
        }
        else if(continent==3){
            teslaFactory resultCar = new teslaFactory();
            printDetails(resultCar);
        }
        else{
            System.out.printf("Wrong Input");
        }
    }
}