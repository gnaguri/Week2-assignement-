class SwimmingGoogles extends Googles
{
    SwimmingGoogles(Color color)
    {
        super(GooglesType.SWIMMING ,color);
        construct();
    }
      
    @Override
   protected void construct()
    {
        System.out.println("Swimming googles");
    }
}