public class Command {

    public enum CommandType{
        CMD_MOVE,
        CMD_INFO
    }

    private String source = "POSITION";
    private String destination = null;
    private CommandType cmd_type;
    private String question = null;


    public void setQuestion(String qword){
        question = qword;
    }

    public void setSource(String src){
        source = src;
    }

    public void setDestination(String dest){
        destination = dest;
    }

    public void setType(CommandType type) {
        cmd_type = type;
    }

    public void send() {
        System.out.println("---------------------");
        System.out.println("NEW COMMAND SENT!");
        System.out.println("TYPE: " + cmd_type);
        System.out.println("SRC: " + source);
        if(destination != null)
            System.out.println("DST: " + destination);
        if(question != null)
            System.out.println("?: " + question);
        System.out.println("---------------------");

    }
}
