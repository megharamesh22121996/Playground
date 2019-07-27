import java.util.*;

class Item
{
  private int price;
  public int getPrice()
  {
      return price;
  }
  public void setPrice(int price)
  {
      this.price = price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  public String getProduct()
  {
      return product;
  }
  public int getQuantity()
  {
      return quantity;
  }
  public void setProduct(String product)
  {
      this.product = product;
  }
  public void setQuantity(int quantity)
  {
      this.quantity = quantity;
  }
}

class Bill
{
  public void calculateBill(int a, int b)
  {
      int bill = a * b;
      System.out.println("Total Price is : "+bill);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    String k = in.nextLine();
    int a = in.nextInt();
    int b = in.nextInt();
    i.setPrice(a);
    c.setQuantity(b);
    c.setProduct(k);
    obj.calculateBill(a,b);
  }
}