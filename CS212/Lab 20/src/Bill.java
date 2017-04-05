
public class Bill extends Money{
   private int dollars;
   
   public Bill (int d) throws IllegalBillException {
      if(d!=1 && d!=5 && d!=10 && d!=50 && d!=100)
    	  throw new IllegalBillException("Bill "+d+" not excptable.");
      dollars = d;
   }
   public int getValue () {
      return dollars;
   }
   public String toString(){
	   return ("$ "+dollars+".00");
   }
}
