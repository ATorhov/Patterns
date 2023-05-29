package behavioral.command.actions;

import behavioral.command.contracts.ActionListenerCommand;
import behavioral.command.entities.Document;

public class ActionOpen implements ActionListenerCommand {

    private Document doc;

    public ActionOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }
}
