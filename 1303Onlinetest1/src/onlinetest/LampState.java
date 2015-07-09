package onlinetest;

public abstract class LampState
{
	String currentState;
	
	public abstract void switchState(LampContext context, String type);

}
