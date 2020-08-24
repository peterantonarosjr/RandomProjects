package wiz;

public class Gate{
	
	protected int input1;
	protected int output;


	public Gate(int input1) {
		this.input1 = input1;
	}
	
	protected void setInput1(int input1) {
		this.input1 = input1;
	}

	protected int getInput1() {
		return input1;
	}

	public int getOutput() {
		
		return output;
	}
}
