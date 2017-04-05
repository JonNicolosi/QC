/**
 * @author Jon
 *	The purpose of the Date212 class is to take the date as a string from the Project2 class, parse it into integers, and check for valid dates.
 *	Additionally, the Date212 class contains a toString method which returns the dates in the proper mm/dd/yyyy format. Also, there is a compareTo method that will be used in the insert
 *	method in the DateList class.
 */
public class Date212 {
	private int year;
	private int month;
	private int day;
	
	public String toString(){								//toString returns the date in the format mm/dd/yyyy. Zeros have been added to certain dates so that they can be properly analyzed
		if (day<10 && month<10){							//by the compareTo method below.
			return ("0"+month+"/"+"0"+day+"/"+year);
		}
		if (day<10){
			return (month+"/"+"0"+day+"/"+year);
		}
		if (month<10){
			return ("0"+month+"/"+day+"/"+year);
		}
		
		return (month+"/"+day+"/"+year);
	}
	
	public Date212 (String DateString) throws IllegalDate212Exception{
		
			if (DateString.length()!=8)
				throw new IllegalDate212Exception();
			
			year = Integer.parseInt(DateString.substring(0,4));
		
			month = Integer.parseInt(DateString.substring(4,6));
		
			day = Integer.parseInt(DateString.substring(6,8));
		
			if (year>2014 || year<0){
				throw new IllegalDate212Exception(); 
			}
	
			if(month>12 || month<0){
				throw new IllegalDate212Exception();
			}
	
			if(day>31 || day<0){
				throw new IllegalDate212Exception();
			}
		
	}

	public int compareTo(Date212 x) {

		String c1 = (this).toString().substring(6,10)+(this).toString().substring(3,5)+(this).toString().substring(0,2);	//These next two lines reconstruct the string from toString
		String c2 = (x).toString().substring(6,10)+(x).toString().substring(3,5)+(x).toString().substring(0,2);				//so that the method compareTo will be able to compare the strings.
		
		if (c1.compareTo(c2)>0) return 1;
		
		if (c1.compareTo(c2)<0) return -1;
		
		return 0;
		
	}			
}
