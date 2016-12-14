public class Painting
{
  public String title;
  public String style;
  public String author;
  public double price;
  private boolean isTure; 
  
  public Painting()
  {
    title = “Guernica”;
    style = ”Impressionnisme“；
    author = "Pablo Picasso";
    price = 199.00;//million
    isTure = false;
  }
  
  public String getIsTrue()
  {
    return isTure;
  }
  
  public String setIsTure(boolean myTure)
  {
    this.isTrue = myTure;
  }
  public String getReview()
  {
   return "That is really classic!"; 
  }
  public String checkTure()
  {
    String msg = " ";
    if(isTure == "true"){
      msg = "True";
    }
    else
    {
      msg = "Fack"
    }
    return msg;
  }
  public String toString()
  {
    String output = "Title : " + title + "/n" +
      "Style : " + style + "/n" +
      "author : " + authot + "/n" +
      "price : " + price + "/n" +
      "isTure : " + isTure;
        
      return output;
  }
}
