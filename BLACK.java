class BLACK
{
    public static Googles trimGoogles(GooglesType model)
    {
        Googles googles = null;
        //Color color =Color.BLACK;
        switch (model)
        {
            case SWIMMING:
                googles = new SwimmingGoogles(Color.BLACK);
                break;
              
            case RACING:
                googles = new RacingGoogles(Color.BLACK);
                break;
                  
            case DEEPSEA:
                googles = new deepseaGoogles(Color.BLACK);
                break;
                  
                default:
                break;
              
        }
        return googles;
    }

	
}