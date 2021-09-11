abstract class Googles
{
    Googles(GooglesType model,Color color)
    {
        this.model = model;
        this.color =color;
    }
   
    abstract void construct();
   
    GooglesType model = null;
    Color color =null;
   
   
    GooglesType getModel()
    {
        return model;
    }
   
    void setModel(GooglesType model)
    {
        this.model = model;
    }
   
    Color getColor()
    {
        return color;
    }
   
    void setColor(Color color)
    {
        this.color = color;
    }
   
    @Override
    public String toString()
    {
        
    	return "Googles - Model   is "+model;
        

    }
    
}