package wiz;

public class GateNode {
	protected Gate data;
	protected GateNode next;
	
	public GateNode(Gate data, GateNode nextG) {
		this.data = data;
		this.next = nextG;
	}
	
	public GateNode(Gate data) {
		this.data = data;
		this.next = null;
	}
	
	public GateNode() {
		
		this.data = null;
		this.next = null;
	}
	

}
