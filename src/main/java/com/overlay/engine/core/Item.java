package com.overlay.engine.core;

import com.overlay.engine.graphic.DrawableObject;
import com.overlay.engine.physic.Hitbox;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class Item {
    private Hitbox hitbox;
    private boolean parent;
    private boolean root;
    private DrawableObject container;
    private ArrayList<Item> children;

    void Item(boolean root, boolean parent, double x, double y, double sizeX, double sizeY){
        this.hitbox = null;
        this.root = root;
        this.parent = parent;
        if(this.parent){
            children = new ArrayList<>();
        }
    }

    public void addChild(Item child){
        children.add(child);
    }

    public void removeChild(int index){
        if(index > 0 && index < children.size()){
            children.remove(index);
        }
    }

    public void removeChild(Item child){
        int index = children.indexOf(child);
        removeChild(index);
    }

    public void setSize(double x, double y){

    }

}
