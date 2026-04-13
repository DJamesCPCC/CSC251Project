/**
 * <p>
 * Represents an insurance policy.
 * <p>
 */
public class Policy {
  // insurance policy number
  private int policyNum;

  // insurance provider name
  private String providerName;

  // policy holder information
  private PolicyHolder policyHolder;

  // counter to keep track of the number of polices
  private static int policyCount = 0;

  // Policy no-arg constructor
  public Policy() {

    policyNum = -1;

    providerName = "InsName";

    policyCount ++;
  }

  /**
   * <p>
   * This is the policy constructor that accepts user input as arguments
   * <p>
   *
   * @param usrPolicyNum the policy number given by the user
   * @param usrProvider  the insurance policy provider name given by the user
   *
   */
  public Policy(int usrPolicyNum, String usrProvider, PolicyHolder pHolder) {
    policyNum = usrPolicyNum;
    providerName = usrProvider;
    policyCount ++;
    policyHolder = new PolicyHolder(pHolder);
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
   * <p>
   * Gets the provider name.
   * <p>
   *
   * @return the provider name
   */
  public String getProviderName() {
    return providerName;
  }

  /**
   * <p>
   * Gets policy holder information
   * <p>
   *
   * @return A reference to a copy of this policy's 
   *         policy holder innformation
   */
  public PolicyHolder getPolicyHolder() {
      return new PolicyHolder(policyHolder);
  }
  /**
   * <p>
   * Gets the number of policy objects created
   * <p> 
   *
   * @return the number of policies created
   */
  public int getPolicyCount() {
      return policyCount;
  }

  /**
   * <p>
   * Sets the policy number.
   *<p>
   *
   * @param newPolicyNum the new policy number
   */
  public void setPolicyNum(int newPolicyNum) {
    this.policyNum = newPolicyNum;
  }

  /**
   * <p>
   * Sets the provider name.
   * <p>
   *
   * @param newProviderName the new provider name
   */
  public void setProviderName(String newProviderName) {
    this.providerName = newProviderName;
  }

  /**
   * {@inheritDoc}
   * <p>
   * The returned string includes the Policy number and Provider's name 
   * formatted as; 
   * "Policy Number: [policyNum]"
   * "Provider Name: [providerName]"
   * <p>
   */
  @Override
  public String toString() {
      return String.format("Policy Number: %d%n" +
              "Provider Name: %s", policyNum, providerName);
  }
}
