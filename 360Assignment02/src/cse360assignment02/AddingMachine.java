package cse360assignment02;

/**
 * The adding machine class can add and subtract from a total. 
 * A history of all transactions, and the total can be cleared and returned.
 * 
 * @author Lucas Merbeth
 */
public class AddingMachine {
  private int total;
  
  /**
   * The AddingMachine method is the constructor for the AddingMachine class.
   * It initializes total to 0.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * The getTotal method returns the total of the AddingMachine class.
   */
  public int getTotal () {
    return 0;
  }
  
  /**
   * The add method adds an integer parameter value with total.
   * 
   * @param value an integer that is to be added with total .
   */
  public void add (int value) {
  }

  /**
   * The subtract method subtracts an integer parameter value from total.
   * 
   * @param value an integer that is to be subtracted from total
   */
  public void subtract (int value) {
  }

  /**
   * The toString method returns the history of transactions as a String.
   */
  public String toString () {
    return "";
  }

  /**
   * The clear method clears the AddingMachine, getting rid of the history
   * and setting the total to 0.
   */
  public void clear() {
  }
}