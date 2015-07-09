package onlinetest;

public class On extends LampState 
{

	public On()
	{
		currentState = "On";
	}

	@Override
	public void switchState(LampContext context, String type)
	{
		System.out.print("The "+type+ " Lamp is "+currentState);
		Off off=new Off();
		context.setLampState(off);
		System.out.print(" ."+context.getLampState().currentState+" the Lamp!!\t");
		
	}
}
