class GREEN
{
    public static Googles trimGoogles(GooglesType model)
    {
        Googles googles = null;
        //Color color =Color.GREEN;
        switch (model)
        {
            case SWIMMING:
                googles = new SwimmingGoogles(Color.GREEN);
                break;
              
            case RACING:
                googles = new RacingGoogles(Color.GREEN);
                break;
                  
            case DEEPSEA:
                googles = new deepseaGoogles(Color.GREEN);
                break;
                  
                default:
                break;
              
        }
        return googles;
    }
}