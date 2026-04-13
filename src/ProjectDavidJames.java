import java.util.*;
import java.io.*;

public class ProjectDavidJames {

  public static void main(String[] args) {

    ArrayList<Policy> policies = new ArrayList<>();
    File policyFile = new File("../PolicyInformation.txt");

    int policyNum;
    String providerName;
    String fName;
    String lName;
    int age;
    String smoker;
    double height;
    double weight;
    int totalSmokers = 0;
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
          policies.add(insurance);

        } catch (NumberFormatException | NoSuchElementException e) {
          System.out.println("ERROR: Invalid data format in file. Skipping entry.");
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("ERROR: File 'PolicyInformation.txt' not found");
    }

    for (int i = 0; i < policies.size(); i++) {

      if (policies.get(i).getSmoker().equalsIgnoreCase("smoker")) {
        totalSmokers += 1;
      }

      System.out.printf("---------------------------------------\n");
      System.out.printf("Policy Information:\n");
      System.out.printf("Policy Number: %d\n", policies.get(i).getPolicyNum());
      System.out.printf("Provider Name: %s\n", policies.get(i).getProviderName());
      System.out.printf("Policyholder's First Name: %s\n", policies.get(i).getFName());
      System.out.printf("Policyholder's Last Name: %s\n", policies.get(i).getLName());
      System.out.printf("Policyholder's Age: %d\n", policies.get(i).getAge());
      System.out.printf("Policyholder's Smoking Status (smoker/non-smoker): %s\n", policies.get(i).getSmoker());
      System.out.printf("Policyholder's Height: %.2f inches\n", policies.get(i).getHeight());
      System.out.printf("Policyholder's Weight: %.2f pounds\n", policies.get(i).getWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).calcBMI());
      System.out.printf("Policy Price: $%.2f\n", policies.get(i).calcInsurance());
      System.out.printf("---------------------------------------\n\n");
    }

    System.out.printf("The number of policies with a smoker is: %d\n", totalSmokers);
    System.out.printf("The number of policies with a non-smoker is: %d\n", policies.size() - totalSmokers);

  }
}
