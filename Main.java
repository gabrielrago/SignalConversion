import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean program = true;

        while (program) {
            System.out.println("\nChoose Conversion Type:");
            System.out.println("1. Period to Frequency");
            System.out.println("2. Frequency to Period");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter period value: ");
                double period = scanner.nextDouble();

                System.out.print("Enter period unit (s, ms, us, ns, ps): ");
                String periodUnit = scanner.next();

                System.out.print("Choose frequency to convert (Hz, KHz, MHz, GHz, THz): ");
                String desiredFrequencyUnit = scanner.next();

                double frequency = Conversion.convertPeriodToFrequency(period, periodUnit);
                //Added new feature to convert to desired unit 
                double expectedFrequency = Conversion.convertFrequencyToUnit(frequency, desiredFrequencyUnit);

                System.out.println("Frequency: " + expectedFrequency + " " + desiredFrequencyUnit);
            } else if (choice == 2) {
                System.out.print("Enter frequency value: ");
                double frequency = scanner.nextDouble();

                System.out.print("Enter frequency unit (Hz, KHz, MHz, GHz, THz): ");
                String frequencyUnit = scanner.next();

                System.out.print("Choose period to convert (s, ms, us, ns, ps): ");
                String desiredPeriodUnit = scanner.next();

                double period = Conversion.convertFrequencyToPeriod(frequency, frequencyUnit);
                //Added new feature to convert to desired unit 
                double expectedPeriod = Conversion.convertPeriodToUnit(period, desiredPeriodUnit);

                System.out.println("Period: " + expectedPeriod + " " + desiredPeriodUnit);
            } else {
                System.out.println("Invalid choice.");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String Continue = scanner.next();
            program = Continue.equalsIgnoreCase("yes");
        }

        System.out.println("Program Terminated");
    }
}