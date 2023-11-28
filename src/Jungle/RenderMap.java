package Jungle;

import Jungle.animals.*;
import Jungle.envirement.*;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

import  Jungle.Map.*;

public class RenderMap extends JFrame {

    private int width = 615;
    private int height = 600;
    private int cellAmountInRowOrColumn = 12;
    private int division =height/cellAmountInRowOrColumn ;

    private int cellWidth = width/division;
    private int cellHeight = height/division;
    private int cellAmount = width*height/(cellHeight*cellWidth);

    public int getCellAmount() {
        return cellAmount;
    }

    public int getCellWidth() {
        return cellWidth;
    }

    public int getCellHeight() {
        return cellHeight;
    }

    Color color = new Color(50,200,50);
    URL rockIconURL = getClass().getResource("icons/rocks.png");
    URL grassIconURL = getClass().getResource("icons/grass.png");
    URL treeIconURL = getClass().getResource("icons/tree.png");
    URL boarIconURL = getClass().getResource("icons/boar.png");
    URL deerIconURL = getClass().getResource("icons/deer.png");
    URL rabbitIconURL = getClass().getResource("icons/rabbit.png");
    URL wolfIconURL = getClass().getResource("icons/wolf.png");
    URL groundIconURL = getClass().getResource("icons/soil1.png");

    ImageIcon iconWolf = new ImageIcon(wolfIconURL);
    ImageIcon iconBoar = new ImageIcon(boarIconURL);
    ImageIcon iconRabbit = new ImageIcon(rabbitIconURL);
    ImageIcon iconDeer = new ImageIcon(deerIconURL);
    ImageIcon iconTree = new ImageIcon(treeIconURL);
    ImageIcon iconGrass = new ImageIcon(grassIconURL);
    ImageIcon iconRock = new ImageIcon(rockIconURL);
    ImageIcon iconGround = new ImageIcon(groundIconURL);

    void reDraw() {
    }

    public ImageIcon iconCheck(Entity entity, Map map){
            ImageIcon imageIcon = null;
            String entityString = entity.getClass().getSimpleName();
            switch (entityString) {
                case "Deer" :
                    imageIcon = iconDeer;
                    break;
                case "WildBoar":
                    imageIcon = iconBoar;
                    break;
                case "Rabbit" :
                    imageIcon = iconRabbit;
                    break;
                case "Wolfie" :
                    imageIcon = iconWolf;
                    break;
                case "Tree":
                    imageIcon = iconTree;
                    break;
                case "Grass":
                    imageIcon = iconGrass;
                    break;
                case "Rock":
                    imageIcon = iconRock;
                    break;
                case "Ground" :
                    imageIcon = iconGround;
                    break;

        }
        return imageIcon;
    }

    public RenderMap(Map map) {
        super("Simulation");
              //grafika
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(700, 300);
        setSize(width, height);
        setBackground(Color.GRAY);
        JPanel panel1 = new JPanel(new GridLayout(12,12));
        panel1.setSize(600, 500);
        panel1.setBackground(color);
        panel1.setBorder(BorderFactory.createLineBorder(Color.gray));
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                Entity entity = map.getEntity(new Coordinates(i, j));
                JLabel label = new JLabel(iconCheck(entity, map));

                label.setSize(50, 50);
                panel1.add(label);
            }
        }
        add(panel1);
        JPanel button1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    //    JPanel button2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
     //   JPanel button3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        button1.setSize(600,100);
      ////  button3.setSize(400,200);
      //  buttons.setLocation(0,600);
       // buttons.setSize(600,200);
        JButton buttonStart = new JButton("Start");
        buttonStart.setSize(200,200);
        JButton buttonPause = new JButton("Pause");
        buttonPause.setSize(200,200);
        JButton buttonNextMove = new JButton("Next");
        buttonNextMove.setSize(200,200);
        button1.add(buttonStart);
        button1.add(buttonPause);
        button1.add(buttonNextMove);
        add(button1);
  //      add(button2);
    //    add(button3);
        Container container = getContentPane();
        // Размещение панели с кнопками внизу справа
        container.add(button1, BorderLayout.SOUTH);
        //   setIconImage(icon.getImage());
        //      }
//}
        setVisible(true);
    }


}