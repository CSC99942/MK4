import java.io.*;
public class Operator{
  public static void main(String args[]) throws IOException
  {
    String Ena;int id,mos,ld,ods,bs,lds;
    DataInputStream X=new DataInputStream(System.in);
    System.out.println("Enter Employee name:");
    Ena=X.readLine();
    System.out.println("Enter identity number:");
    id=Integer.parseInt(X.readLine());
    System.out.println("Enter monthly salary:");
    mos=Integer.parseInt(X.readLine());
    System.out.println("Enter leave days:");
    ld=Integer.parseInt(X.readLine());
    System.out.println("Enter one day salary:");
    ods=Integer.parseInt(X.readLine());
    lds=ld*ods;
    bs=mos-lds;
    System.out.println("Employee name:"+Ena);
    System.out.println("identity number:"+id);
    System.out.println("monthly salary:"+mos);
    System.out.println("leave days:"+id);
    System.out.println("one day salary:"+ods);
    System.out.println("balance salary:"+bs);
  }
}

