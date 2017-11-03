public class ShotgunApproachDisplay
{
	
	String match, seq[];
	
	public ShotgunApproachDisplay(String match, String[] sequences)
	{
		this.match = match;
		seq = sequences;
		
		String[] newArr = createNewArr();
		System.out.println("\n\n");
		for(String i : newArr)
			System.out.println(i);
	}
	
	public String[] createNewArr()
	{
		String arr[] = new String[seq.length - 1];
		for(int i = 1; i < seq.length; i++)
		{
			int index = seq[i].indexOf(match);
			arr[i - 1] = "\t\t\t\t\t" + seq[i].substring(0, index) + "|" + seq[i].substring(index, index + match.length()) + "|" + seq[i].substring(index + match.length()) + "\n";
		}
		return arr;
	}
	
}
