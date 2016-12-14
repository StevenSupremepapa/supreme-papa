public class Album extends Media
{
    public String Composer;
    public boolean winGoldenGlobeAward;

    public Album()
    {
        super();
        Composer = "Ennio Morricone";
        winGoldenGlobeAward = true;
    }
    
    public Album(double price,String name,boolean isPopular,int time,String Composer,boolean winGoldenGlobeAward)
    {
        super(price,name,isPopular,time);
        this.Composer = Composer;
        this.winGoldenGlobeAward = winGoldenGlobeAward;
    }
    
    public String getReview()
    {
        return "With this record, The Rolling Stones refuse to pass into legend, but instead linger on comfortably.";
    }
    
    
    public String toString()
    {
        return super.toString() + 
        "Composer: " + Composer + 
        "winGoldenGlobeAward: " + winGoldenGlobeAward + "\n";
    }
}
