
public class MoneyMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q","D","P","N"};
   static Money[] wallet = new Money[dataSource.length];
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            wallet[i]= new Bill(billValue);
         }   
         else
            if (dataItem == 'Q')
               wallet[i]=new Quarter();
         else 
            if (dataItem=='P')
            	wallet[i]=new Penny();
            else if (dataItem=='D')
            	wallet[i]=new Dime();
            else if(dataItem=='N')
            	wallet[i]=new Nikels();
         }
      printWallet();
      printSum();
   }
   public static void printSum(){
	   double sum=0;
	   for(int i=0;i<wallet.length;i++){
		   if(wallet[i] instanceof Bill)
			   sum+=((Bill)(wallet[i])).getValue()*100;
		   else
			   sum+=((Coin)(wallet[i])).getValue();
	   }
	   System.out.print("$ "+sum/100);
   }
   public static void printWallet () {
      for (int i=0;i<wallet.length;i++) {
            System.out.println(wallet[i]);
         
      }
   }
}
