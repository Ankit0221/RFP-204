package Day14problems;

public class SimpleLinkedListIterator<D> {
	 public void iterateSimpleLinkedList(SimpleLinkedList<Integer> simpleLinkedList) {
		 
		 
		 
			Node<D> tempNode =  (Node<D>) simpleLinkedList.headNode;
			 
			 while(tempNode != null) {             
				
			 if(tempNode.getNextNode()!= null) {
				System.out.print(tempNode.getData() + "->");
				 } else {
					 System.out.print(tempNode.getData());
				 }
				 
				 tempNode = tempNode.getNextNode();
			 }
		}
		
	}

