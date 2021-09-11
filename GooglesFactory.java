class GooglesFactory
{
    private GooglesFactory() 
    {
          
    }
    public static Googles trimGoogles(GooglesType type)
    {
        Googles googles = null;
      
        Color color = Color.GREEN; 
      
          
        switch(color)
        {
            case BLACK:
                googles = BLACK.trimGoogles(type);
                break;
                  
            case GREEN:
                googles = GREEN.trimGoogles(type);
                break;
                      
            default:
            	googles = RED.trimGoogles(type);
            
  
        }
        
          
        return googles;
  
    }
}