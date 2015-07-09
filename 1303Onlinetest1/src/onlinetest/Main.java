package onlinetest;

public class Main
{

	public static void main(String[] args) 
	{
		EVM evm = new EVM();
		
		evm.addCandiate("BJP");
		evm.addCandiate("Cong");
		evm.addCandiate("AAP");
		
		evm.bu.displayCandidates();
		
		
	}

}
