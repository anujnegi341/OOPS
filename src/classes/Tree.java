package classes;

import java.awt.Color;

public class Tree {
    double heightM;
    double trunkDiameterM;
    TreeType type;
    static Color TRUNK_COLOR = new Color(102, 51, 0);


    Tree(double height, double diameter, TreeType type) {
        this.heightM = height;
        this.trunkDiameterM = diameter;
        this.type = type;
    }

    static void announceTree() {
        System.out.println("Watchout for the " + TRUNK_COLOR + " tree");
    }

    void grow() {
        this.heightM += 10;
        this.trunkDiameterM += 1;
    }
}
