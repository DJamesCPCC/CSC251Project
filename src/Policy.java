/**
 * <p>
 * Represents an insurance policy.
 * <p>
 *
 */
public class Policy {
  // insurance policy number
  int policyNum;

  // insurance provider name
  String providerName;

  // Policy no-arg constructor
  public Policy() {

    policyNum = -1;

    providerName = "InsName";

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
  public Policy(int usrPolicyNum, String usrProvider) {

    policyNum = usrPolicyNum;

    providerName = usrProvider;
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

}
