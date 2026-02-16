import java.util.Scanner;

public class ProjectDavidJames {

  public static void main(String[] args) {

    try (Scanner keyboard = new Scanner(System.in)) {
      int policyNum;
      while (true) {
        System.out.print("Please enter the Policy Number: ");
        try {
          policyNum = Integer.parseInt(keyboard.nextLine());
          if (policyNum > 0) {
            break;
          } else {
            System.out.println("Please enter a valid Policy Number.");
          }
        } catch (NumberFormatException e) {

          System.out.println("Invalid Input. Please enter a valid integer.");
        }
      }

      String providerName;
      while (true) {
        System.out.print("Please enter the Provider Name: ");
        try {
          providerName = keyboard.nextLine();
          if (providerName != null && !providerName.isEmpty()) {
            break;
          } else {
            System.out.println("Please enter a valid Provider Name.");
          }
        } catch (NumberFormatException e) {

          System.out.println("Invalid Input. Please enter a valid String.");
        }
      }

      String fName;
      while (true) {
        System.out.print("Please enter the Policyholder's First Name: ");
        try {
          fName = keyboard.nextLine();
          if (fName != null && !fName.isEmpty() && !fName.matches(".*\\d.*")) {
            break;
          } else {
            System.out.println("Please enter a valid First Name.");
          }
        } catch (NumberFormatException e) {

          System.out.println("Invalid Input. Please enter a valid String.");
        }
      }

      String lName;
      while (true) {
        System.out.print("Please enter the Policyholder's Last Name: ");
        try {
          lName = keyboard.nextLine();
          if (lName != null && !lName.isEmpty() && !lName.matches(".*\\d.*")) {
            break;
          } else {
            System.out.println("Please enter a valid Last Name.");
          }
        } catch (NumberFormatException e) {

          System.out.println("Invalid Input. Please enter a valid String.");
        }
      }

      int age;
      while (true) {
        System.out.print("Please enter the Policyholder's Age: ");
        try {
          age = Integer.parseInt(keyboard.nextLine());
          if (age > 0) {
            break;
          } else {
            System.out.println("Please enter a valid Age.");
          }
        } catch (NumberFormatException e) {

          System.out.println("Invalid Input. Please enter a valid integer.");
        }
      }
      String smokingStaus;
      while (true) {
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        try {
          smokingStaus = keyboard.nextLine();
          if (smokingStaus != null && !smokingStaus.isEmpty()
              && (smokingStaus.equalsIgnoreCase("smoker") || smokingStaus.equalsIgnoreCase("non-smoker"))) {
            break;
          } else {
            System.out.println("Please enter a valid Smoking status.");
          }
        } catch (NumberFormatException e) {

          System.out.println("Invalid Input. Please enter a valid String.");
        }
      }

      double height;
      while (true) {
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        try {
          height = Double.parseDouble(keyboard.nextLine());
          if (height > 0) {
            break;
          } else {
            System.out.println("Please enter a valid height.");
          }
        } catch (NumberFormatException e) {

          System.out.println("Invalid Input. Please enter a valid integer.");
        }
      }
      double weight;
      while (true) {
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        try {
          weight = Double.parseDouble(keyboard.nextLine());
          if (weight > 0) {
            break;
          } else {
            System.out.println("Please enter a valid weight.");
          }
        } catch (NumberFormatException e) {

          System.out.println("Invalid Input. Please enter a valid integer.");
        }
      }

      Policy insurance = new Policy(policyNum, providerName, fName, lName, age, smokingStaus, height, weight);

      System.out.println("\nPolicy Information");
      System.out.println("----------------------------");
      System.out.println("Policy Number: " + insurance.getPolicyNum());
      System.out.println("Provider Name: " + insurance.getProviderName());
      System.out.println("Policyholder's First Name: " + insurance.getFName());
      System.out.println("Policyholder's Last Name: " + insurance.getLName());
      System.out.println("Policyholder's Age: " + insurance.getAge());
      System.out.println("Policyholder's Smoking Status: " + insurance.getSmoker());
      System.out.println("Policyholder's Height: " + insurance.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + insurance.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", insurance.calcBMI());
      System.out.printf("Policy Price: $%.2f", insurance.calcInsurance());
    }
  }
}
