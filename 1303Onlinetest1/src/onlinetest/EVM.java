package onlinetest;

import java.util.ArrayList;

public class EVM {

	BU bu = new BU();
	CU cu = new CU();
	
	public void conductPoll(ArrayList<Candidate> candidates)
	{
		bu.displayCandidates();
		
		cu.addVote(candidates);
		
	}
	
	

}
