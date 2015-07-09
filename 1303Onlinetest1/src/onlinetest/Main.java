package onlinetest;

public class Main
{

	public static void main(String[] args) 
	{		
		EVM evm = new EVM();
		
		evm.bu.addCandidate("BJP");
		evm.bu.addCandidate("Cong");
		evm.bu.addCandidate("AAP");
		
		evm.bu.displayCandidates();
		
		evm.conductPoll(evm.bu.getCandidates());
		
		
	}

}
