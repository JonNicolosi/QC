
public class Money {
	private int dollars;
	private int cents;
	public static void main(String[] args){
		Money m1 = new Money();
		Money m2 = new Money(6,5);
		System.out.println(m1.getCents());
		System.out.println(m2.getDollars());
		System.out.println(m2);
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.equals(m2));
	}
	public Money(){
		dollars=0;
		cents=0;
	}
	public Money(int a, int b){
		if (a<0||b<0) throw new IllegalArgumentException("can not be negative");
		dollars=a;
		cents=b;
	}
	public String toString(){
		String a;
		if(cents<10) a="0";
		else a="";
		return ("$"+dollars+"."+a+cents);
	}
	public int getDollars(){
		return dollars;
	}
	public int getCents(){
		return cents;
	}
	public int compareTo(Money b){
		int totala=dollars*100+cents;
		int totalb=b.dollars*100+b.cents;
		if (totala<totalb) return -1;
		else if (totala>totalb) return 1;
		else return 0;
	}
	
	public boolean equals(Money b){
		int totala=dollars*100+cents;
		int totalb=b.dollars*100+b.cents;	
		if (totala==totalb) return true;
		else return false;
	}

}
