
public abstract class Coin extends Money {
   private int value;
   
   public Coin(int v) {
      value = v;
   }
   public int getValue () {
      return value;
   }
   public String toString() {
	   String a="";
	   if(value<10) a="0";
      return ("$ 0."+a+getValue());
   }
}
