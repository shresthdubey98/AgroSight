package info.androidhive.agrosight;

import com.stfalcon.chatkit.commons.models.IDialog;
import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.IUser;

import java.util.List;

public class ChatDialog implements IDialog {
    private String id;
    private String imageUrl;
    private String name;
    private String lastMessage;
    private int unreadCount;
    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getDialogPhoto() {
        return null;
    }

    @Override
    public String getDialogName() {
        return null;
    }

    @Override
    public List<? extends IUser> getUsers() {
        return null;
    }

    @Override
    public IMessage getLastMessage() {
        return null;
    }

    @Override
    public void setLastMessage(IMessage message) {}
    @Override
    public int getUnreadCount() {
        return 0;
    }
}
