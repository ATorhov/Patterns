package behavioral.mediator;

import behavioral.mediator.chats.PrivateChatRoomImpl;
import behavioral.mediator.contracts.PrivateChatRoom;
import behavioral.mediator.users.UserOne;
import behavioral.mediator.users.UserTwo;

public class Main {
    public static void main(String[] args) {

        PrivateChatRoom room = new PrivateChatRoomImpl();

        UserOne userOne = new UserOne(room);
        userOne.setName("Drago");

        UserTwo userTwo = new UserTwo(room);
        userTwo.setName("Iryna");


        userOne.sendMsg("Hi Iryna, what's up? :)");
        userTwo.sendMsg("Hey Drago, Zup there ?! :p");
    }
}
