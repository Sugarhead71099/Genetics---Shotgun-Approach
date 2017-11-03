import java.util.Scanner;

public class ShotgunApprochGenetics {
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many sequences will you be inputting?");
		int numOfSequences = userInput.nextInt();					// input NUMBER of sequences you will be inputting
		numOfSequences++;
		String sequences[] = new String[numOfSequences];			// an ARRAY is created with the length of "numOfSequences"
		System.out.println("Input your sequences");
		for(int i = 0; i < numOfSequences; i++)					// input all sequences
			sequences[i] = userInput.nextLine();
		ShotgunApproachOverlap shotgun = new ShotgunApproachOverlap(sequences);					// Construct secondary class
		String match = shotgun.findMatch();
		System.out.println("\nThe overlapping sequence found was:  \"" + match + "\"");			// Find the match of Strings
		System.out.println("\nHere is your contig:\n");
		ShotgunApproachDisplay contig = new ShotgunApproachDisplay(match, sequences);
	}
	
}
