package onlinetest;

public class LampContext {

	private LampState lampState;

	public LampContext(LampState lampState) {
		this.lampState = lampState;
	}

	public void Switch(String type){
		lampState.switchState(this, type);
	}

	public LampState getLampState() {
		return lampState;
	}

	public void setLampState(LampState lampState) {
		this.lampState = lampState;
	}

}
