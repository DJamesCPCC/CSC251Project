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

          // Create a PolicyHolder object
          PolicyHolder myPolicyHolder =
              new PolicyHolder(fName,lName,age,smoker,height,weight);

          Policy myPolicy = new Policy(policyNum,providerName,myPolicyHolder);

          policies.add(myPolicy);

        } catch (NumberFormatException | NoSuchElementException e) {
          System.out.println("ERROR: Invalid data format in file. Skipping entry.");
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("ERROR: File 'PolicyInformation.txt' not found");
    }

    for (int i = 0; i < policies.size(); i++) {

      if (policies.get(i).getPolicyHolder().getSmoker().equalsIgnoreCase("smoker")) {
        totalSmokers += 1;
      }

      System.out.println(policies.get(i));
      System.out.println(policies.get(i).getPolicyHolder());
    
      System.out.printf("---------------------------------------%n%n");
      System.out.println(policies.get(i));
      System.out.println(policies.get(i).getPolicyHolder());
      System.out.printf("---------------------------------------%n%n");
    }
    System.out.printf("There were %d Policy objects created.%n", policies.get(0).getPolicyCount());
    System.out.printf("The number of policies with a smoker is: %d%n", totalSmokers);
    System.out.printf("The number of policies with a non-smoker is: %d%n", policies.size() - totalSmokers);


    }
}
