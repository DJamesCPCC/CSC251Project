/**
 * <p>
 * Represents the information of a policy holder
 * <p>
 */

public class PolicyHolder {

   // Policy holder's first name
   private String fName;

   // Policy holder's last name
   private String lName;

   // Policy holder's age
   private int age;

   // Policy holder's smoking status
   private String smoker;

   // Policy holder's height
   private double height;

   // Policy holder's weight
   private double weight;

   // Policy holder no-arg constructor
   public PolicyHolder() {
       fName = "John";

       lName = "Doe";

       age = -1;

       smoker = "Non-Smoker";

       height = -1;

       weight = -1; 
   }

  /**
   * <p>
   * This is the policy constructor that accepts user input as arguments
   * <p>
   *
   * @param usrFName     the first name of the policy holder given by the user
   * @param usrLName     the last name of the policy holder given by the user
   * @param usrAge       the age of the policy holder given by the user
   * @param usrSmoker    is the policy holder a smoker or not
   * @param usrHeight    the height of the policy holder given by the user
   * @param usrWeight    the weight of the policy holder given by the user
   *
   *
   */
  public PolicyHolder( String usrFName, String usrLName, int usrAge, String usrSmoker,
      double usrHeight, double usrWeight) {
    fName = usrFName;
    lName = usrLName;
    age = usrAge;
    smoker = usrSmoker;
    height = usrHeight;
    weight = usrWeight;
  }
  
  /**
   * The copy constructor initalizes the object
   * as a copy of another PolicyHolder object.
   *
   * @param object2 The object to copy
   */
  public PolicyHolder( PolicyHolder object2) {
    fName = object2.fName;
    lName = object2.lName;
    age = object2.age;
    smoker = object2.smoker;
    height = object2.height;
    weight = object2.weight;
  }

  /**
   * Gets the first name of the policyholder.
   *
   * @return the first name of the policyholder
   */
  public String getFName() {
    return fName;
  }

  /**
   * Gets the last name of the policyholder.
   *
   * @return the last name of the policyholder
   */
  public String getLName() {
    return lName;
  }

  /**
   * Gets the age of the policyholder.
   *
   * @return the age of the policyholder
   */
  public int getAge() {
    return age;
  }

  /**
   * Gets the smoking status of the policyholder.
   *
   * @return the smoking status of the policyholder
   */
  public String getSmoker() {
    return smoker;
  }

  /**
   * Gets the height of the policyholder in inches.
   *
   * @return the height of the policyholder
   */
  public double getHeight() {
    return height;
  }

  /**
   * Gets the weight of the policyholder in pounds.
   *
   * @return the weight of the policyholder
   */
  public double getWeight() {
    return weight;
  }

  /**
   * Sets the first name of the policyholder.
   *
   * @param newFName the new first name
   */
  public void setFName(String newFName) {
    this.fName = newFName;
  }

  /**
   * Sets the last name of the policyholder.
   *
   * @param newLName the new last name
   */
  public void setLName(String newLName) {
    this.lName = newLName;
  }

  /**
   * Sets the age of the policyholder.
   *
   * @param newAge the new age
   */
  public void setAge(int newAge) {
    this.age = newAge;
  }

  /**
   * Sets the smoking status of the policyholder.
   *
   * @param newSmoker the new smoking status
   */
  public void setSmoker(String newSmoker) {
    this.smoker = newSmoker;
  }

  /**
   * Sets the height of the policyholder in inches.
   *
   * @param newHeight the new height
   */
  public void setHeight(double newHeight) {
    this.height = newHeight;
  }

  /**
   * Sets the weight of the policyholder in pounds.
   *
   * @param newWeight the new weight
   */
  public void setWeight(double newWeight) {
    this.weight = newWeight;
  }

  /**
   * Calculates the policyholder's BMI using the formula:
   * BMI = (Policyholder's Weight * 703) / (Policyholder's Height^2).
   *
   * @return the calculated BMI
   */
  public double calcBMI() {
    return (this.weight * 703) / (this.height * this.height);
  }
  
  /**
   * Calculates and returns the price of the insurance policy.
   * The base price is $600, with additional fees based on age, smoking status,
   * and BMI.
   *
   * @return the calculated insurance price
   */
  public double calcInsurance() {
    double BASEPAY = 600;
    double BMI = calcBMI();

    // if policyholder is 50+, there is an additional fee of $75
    if (age >= 50)
      BASEPAY = BASEPAY + 75;

    // if policyholder is a smoker, there is an additional fee of $100
    if (smoker.equalsIgnoreCase("smoker"))
      BASEPAY = BASEPAY + 100;

    // if policyholder has a BMI of over 35, there is an additional fee calculated
    // by:
    // Additional fee = (BMI - 35) * 20
    if (BMI > 35)
      BASEPAY = BASEPAY + ((BMI - 35) * 20);

    return BASEPAY;
  }

  /**
   * {@inheritDoc}
   * <p>
   * The returned string includes the Policy holder's information formatted as; 
   * "Policy Holder's First Name: [fName]"
   * "Policy Holder's Last Name: [lName]"
   * "Policy Holder's Age: [age]"
   * "Policy Holder's Smoking Status (Y/N): [smoker]"
   * "Policy Holder's Height: [height]"
   * "Policy Holder's Weight: [weight]"
   * "Policy Holder's BMI: [calcBMI()]"
   * "Policy Holder's Policy Price: [calcInsurance]"
   * <p>
   */
  @Override
  public String toString() {
      return String.format("Policy Holder's First Name: %s%n" + 
              "Policy Holder's Last Name: %s%n" +
              "Policy Holder's Age: %d%n" +
              "Policy Holder's Smoking Status (Y/N): %s%n" +
              "Policy Holder's Height: %.1f inches%n" +
              "Policy Holder's Weight: %.1f pounds%n" +
              "Policy Holder's BMI: %.2f%n" +
              "Policy Price: $%.2f%n",fName,lName,age,smoker,height,weight,calcBMI(),calcInsurance());
  }
}


