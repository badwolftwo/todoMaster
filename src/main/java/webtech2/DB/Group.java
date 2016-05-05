package webtech2.DB;


import java.util.List;

/**
 * Created by Christoph on 05.05.2016.
 */
public class Group {

    private List <User> GroupList;
    private User admin;

    public Group(){};
    public Group(User admin){

        GroupList.add(admin);
        this.admin=admin;
    }

    public List<User> getInGroup() {
        return GroupList;
    }

    public User getAdmin() {
        return admin;
    }

    public void setInGroup(List<User> Group) {
        GroupList = Group;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }




}
