class RacingGoogles extends Googles
{
    RacingGoogles(Color color)
    {
        super(GooglesType.RACING ,color);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Racing Googles ");
    }
}
