public class Letter
{
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */

    public void writeLetter()
    {
        greeting();
        specialMessage();
        closing();
    }

    public void greeting()
    {
        System.out.println("Hello, "+fromName());
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn’t you say?");
    }

    public void closing()
    {
        System.out.println("See you later!");
    }
    public String fromName()
    {
        return
    }
}
