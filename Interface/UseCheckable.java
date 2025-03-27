public class UseCheckable implements Checkable
{
    @Override
    public boolean check()
    {
        return true;
    }
    public static void main(String[] args)
    {
        UseCheckable uc = new UseCheckable();
        System.out.println("Yes, it is " + uc.check());
    }
    
}
