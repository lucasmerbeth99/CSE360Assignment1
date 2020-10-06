package cse360assignment02;

/**
 * The adding machine class can add and subtract from a total. 
 * A history of all transactions, and the total can be cleared and returned.
 * 
 * @author Lucas Merbeth
 */
public class AddingMachine {
  private int total;
  private String history;
  
  /**
   * The AddingMachine method is the constructor for the AddingMachine class.
   * It initializes total to 0.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  /**
   * The getTotal method returns an integer representing the total of the AddingMachine class.
   */
  public int getTotal () {
    return this.total;
  }
  
  /**
   * The add method adds an integer parameter value with total.
   * 
   * @param value an integer that is to be added with total .
   */
  public void add (int value) {
	  this.total += value;
	  this.history = this.history + " + " + value;
  }

  /**
   * The subtract method subtracts an integer parameter value from total.
   * 
   * @param value an integer that is to be subtracted from total
   */
  public void subtract (int value) {
	  this.total = this.total - value;
	  this.history = this.history + " - " + value;
  }

  /**
   * The toString method returns the history of transactions as a String.
   */
  public String toString () {
    return this.history;
  }

  /**
   * The clear method clears the AddingMachine, setting the total to 0.
   * The history is cleared, and set to a String containing 0. 
   */
  public void clear() {
	  this.total = 0;
	  this.history = "0";
  }
  
  public static void main(String [] args) {
	  AddingMachine myCalculator = new AddingMachine();
	  myCalculator.add (4); 
	  myCalculator.subtract (2); 
	  myCalculator.add(5);
	  System.out.println(myCalculator.toString());
	  System.out.println(myCalculator.getTotal());
	  myCalculator.clear();
  }
}