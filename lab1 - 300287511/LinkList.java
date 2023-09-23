/** 
 * Builds a singly linked list of size 5 and prints it to the console.
 * 
 * @author Jochen Lang
 */

class LinkList {
    DNode head;
	DNode tail;
    LinkList( int sz ) {
	if ( sz <= 0 ) {
	    head = null;
		tail = null;
	}
	else {
	    // start with list of size 1
	    head = new DNode( "0", null, null ); 
	    tail = head; // temp node for loop
	    // add further nodes
	    for ( int i=1; i<sz; ++i ) {
		// create node and attach it to the list
		DNode node2Add = new DNode( Integer.toString(i), null, null );
		tail.setNext(node2Add);   // add first node
		node2Add.setPrev(tail);
		tail=node2Add;
	    }
	}
    }
    
    /**
     * Print all the elements of the list assuming that they are Strings
     */
    public void print() {
	/* Print the list */
	DNode current = head; // point to the first node
	while (current != null) {
	    System.out.print((String)current.getElement() + " ");	
	    current = current.getNext(); // move to the next
	}
	System.out.println();	
    }

    public void deleteFirst() {
	if ( head != null ) {
	    head = head.getNext();
		head.setPrev(null);
	}
    }

    public void deleteLast() {
	if ( head == null ) return; // no node 
	if ( head.getNext() == null ) { // only 1 node
	    head = null;
	    return;
	}
	else {
		DNode current = head;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);
		tail = current;

	}
	return;
    }

    // create and display a linked list
    public static void main(String [] args){
	/* Create the list */
	LinkList llist = new LinkList( 5 );
	/* Print the list */
	llist.print();
	/* delete first and print */
	llist.deleteFirst();
	llist.print();
	/* delete last and print 5 times */
	for ( int i=0; i< 5; i++ ) {
	    llist.deleteLast();
	    llist.print();
	}
    }
}
