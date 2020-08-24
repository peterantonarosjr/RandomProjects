package wiz;

public class OrGate extends Gate{
	
	private int input2;
	private int input3;

	
	public OrGate(int input1, int input2) {
		super(input1);
		this.input2 = input2;
		super.output = out(input2);
		
	}
	

	public OrGate(int input1, int input2, int input3) {
		super(input1);
		this.input2 = input2;
		this.input3 = input3;
		super.output = out(input2, input3);
		
	}

	
	private int getInput2() {
		return input2;
	}

	private int getInput3() {
		return input3;
	}

	private int out(int inputA) {
		return super.input1 | inputA;
	}
	
	private int out(int inputA, int inputB) {
		return super.input1 | inputA | inputB;
	}

	public int getOutput() {
		
		return super.getOutput();

	}
}
