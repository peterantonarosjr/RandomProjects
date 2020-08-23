package wiz;

public class Gate extends LinkedList{
	
	protected int input1;

	public Gate(int input1) {
		this.input1 = input1;
	}
	
	protected void setInput1(int input1) {
		this.input1 = input1;
	}

	protected int getInput1() {
		return input1;
	}
	

}
