import java.util.*;
public class Main {
	public static void main(String[] args) {
		Customers cusobj1 = new Customers();
		cusobj1.setId(1001);
		cusobj1.setName("Saakshi");
		cusobj1.setMobileNumber(9000000000L);
		cusobj1.setAddress("Bangalore");
		cusobj1.setDateOfBirth("16-Jul-1990");
		cusobj1.setGender('F');
		cusobj1.setOrderHistory("Lakme Kajal, Salwar");
		Customers cusobj2 = new Customers();
		cusobj2.setId(1008);
		cusobj2.setName("Rahul");
		cusobj2.setMobileNumber(9000000001L);
		cusobj2.setAddress("Chennai");
		cusobj2.setDateOfBirth("27-Jan-1992");
		cusobj2.setGender('M');
		cusobj2.setOrderHistory("T-Shirt, Jeans");
		Suppliers supobj1 = new Suppliers();
		supobj1.setId(7901);
		supobj1.setName("ABC Traders");
		supobj1.setMobileNumber(8000000000L);
		supobj1.setAddress("Mumbai");
		supobj1.setItemsStock(10);
		supobj1.setPaymentStatus("Paid");
		supobj1.setFeedbackRating(4.75f);
		Suppliers supobj2 = new Suppliers();
		supobj2.setId(7972);
		supobj2.setName("XYZ Enterprises");
		supobj2.setMobileNumber(8000000900L);
		supobj2.setAddress("Kolkatha");
		supobj2.setItemsStock(7);
		supobj2.setPaymentStatus("Unpaid");
		supobj2.setFeedbackRating(4.35f);
		cusobj1.displayProfileDetails(cusobj1);
		cusobj2.displayProfileDetails(cusobj2);
		supobj1.displayProfileDetails(supobj1);
		supobj2.displayProfileDetails(supobj2);
      cusobj1.editAddress();
      supobj1.editAddress();
      cusobj1.placeOrder();
      supobj1.increaseStockLevel(5);
      supobj2.increaseStockLevel(10);
    }	
}

class Users {
    int id;
    String name;
    long mobileNumber;
    String address;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public long getMobileNumber()
    {
        return mobileNumber;
    }
    public void setMobileNumber(long mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void displayProfileDetails(Customers cusobj)
    {
        String cusName = cusobj.name;
        long cusMob = cusobj.mobileNumber;
        System.out.println(cusName+", "+cusMob);
    }
    public void displayProfileDetails(Suppliers supobj)
    {
        String supName = supobj.name;
        long supMob = supobj.mobileNumber;
        System.out.println(supName+", "+supMob);
    }
}

class Customers extends Users{
    String dateOfBirth;
    char gender;
    String orderHistory;
    public String getDateOBirth()
    {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    public char getGender()
    {
        return gender;
    }
    public void setGender(char Gender)
    {
        this.gender = gender;
    }
    public String getOrderHistory()
    {
        return orderHistory;
    }
    public void setOrderHistory(String orderHistory)
    {
        this.orderHistory = orderHistory;
    }
  public  void editAddress()
  {
    System.out.println(this.name+", "+this.address);
    this.address = "Coimbatore";
    System.out.println(this.name+", "+this.address);
  }
  public void placeOrder()
  {
    System.out.println("Order placed successfully!");
  }
}

class Suppliers extends Users {
    int itemsStock;
    String paymentStatus;
    float feedbackRating;
    public int getItemsStock()
    {
        return itemsStock;
    }
    public void setItemsStock(int itemsStock)
    {
        this.itemsStock = itemsStock;
    }
    public String getPaymentStatus()
    {
        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus)
    {
        this.paymentStatus = paymentStatus;
    }
    public float getFeedbackRating()
    {
        return feedbackRating;
    }
    public void setFeedbackRating(float feedbackRating)
    {
        this.feedbackRating = feedbackRating;
    }
  public  void editAddress()
  {
    System.out.println(this.name+", "+this.address);
    this.address = "Delhi";
    System.out.println(this.name+", "+this.address);
  }
  public void increaseStockLevel(int a)
  {
    int b = this.itemsStock+a;
    System.out.println(this.name+", "+b);
  }
}