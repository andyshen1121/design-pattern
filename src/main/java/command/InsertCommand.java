package command;

public class InsertCommand extends Command {
    Content c;
    String stringToInsert = "http://www.baidu.com";

    public Content getC() {
        return c;
    }

    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        c.msg = c.msg + stringToInsert;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length() - stringToInsert.length());
    }
}
