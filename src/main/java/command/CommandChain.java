package command;

import java.util.ArrayList;
import java.util.List;

public class CommandChain extends Command {
    List<Command> commandList = new ArrayList<>();

    public CommandChain addCommand(Command command) {
        commandList.add(command);
        return this;
    }

    @Override
    public void doit() {
        
    }

    @Override
    public void undo() {

    }
}
