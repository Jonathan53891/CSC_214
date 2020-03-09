public class Letter
{
    private String sender;
    private String recipient;
    private String body;

    Letter(String from, String to)
    {
        sender = from;
        recipient = to;
        body = "";
    }

    void addLine(String line)
    {
        body = body.concat(line + "\n");
    }

    String getText()
    {
        String letter = "Dear " + recipient + ":\n\n";
        letter += body + "\n";
        letter += "Sincerely, \n\n" + sender;
        return letter;
    }

}
