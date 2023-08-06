package com.workintech.Model;

import com.workintech.Enum.Direction;

public class Wall {
    private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
    public void create(){
        System.out.println("Wall has been created at:"+getDirection());
    }
}
