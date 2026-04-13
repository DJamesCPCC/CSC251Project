/**
 * Represents an insurance policy.
 */
public class Policy {
  // insurance policy number
  int policyNum;

  // insurance provider name
  String providerName;

  // policyholder's first name
  String fName;

  // policyholder's last name
  String lName;

  // policyholder's age
  int age;

  // policyholder's smoking status
  String smoker;

  // policyholder's height (in inches)
  double height;

  // policyholder's weight (in pounds)
  double weight;

  // Policy no-arg constructor
  public Policy() {

    policyNum = -1;

    providerName = "InsName";

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
   * @param usrPolicyNum the policy number given by the user
   * @param usrProvider  the insurance policy provider name given by the user
   * @param usrFName     the first name of the policy holder given by the user
   * @param usrLName     the last name of the policy holder given by the user
   * @param usrAge       the age of the policy holder given by the user
   * @param usrSmoker    is the policy holder a smoker or not
   * @param usrHeight    the height of the policy holder given by the user
   * @param usrWeight    the weight of the policy holder given by the user
   *
   *
   */
  public Policy(int usrPolicyNum, String usrProvider, String usrFName, String usrLName, int usrAge, String usrSmoker,
      double usrHeight, double usrWeight) {

    policyNum = usrPolicyNum;

    providerName = usrProvider;

    fName = usrFName;

    lName = usrLName;

    age = usrAge;

    smoker = usrSmoker;

    height = usrHeight;

    weight = usrWeight;
  }

  /**
   * <p>
   * Gets the policy number.
   * <p>
   *
   * @return the policy number
   */
  public int getPolicyNum() {
    return policyNum;
  }

  /**
   * Gets the provider name.
   *
   * @return the provider name
   */
  public String getProviderName() {
    return providerName;
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
   * Sets the policy number.
   *
   * @param newPolicyNum the new policy number
   */
  public void setPolicyNum(int newPolicyNum) {
    this.policyNum = newPolicyNum;
  }

  /**
   * Sets the provider name.
   *
   * @param newProviderName the new provider name
   */
  public void setProviderName(String newProviderName) {
    this.providerName = newProviderName;
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
}
