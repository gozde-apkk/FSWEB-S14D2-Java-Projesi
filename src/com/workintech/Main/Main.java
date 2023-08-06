package com.workintech.Main;

import com.workintech.Enum.Direction;
import com.workintech.Enum.LampType;
import com.workintech.Enum.PaintColor;
import com.workintech.Model.*;

import javax.naming.NamingEnumeration;

public class Main {
    public static void main(String[] args) {


        Bedroom bedroom = new Bedroom("Ahmet",
                new Wall(Direction.NORTH),
                new Wall(Direction.SOUTH),
                new Wall(Direction.WEST),
                new Wall(Direction.EAST),
                new Ceiling(3, PaintColor.WHITE),
                new  Lamp(true,5,LampType.NEON),
                new Bed("Çift Kişilik", 4, 1, 2, 2),
                new Carpet(3,5, PaintColor.PINK),
                new Wardrobe(2, 4, 40)

        );

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println("********************");

        System.out.println(bedroom.getBed().getHeight());
        System.out.println(bedroom.getLamp());


    }
}
