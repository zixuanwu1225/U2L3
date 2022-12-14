public class Letter
{
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */


    private String yourName;
    private String toName;

    public Letter(String giveName)
    {
        yourName = giveName;
    }

    public void writeLetter(String givenName)
    {
        toName = givenName;
        greeting();
        specialMessage();
        closing();
    }

    public void greeting()
    {
        System.out.println("Hello, " + toName);
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn’t you say?");
    }

    public void closing()
    {
        System.out.println("By, " + yourName);
    }
}
