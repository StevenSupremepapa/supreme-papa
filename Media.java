import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Media
{
  public double price;
  public String name;
  public boolean isPopular;
  public int time;
  
  public  Media()
  {
      if(getClass().getName() == "Album")
     {
      price = 19.99;
      name = "Surfers paradise";
      isPopular = true;
      time = 2015;
     }
     else if(getClass().getName() == "Books")
     {
      price = 9.99;
      name = "Red Sorghum: A Novel of China";
      isPopular = true;
      time = 2006; 
     }
     else if(getClass().getName() == "Film")
     {
      price = 666.6;
      name = "New Beijing Story";
      isPopular = false;
      time = 2016;
     }
     else
     {
      price = 0.01;
      name = "null";
      isPopular = false;
      time = 2000;
     }
  }
  
    public Media(double price, String name, boolean popular, int time)
    {
      this.price = price;
      this.name = name;
      this.popular = isPopular;
      this.time = time;
    }
    
    public String getDateAndTime()
    {
      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date somedate = new Date();
      String output = "The local date and time is : " + dateFormat.format(somedate);
      return output;
    }
 
  public String toString()
  {
    String output = "Media : " + getClass().getName() + "\n" +
    "Price : " + price + "\n" +
    "Name : " + name + "\n" +
    "isPopular : " + isPopular + "\n" +
    "Time : " + time + "\n";
 
    return output;
  }
 }

