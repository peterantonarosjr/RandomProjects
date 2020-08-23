package wiz;

public class NotGate extends Gate {
	
	protected int output1;
	
	
	public NotGate(int input1) {
		super(input1);
		output1= not();
		System.out.println(output1);
	}
	
	private int not() {
		if(super.input1==0) {
			return 1;
		}
		return 0;
	}

}
