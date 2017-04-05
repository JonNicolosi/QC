
public class Wallet {
  private MoneyList walletContents = new MoneyList();
  
  public Wallet(){
	  
  }
  public void addToWallet(Money m){
	  walletContents.append(m);
  }
  public void print () {
	 System.out.println(walletContents.toString());
  }
  public String getValue() {
	  double sum=0;
	  int i;
	  for(i=0;i<walletContents.getLength();i++){
		  Money p = walletContents.getMoney(i);
		  if(p instanceof Bill)
			  sum+=((Bill)p).getValue()*100;
		  else
			  sum+=((Coin)p).getValue();
	  }
	  return (""+sum/100);
  }
}
