package Day14problems;

public class SimpleLinkedList<D> {
	public Node<D> headNode = null;
	
	public Node<D> tailNode = null;
	
	public Node<D> tempNode = null;
	public Node<D> prevNode = null;
	void add(Node<D> newNode) {
		if(headNode == null && tailNode == null && tempNode == null) { // will be true when first call add method
			headNode = newNode;
			tailNode = newNode;
			tempNode = newNode;
		} else {
			tempNode.setNextNode(newNode);
			tailNode = newNode;
			tailNode.setNextNode(null);
			tempNode = newNode;
		}
		System.out.println("headNode data = " + headNode.getData());
		System.out.println("tailNode data = " + tailNode.getData());
	}
	void remove(D datatoberemoved) {
		if(headNode==null&& tailNode==null&&tempNode==null) {
			return;
		}
	Node<D> currNode=headNode;
	prevNode=headNode;
	
	if(datatoberemoved==currNode.getData()) {
		headNode=currNode.getNextNode();
	 currNode.setNextNode(null);
	
	}
	while(datatoberemoved!=currNode.getData()) {
		prevNode=currNode;
		currNode=currNode.getNextNode();
		
	}
	prevNode.setNextNode(currNode.getNextNode());
	currNode.setNextNode(null);
	

	
	}
}
