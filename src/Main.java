import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car type: ");
        String carType = sc.next();

        System.out.println("Enter number of services");
        int numberOfService = sc.nextInt();
        String serviceCodes[] = new String[numberOfService];

        System.out.println("Provide service codes");
        for(int i=0;i<numberOfService;i++){
            serviceCodes[i] = sc.next();
        }

        int totalBill = 0;
        System.out.println("Type of Car: " + carType);
        System.out.println("Service Codes: ");

        for (String code:serviceCodes){
            System.out.println(code +" ");
            if(CarService.carServiceCharges.containsKey(carType) && CarService.carServiceCharges.get(carType).containsKey(code)){
                int serviceCharge = CarService.carServiceCharges.get(carType).get(code);
                System.out.print("Charge for " + getServiceName(code) + " " + serviceCharge);
                totalBill += serviceCharge;
            }
            System.out.println();
        }
        System.out.println("Total Bill " + totalBill);
        if(totalBill > 10000){
            System.out.println("You are Eligible for Complimentary Cleaning");
        }

    }
    public static String getServiceName(String code){
        switch (code){
            case "BS01":
                return "Basic Servicing";
            case  "EF01":
                return "Engine Fixing";
            case "CF01":
                return "Clutch Fixing";
            case "BF01":
                return "Brake Fixing";
            case "GF01":
                return "Gear Fixing";

            default:
                return "unknown service";
        }
    }
}