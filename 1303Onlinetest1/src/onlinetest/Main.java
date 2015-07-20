package onlinetest;

public class Main
{

	public static void main(String[] args) 
	{		
		
		EVM evm = new EVM();
		evm.switchOn();
		
		evm.bu.candidScreen.addCandidate("BJP");
		evm.bu.candidScreen.addCandidate("Congress");
		evm.bu.candidScreen.addCandidate("AAP");
					
		evm.bu.candidScreen.displayCandidates();
		
		evm.bu.candidButton.castVote(0);
		evm.bu.candidButton.castVote(0);
		evm.bu.candidButton.castVote(2);
		evm.bu.candidButton.castVote(1);
		evm.bu.candidButton.castVote(0);
		evm.bu.candidButton.castVote(2);
		evm.bu.candidButton.castVote(1);
		
		
		
		evm.cu.displayResult();
		
		
	}

}
