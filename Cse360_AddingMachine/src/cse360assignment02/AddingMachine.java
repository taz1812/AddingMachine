/*
Tazreen Khan CSE 360 Assignment 01
AddingMachine contains methods that may subtract/add from total. Or
even be cleared 
 */
package cse360assignment02;

public class AddingMachine {
	  private int total;//hold the total amount
	  //initialize string history to 0 to store values of methods below
	  private String history = "0";

	  /*constructor for class*/
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }

	  /*get the total value*/
	  public int getTotal () {
		  //The getTotal method should return the current total
	    return total;
	  }

	  /*add method will add parameter (value) to total and then put into history*/
	  public void add (int value) {
		  //total += value;
		  total = total + value;
		  history += " + " + value;
	  }

	  /*subtract method will subtract parameter (value) to total and then put into history*/
	  public void subtract (int value) {
		  total = total - value;
		  history += " - " + value;
	  }

	  /*values of history from add/subtract method are stored in here*/
	  public String toString () {
	    return history;
	  }

	  /* clears history of values and values stored within the total from previous methods*/
	  public void clear() {
		  history = "0";
		  total = 0;   //clearing total memory 
	  }

	}
