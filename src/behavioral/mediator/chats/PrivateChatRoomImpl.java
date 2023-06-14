package behavioral.mediator.chats;

import behavioral.mediator.contracts.PrivateChatRoom;
import behavioral.mediator.users.Participant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrivateChatRoomImpl implements PrivateChatRoom {

    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();

    @Override
    public void showMsg(String msg, Participant p) {
        System.out.println(p.getName()+": "+msg);
        System.out.println("\t\t\t\t"+"["+dateFormat.format(date).toString()+"]");
    }
}
