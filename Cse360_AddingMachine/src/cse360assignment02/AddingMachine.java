package cse360assignment02;

public class AddingMachine {
	  private int total;
	  //initialize string history to 0 to initialize
	  private String history = "0";

	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }

	  public int getTotal () {
		  //The getTotal method should return the current total
	    return total;
	  }

	  public void add (int value) {
		  //add method should add the parameter to the total variable
		  //total += value;
		  total = total + value;
		  history += " + " + value;
	  }

	  public void subtract (int value) {
		  //The subtract method should subtract the parameter from the total variable
		  //total -= value;
		  total = total - value;
		  history += " - " + value;
	  }

	  public String toString () {
		  //histroy of transaction must be stored in here and start at 0
	    return history;
	  }

	  public void clear() {
		  //clear memory
	  }

	}
