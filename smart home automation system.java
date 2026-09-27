import java.util.Scanner;

public class SmartHomeAutomation {

    static boolean lights = false;
    static boolean fan = false;
    static boolean ac = false;
    static boolean security = true;

    static Scanner sc = new Scanner(System.in);

    static void showStatus() {
        System.out.println("\n--- HOME STATUS ---");
        System.out.println("Lights   : " + (lights ? "ON" : "OFF"));
        System.out.println("Fan      : " + (fan ? "ON" : "OFF"));
        System.out.println("AC       : " + (ac ? "ON" : "OFF"));
        System.out.println("Security : " + (security ? "ARMED" : "DISARMED"));
    }

    static void controlLights() {
        System.out.println("\n1. Turn ON");
        System.out.println("2. Turn OFF");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            lights = true;
            System.out.println("Lights turned ON.");
        } else if (choice == 2) {
            lights = false;
            System.out.println("Lights turned OFF.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    static void controlFan() {
        System.out.println("\n1. Turn ON");
        System.out.println("2. Turn OFF");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            fan = true;
            System.out.println("Fan turned ON.");
        } else if (choice == 2) {
            fan = false;
            System.out.println("Fan turned OFF.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    static void controlAC() {
        System.out.println("\n1. Turn ON");
        System.out.println("2. Turn OFF");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            ac = true;
            System.out.println("AC turned ON.");
        } else if (choice == 2) {
            ac = false;
            System.out.println("AC turned OFF.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    static void controlSecurity() {
        System.out.println("\n1. Arm Security");
        System.out.println("2. Disarm Security");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1) {
            security = true;
            System.out.println("Security system ARMED.");
        } else if (choice == 2) {
            security = false;
            System.out.println("Security system DISARMED.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n================================");
            System.out.println("   SMART HOME AUTOMATION SYSTEM");
            System.out.println("================================");
            System.out.println("1. Control Lights");
            System.out.println("2. Control Fan");
            System.out.println("3. Control AC");
            System.out.println("4. Control Security");
            System.out.println("5. Show Home Status");
            System.out.println("6. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    controlLights();
                    break;

                case 2:
                    controlFan();
                    break;

                case 3:
                    controlAC();
                    break;

                case 4:
                    controlSecurity();
                    break;

                case 5:
                    showStatus();
                    break;

                case 6:
                    System.out.println("Smart Home System closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
