package behavioral.mediator.users;

import behavioral.mediator.contracts.PrivateChatRoom;

public class UserTwo extends Participant{

    private String name;
    private PrivateChatRoom chatRoom;

    public UserTwo(PrivateChatRoom chatRoom){
        this.chatRoom = chatRoom;
    }
    @Override
    public void sendMsg(String msg) {
        chatRoom.showMsg(msg, this);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
