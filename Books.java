public class Books extends Media
{
    public String Author;
    public String ISBN;

    public Books()
    {
        super();
        Author = "MR.Mo Yan/莫言";
        ISBN = "ISBN 0-14-016854-0";
    }
    
    public Books(double price,String name,boolean isPopular,int time,String Author,String ISBN)
    {
        super(price,name,isPopular,time);
        this.Author = Author;
        this.ISBN = ISBN;
    }
    
    
    
    public String getReview()
    {
        return " If so, our world won’t be simply be post-truth. It will be post-moral.";
    }
    
    public String toString()
    {
        return super.toString() + 
        "Author: " + Author + 
        "ISBN: " + ISBN + "\n";
    }
}
