// LinkedList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class MoneyList  {

/**  First node in linked list - dummy node  */
   private MoneyNode first = new MoneyNode(null);

/**  Last node in linked list  */
   private MoneyNode last = first;

/**  Number of data items in the list.  */
   private int length = 0;

  /**
    * Gets the number of data values currently
    * stored in this LinkedList.
    *
    * @return the number of elements in the list.
    */

   public int getLength()  { 
      return length; 
   }


   /**
    * Appends a String data element to this
    * LinkedList.
    *
    * @param data the data element to be appended.
    */
   public void append(Money d)
   {

     //  write the code here for append
	   MoneyNode n=new MoneyNode(d);
	   last.next=n;
	   last=n;
	   length++;
   }  // method append(String)


   /**
    * Prepends (adds to the beginning) a String data element to this
    * LinkedList.
    *
    * @param data the data element to be prepended.
    */
   public void prepend(Money d)
   {
	   MoneyNode toPrepend=new MoneyNode(d);
	   if(first==last){
		   last.next=toPrepend;
		   last=toPrepend; 
		   length++;
	   }
	   else{
		   toPrepend.next=first.next;
		   first.next=toPrepend;
	       length++;
	   }
     //  write the code here for prepend

   }  // method append(String)


  /**
   *  Prints the contents of the Linked List
   *
   */
   public String toString() {
      MoneyNode p = first.next;
      String returnString = "";
      while (p != null) {
         returnString += p.data+" ";
         p=p.next;
      }
      return returnString;
   }

  
   /**
    * Determines whether this ShortSequenceLinkedList is
    * equal in value to the parameter object.
    * They are equal if the parameter is of
    * class ShortSequenceLinkedList and the two objects
    * contain the same short integer values at
    * each index.
    *
    * @param other the object to be compared
    *          to this ShortSequenceLinkedList
    *
    * @return <code>true</code> if the parameter
    *        object is a ShortSequenceLinkedList containing
    *        the same numbers at each index as
    *        this ShortSequenceLinkedList, <code>false</code>
    *        otherwise.
    */
   public boolean equals(Object other)
   {
      if ( other == null 
              || getClass() != other.getClass()
              || length != ((MoneyList) other).length )
          return false;

      MoneyNode nodeThis = first;
      MoneyNode nodeOther = ((MoneyList) other).first;
      while ( nodeThis != null )
      {
          // Since the two linked lists are the same length,
          // they should reach null on the same iteration.

          if ( nodeThis.data != nodeOther.data )
             return false;

          nodeThis = nodeThis.next;
          nodeOther = nodeOther.next;
      }  // while

      return true;
   }  // method equals
public Money getMoney(int index){
	if(index<0||index>=length)
	throw new IllegalArgumentException("not acceptted");	
	MoneyNode a=first.next;
	for(int i=0;i<index;i++)
		a=a.next;
	return a.data;
}
public void printFirstToLast(MoneyNode currentNode){
	if (currentNode==last)
		System.out.print(currentNode.data+" ");
	else {
		System.out.print(currentNode.data+" ");
		printFirstToLast(currentNode.next);
	}
}
public void printLastToFirst(MoneyNode currentNode){
	if (currentNode!=last)
		printLastToFirst(currentNode.next);
	System.out.print(currentNode.data+" ");	
}

public double Sum(MoneyNode currentNode){
	if (currentNode==last)
	  if(currentNode.data instanceof Bill)
		  return ((Bill)currentNode.data).getValue()*1.0;
	  else
		  return ((Coin)currentNode.data).getValue()/100.0;
	else
		if(currentNode.data instanceof Bill)
		  return ((Bill)currentNode.data).getValue()*1.0 + Sum(currentNode.next);
		else
		  return ((Coin)currentNode.data).getValue()/100.0 + Sum(currentNode.next);	
}

public double SumOfQ(MoneyNode currentNode){
	if (currentNode==last)
	  if(currentNode.data instanceof Quarter)
		  return ((Quarter)currentNode.data).getValue()/100.0;
	  else
		  return 0;
	else
		if(currentNode.data instanceof Quarter)
		  return ((Quarter)currentNode.data).getValue()/100.0 + SumOfQ(currentNode.next);
		else
		  return SumOfQ(currentNode.next);	
}

public void callRecursive(){
	printFirstToLast(first.next);
	System.out.println();
	printLastToFirst(first.next);
	System.out.println();
	System.out.println("My wallet contains: $" + Sum(first.next));
	System.out.println("My wallet contains Quarter: $" + SumOfQ(first.next));
}
}  // class LinkedList

