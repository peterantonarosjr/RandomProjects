package wiz;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Run");
		AndGate myAnd = new AndGate(1,1);
		AndGate myAnd2 = new AndGate(1,0,1);
		NotGate myNot = new NotGate(0);
		
	}
}
