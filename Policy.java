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

    fName = "fName";

    lName = "lName";

    age = -1;

    smoker = "non-smoker";

    height = -1;

    weight = -1;
  }

  // Policy constructor that accepts user input as arguments
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

  // accessor methods
  public int getPolicyNum() {
    return policyNum;
  }

  public String getProviderName() {
    return providerName;
  }

  public String getFName() {
    return fName;
  }

  public String getLName() {
    return lName;
  }

  public int getAge() {
    return age;
  }

  public String getSmoker() {
    return smoker;
  }

  public double getHeight() {
    return height;
  }

  public double getWeight() {
    return weight;
  }

  // mutator methods
  public void setPolicyNum(int newPolicyNum) {
    this.policyNum = newPolicyNum;
  }

  public void setProviderName(String newProviderName) {
    this.providerName = newProviderName;
  }

  public void setFName(String newFName) {
    this.fName = newFName;
  }

  public void setLName(String newLName) {
    this.lName = newLName;
  }

  public void setAge(int newAge) {
    this.age = newAge;
  }

  public void setSmoker(String newSmoker) {
    this.smoker = newSmoker;
  }

  public void setHeight(int newHeight) {
    this.height = newHeight;
  }

  public void setWeight(int newWeight) {
    this.weight = newWeight;
  }

  // calculates the policyholder's BMI using the following formula:
  // BMI = (Policyholder's Weight * 703) / (Policyholder's Height^2)
  public double calcBMI() {
    return (this.weight * 703) / (this.height * this.height);
  }

  // calculates and returns the price of the insurance policy
  public double calcInsurance() {

    double BASEPAY = 600;
    double BMI = calcBMI();

    // if policyholder is 50+, there is an additional fee of $75
    if (age >= 50)
      BASEPAY = BASEPAY + 75;

    // if policyholder is a smoker, there is an additonal fee of $100
    if (smoker.equalsIgnoreCase("smoker"))
      BASEPAY = BASEPAY + 100;

    // if policyholder has a BMI of over 35, there os an additonal fee calculated
    // by:
    // Additional fee = (BMI - 35) * 20
    if (BMI > 35)
      BASEPAY = BASEPAY + ((BMI - 35) * 20);

    return BASEPAY;
  }
}
