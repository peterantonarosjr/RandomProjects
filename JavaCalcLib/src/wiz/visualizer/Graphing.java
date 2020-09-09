package wiz.visualizer;

import wiz.polynomials.Polynomial;

import javax.swing.*;
import java.awt.*;

public class Graphing extends JFrame {
    private Polynomial poly;
    public Graphing(Polynomial poly){
        this.poly= poly;
        setFrame();
        setPanel();
        graphPoly();
    }

    private void setFrame() {

        this.setResizable(false);
        this.setVisible(true);

    }

    private void setPanel() {
        JPanel myPanel = new JPanel();

        this.add(myPanel);
    }

    private void graphPoly(){
        String func = this.poly.finalPolyToString();

    }

}
