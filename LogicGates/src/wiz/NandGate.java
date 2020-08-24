package wiz;

public class NandGate extends Gate{
	
	private int input2;
	private int input3;
	protected int output1;
	protected int output2;
	
	public NandGate(int input1, int input2) {
		super(input1);
		this.input2 = input2;
		output1= out(input2);
		System.out.println(output1);
	}
	
	public NandGate(int input1, int input2, int input3) {
		super(input1);
		this.input2 = input2;
		this.input3 = input3;
		output2 = out2(input2, input3);
		System.out.println(output2);
	}
	
	
	
	private int getInput2() {
		return input2;
	}

	private int getInput3() {
		return input3;
	}

	//Fix these methods for NAND
	private int out(int inputA) {
		return super.input1 & inputA;
	}
	
	private int out2(int inputA, int inputB) {
		return super.input1 & inputA & inputB;
	}
}

