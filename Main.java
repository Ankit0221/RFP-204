package Day14problems;

public class Main {
	public static void main(String[] args) {

		Node<Integer> firstNode = new Node<>(30);
		
		Node<Integer> secondNode = new Node<>(40);
		Node<Integer> thirdNode = new Node<>(56);
		Node<Integer> fourthNode = new Node<>(70);
	
		SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
		
		simpleLinkedList.add(firstNode);
		simpleLinkedList.add(secondNode);
		simpleLinkedList.add(thirdNode);
		simpleLinkedList.add(fourthNode);
	
		//simpleLinkedList.remove(56);
		
		SimpleLinkedListIterator<String> simpleLinkedListIterator = 
				new SimpleLinkedListIterator<>();
		
		simpleLinkedListIterator.iterateSimpleLinkedList(simpleLinkedList);
		 
	}

}

