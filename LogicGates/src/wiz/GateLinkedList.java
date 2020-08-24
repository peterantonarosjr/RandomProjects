package wiz;

public class GateLinkedList {
	protected GateNode first;
	protected GateNode last;
	protected int length;
	
	public GateLinkedList() {
		GateNode node = new GateNode();
		this.first = node;
		this.last = node;
		this.length = 0;
		
	}
	
	public void append(Gate gate) {
		GateNode newGate = new GateNode(gate);
		last.next = newGate;
		last=newGate;
		newGate.next = null;
		length++;
		
	}
	
	public void printList() {
		
		GateNode current = first.next;
		int i=1;
		while(i<=length) {
			System.out.println(current.data.getOutput());
			current = current.next;
			i++;
		}
	}
	
	public void printListLength() {
		
		System.out.println("Length = "+ length);
	}
	
}
