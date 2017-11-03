public class ShotgunApproachOverlap
{
	
	String[] seq;
	
	public ShotgunApproachOverlap(String[] sequences)
	{
		seq = sequences;
	}
	
	public String findMatch()
	{
		String seq1 = seq[seq.length - 1];
		for(int i = seq1.length(); i > 0; i--)
		{ 			
			String temp = seq1.substring(0, i);
			for(int j = 0; j + i < seq1.length(); j++)
				if(arrContainsValue(temp) == true)
					return temp;
				else
					temp = seq1.substring(j, i + j);
		}
		return "Sequence Contig wasn't found";
	}
	
	public boolean arrContainsValue(String value)
	{
		boolean containsTemp = true;
		for(int i = 1; i < seq.length - 1; i++)
			if(seq[i].contains(value))
				containsTemp = true;
			else
				return false;
		return containsTemp;
	}

}






/*public String findMatch(String seq1, String seq2)
{
	//String match = "";
	boolean notFound = true;
	int counter = seq1.length() - 1;
	String match = "";
	
	while(notFound) {
		for(int i = 0; i < seq1.length() - 1; i++) {	// This loop runs through every character in the first half of the array
			for(int j = 0; j < counter; j++) {		// This loop goes through every possibility with the value of i in it
				if(i + j < seq1.length()) {
					match = match + seq1.substring(i + j, (i + j) + 1);
					if(seq2.contains(match)) {
						if(match.length() >= 5) {
							notFound = false;
							return match;
						}
					}
				}
				if(i - j >= 0) {
					match = seq1.substring(i - j, (i - j) + 1) + match;
					if(seq2.contains(match)) {
						if(match.length() >= 5) {
							notFound = false;
							return match;
						}
					}
				}
			}
			counter--;
		}
		/*for(int i = seq1.length() / 2; i < seq1.length(); i++) {
			for(int j = 0; j < counter; j++) {
				
			}
			counter++;
		}*/
	/*}
	notFound = false;
	return "Sequence Contig Wasn't found";
}*/

/*public String findMatch() {
boolean notFound = true;
String seq1 = seq[0];
int counter = seq1.length() - 1;
String match = "";

while(notFound) {
	for(int i = 0; i < seq1.length() - 1; i++) {	// This loop runs through every character in the first half of the array
		for(int j = 0; j < counter; j++) {		// This loop goes through every possibility with the value of i in it
			if(i + j < seq1.length()) {
				match = match + seq1.substring(i + j, (i + j) + 1);
				if(seq[1].contains(match)) {
					if(match.length() >= 3) {
						notFound = false;
						return match;
					}
				}
			}
			if(i - j >= 0) {
				match = seq1.substring(i - j, (i - j) + 1) + match;
				if(seq[1].contains(match)) {
					if(match.length() >= 5) {
						notFound = false;
						return match;
					}
				}
			}
		}
		counter--;
	}
}
notFound = false;
return "Sequence Contig Wasn't found";
}*/
