class Node{

	int data;
	Node next;

	Node (int data){

		this.data = data;
	}
}

public class linkedList {

	Node head;

	public void append(int data)
	{
		if(head == null) {

			head = new Node(data);
			return;
		}


		Node current = head;

		while(current.next != null)
		{
			current = current.next;
		}

		current.next = new Node(data);
	}

	public void prepend(int data)
	{
		Node newHead  = new Node(data);

		newHead.next = head;
		head = newHead;
		return;
	}

	public void deleteWithValue(int data) {

		if(head == null) return;

		if(head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;

		while(current.next != null)
		{
			current = current.next;

			if(current.next.data == data)
			{
				current.next = current.next.next;
				return;
			}
		}


	}

	public void printlinkeslist() {

		Node current = head;

		while(current.next != null)
		{
			System.out.println(current.data);

			current=current.next;
		}

		System.out.println(current.data);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		linkedList linklist = new linkedList();
		linklist.append(3);
		linklist.append(6);
		linklist.append(9);
		linklist.append(12);
		linklist.append(15);
		linklist.deleteWithValue(15);
		linklist.prepend(20);

		linklist.printlinkeslist();
	}

}