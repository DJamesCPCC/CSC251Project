import java.util.*;
import java.io.*;

public class ProjectDavidJames {

  public static void main(String[] args) {

    ArrayList<Policy> policies = new ArrayList<>();
    File policyFile = new File("PolicyInformation.txt");

    int policyNum;
    String providerName;
    String fName;
    String lName;
    int age;
    String smoker;
    double height;
    double weight;
    try (Scanner fileReader = new Scanner(policyFile)) {
      while (fileReader.hasNextLine()) {
        String line = fileReader.nextLine().trim();
        if (line.isEmpty()) {
          continue; // Skip blank lines
        }

        try {
          policyNum = Integer.parseInt(line);
          providerName = fileReader.nextLine().trim();
          fName = fileReader.nextLine().trim();
          lName = fileReader.nextLine().trim();
          age = Integer.parseInt(fileReader.nextLine().trim());
          smoker = fileReader.nextLine().trim();
          height = Double.parseDouble(fileReader.nextLine().trim());
          weight = Double.parseDouble(fileReader.nextLine().trim());

          Policy insurance = new Policy(policyNum, providerName, fName, lName, age, smoker, height, weight);

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
          System.out.printf("Policy Price: $%.2f\n", insurance.calcInsurance());
        } catch (NumberFormatException | NoSuchElementException e) {
          System.out.println("ERROR: Invalid data format in file. Skipping entry.");
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("ERROR: File 'PolicyInformation.txt' not found");
    }

  }
}
