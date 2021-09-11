class deepseaGoogles extends Googles
{
    deepseaGoogles(Color color)
    {
        super(GooglesType.DEEPSEA,color);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Deep Sea googles");
    }
}