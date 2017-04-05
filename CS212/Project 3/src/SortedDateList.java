
public class SortedDateList extends DateList{

	DateNode first = new DateNode(null);
	
	DateNode last = first;
	
	int length = 0;
	
	public int getLength()  { 
	      return length; 
	   }
	
	public void append(Date212 d){

		   DateNode n=new DateNode(d);
		   last.next=n;
		   last=n;
		   length++;
	   } 
	
	public void insert (Date212 String) { 
    	
    	DateNode n = new DateNode(String); //Creates a new node "n" which contains data from Date212 "s".
    	DateNode A=first; //This node keeps track of our current position.
    	DateNode B=first.next;  //This node points to the next node.	
    	
    	while (A.next!=null) { 
    		B=A.next;
    		if(B.data.compareTo(String)>0) break; //If data from Date212 is larger than B, break.
    		A=A.next; //Continue to next position.
    	}
    	
    	if (A.next ==null) { 
    		append(String);
    	}
    	
    	else { 
    		
    		A.next=n;
    		n.next=B;
    		
    		length++;
    	}
    }
	
	public String toString() { 
		DateNode p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " \n";
			p = p.next;
		}
		return returnString;
	}
}
