package behavioral.command.actions;

import behavioral.command.contracts.ActionListenerCommand;
import behavioral.command.entities.Document;

public class ActionSave implements ActionListenerCommand {

    private Document doc;
    public ActionSave(Document doc){
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.save();
    }
}
