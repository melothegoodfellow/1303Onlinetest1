package onlinetest;

import java.util.HashMap;

public class CU
{
	
	static HashMap<Candidate, Integer> map = new HashMap<Candidate, Integer>();
	BallotButton ballot = new BallotButton();
	
	public void pressBallotButton()
	{
		ballot.setPressed(true);
	}
	
	public void addVote(Candidate candid, int count)
	{
		int value;
		if(map.get(candid) != null)
			value = map.get(candid) + count;
		else
			value = count;
		map.put(candid, value);
	}

	public void switchOn()
	{
		System.out.println("The CU switched on");
	}

	public void displayResult()
	{
		for (Candidate candid : map.keySet())
		{
			System.out.println(candid.getName()+" "+map.get(candid));
		}
	}
}
