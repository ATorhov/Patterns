package behavioral.command;

import behavioral.command.actions.ActionOpen;
import behavioral.command.actions.ActionSave;
import behavioral.command.actions.MenuOptions;
import behavioral.command.contracts.ActionListenerCommand;
import behavioral.command.entities.Document;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();

        ActionListenerCommand clickOpen = new ActionOpen(document);
        ActionListenerCommand clickSave = new ActionSave(document);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();
    }
}
