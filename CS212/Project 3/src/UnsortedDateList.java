
public class UnsortedDateList extends DateList {
	
	
	DateNode first = new DateNode(null);
	
	DateNode last = first;
	
	int length = 0;
	
	public int getLength()  { 
	      return length; 
	   }
	
	public void add(Date212 DateList){

		   DateNode toAppend=new DateNode(DateList);
		   last.next=toAppend;
		   last=toAppend;
		   length++;
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
