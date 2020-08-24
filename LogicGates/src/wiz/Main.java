package wiz;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Run");
		Gate head = new Gate(1);
		AndGate myAnd = new AndGate(1,1);
		AndGate myAnd2 = new AndGate(1,0);
		AndGate myAnd3 = new AndGate(1,1);
		AndGate myAnd4 = new AndGate(1,0);
		OrGate myOr = new OrGate(1,1);
		NotGate myNot = new NotGate(0);
		//GateNode myNode = new GateNode(myAnd);
		GateLinkedList list = new GateLinkedList();
		//list.append(head);
		list.append(myAnd);
		list.append(myAnd2);
		list.append(myAnd3);
		list.append(myAnd4);
		list.append(myOr);
		list.append(myNot);
		list.printList();
		list.printListLength();
		
		
	}
}
