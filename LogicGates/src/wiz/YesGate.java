package wiz;

public class YesGate extends Gate{
	
	protected int output1;
	
	public YesGate(int input1) {
		super(input1);
		output1=yes();
	}
	
	private int yes() {
		return super.input1;
	}
}
