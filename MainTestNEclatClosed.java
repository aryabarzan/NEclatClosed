import java.io.*;

class MainTestNEclatClosed {

	public static void main(String [] arg) throws IOException{
		String input_dataset = "H:\\datasets\\chess.dat";  // the database
		String output = "H:\\output\\closed_chess.dat";  // the path for saving the frequent itemsets found
		double minsup = 0.4; //Relative count. 0.4 means 40%

		
		// Applying the algorithm
		AlgoNEclatClosed algorithm = new AlgoNEclatClosed();
		
		algorithm.runAlgorithm(input_dataset, minsup, output);
		algorithm.printStats();
	}
}