
import java.io.*;
import java.util.Date;

public class SaveMoney {

  public static void main(String argv[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("date.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    for(int i=0;i<2;i++){
    Quarter q = new Quarter();
    oos.writeObject(q);
    Nikels n  = new Nikels();
    oos.writeObject(n);
    Dime d = new Dime();
    oos.writeObject(d);
    Penny p = new Penny();
    oos.writeObject(p);
  }
    oos.flush();
    oos.close();
    fos.close();
  }
}