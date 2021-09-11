class AbstractDesign 
{
    public static void main(String[] args)
    {
        System.out.println(GooglesFactory.trimGoogles(GooglesType.SWIMMING));
        System.out.println(GooglesFactory.trimGoogles(GooglesType.RACING));
        System.out.println(GooglesFactory.trimGoogles(GooglesType.DEEPSEA));
    }
}
