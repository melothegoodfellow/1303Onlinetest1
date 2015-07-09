package onlinetest;

import java.util.ArrayList;
import java.util.HashMap;

public class CU extends EVM
{
	HashMap<Candidate, Integer> map = new HashMap<Candidate, Integer>();
	BallotButton ballot = new BallotButton();
	
	public void pressBallotButton()
	{
		ballot.setPressed(true);
	}
	
	public void addVote(ArrayList<Candidate> candidates)
	{
		
	}

}
