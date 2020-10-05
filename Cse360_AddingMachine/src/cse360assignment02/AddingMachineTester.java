package cse360assignment02;

public class AddingMachineTester {

	  public static void main (String[] args){
			AddingMachine myMachine = new AddingMachine();
			myMachine.add(4);//call add() method
			myMachine.subtract(2);
			myMachine.add(5);
			System.out.println(myMachine.toString());
			//System.out.println("Total= "+myMachine.getTotal());
}

}
