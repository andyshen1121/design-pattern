package command;

public class DeleteCommand extends Command {
    Content c;
    // 记下要删除的string
    String deleted;
    public DeleteCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        deleted = c.msg.substring(0, 1);
        c.msg = c.msg.substring(1, c.msg.length());
    }

    @Override
    public void undo() {
        c.msg = deleted + c.msg;
    }
}
