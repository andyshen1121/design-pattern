package command;

public class Main {
    public static void main(String[] args) {
        Content content = new Content();
        Command insertCommand = new InsertCommand(content);
        insertCommand.doit();
//        insertCommand.undo();

        System.out.println(content.msg);
    }
}
