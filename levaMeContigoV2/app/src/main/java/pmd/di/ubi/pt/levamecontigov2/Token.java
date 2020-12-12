package pmd.di.ubi.pt.levamecontigov2;

import java.util.ArrayList;

public class Token {
    private String email;
    private byte[] id;
    private boolean check;
    private ArrayList<String> usernameList;

    public Token(){
        email = "";
        usernameList = new ArrayList<String>();
        id = new byte[64];
    }

    public String getEmail(){
        return email;
    }

    public ArrayList<String> getUsername(){
        return usernameList;
    }

    public String getId() {
        return id.toString();
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setUsername(String username){
        this.usernameList.add(username);
    }

    public void setId(String id){
        this.id = id.getBytes();
    }

}
