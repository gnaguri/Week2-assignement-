class RED	
{
    public static Googles trimGoogles(GooglesType model)
    {
        Googles googles = null;
        //Color color =Color.RED;
        switch (model)
        {
            case SWIMMING:
                googles = new SwimmingGoogles(Color.RED);
                break;
              
            case RACING:
                googles = new RacingGoogles(Color.RED);
                break;
                  
            case DEEPSEA:
                googles = new deepseaGoogles(Color.RED);
                break;
                  
                default:
                break;
              
        }
        return googles;
    }
}