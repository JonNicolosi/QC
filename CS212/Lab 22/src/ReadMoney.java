
import java.io.*;
import java.util.Date;

public class ReadMoney {

  public static void main(String argv[]) throws Exception {
    FileInputStream fis = new FileInputStream("date.out");
    ObjectInputStream ois = new ObjectInputStream(fis);
    while(fis.available()!=0){
    	Object a=ois.readObject();
    	if(a instanceof Quarter)System.out.println((Quarter)a);
    	else if(a instanceof Nikels)System.out.println((Nikels)a);
    	else if(a instanceof Dime)System.out.println((Dime)a);
    	else if(a instanceof Penny)System.out.println((Penny)a);
    }
    
    ois.close();
    fis.close();
  }
}