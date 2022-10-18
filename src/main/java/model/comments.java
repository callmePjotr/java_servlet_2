package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class comments implements Serializable {


    private String name;
    private String email;
    private ArrayList comment;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList getComment() {
        return comment;
    }
    public void setComment(ArrayList elements) {
        this.comment = elements;
    }
}
