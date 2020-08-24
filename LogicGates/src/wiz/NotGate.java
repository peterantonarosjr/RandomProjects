package wiz;

public class NotGate extends Gate {
	
	
	
	public NotGate(int input1) {
		super(input1);
		super.output= not();
		
	}
	
	private int not() {
		if(super.input1==0) {
			return 1;
		}
		return 0;
	}
	
	public int getOutput() {
		
		return super.getOutput();

	}

}
