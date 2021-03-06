public class Film extends Media
{
    public String Director;
    public double boxOffice;//million

    public Film()
    {
        super();
        Director = "MR.STEVEN LYU/吕泽英泰";
        boxOffice = 8888;
    }
    
    public Film(double price,String name,boolean isPopular,int time,String Director,double boxOffice)
    {
        super(price,name,isPopular,time);
        this.Director = Director;
        this.boxOffice = boxOffice;
    }
    
    public String getReview()
    {
        return "it has some really catchy songs along the way.";
    }
    
    
    public String toString()
    {
        return super.toString() + 
        "Director: " + Director + 
        "boxOffice: " + boxOffice + "\n";
    }
}
