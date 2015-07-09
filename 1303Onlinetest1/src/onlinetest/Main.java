package onlinetest;

public class Main
{

	public static void main(String[] args) 
	{		
		BU bu = new BU();
		bu.switchOn();
		
		bu.addCandidate("BJP");
		bu.addCandidate("Congress");
		bu.addCandidate("AAP");
		
		bu.displayCandidates();
		
	}

}
