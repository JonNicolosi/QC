
public class Lab16Main1 {

	public static void main(String[] args) {
		
		String [] dataSource = {"1","2","3","6","4","5"};
		//generate empty lists
		LinkedList myList1= new LinkedList();
		LinkedList myList2= new LinkedList();
		
		//print out the empty lists
		System.out.println("Here is myList1: "+myList1);
		System.out.println("Here is myList2: "+myList2);
		
		// fill list 1 using append and print it.
		for (int i=0; i<dataSource.length;i++)
			myList1.append(dataSource[i]);
		//append add element end of string
		System.out.println("Here is myList1: "+myList1);
		
		//fill list 2 using prepend and print it.
		for (int i=0; i<dataSource.length;i++)
			myList2.prepend(dataSource[i]);
		//prepend add element head of string
		System.out.println("Here is myList2: "+myList2);
		
		
	}
}


