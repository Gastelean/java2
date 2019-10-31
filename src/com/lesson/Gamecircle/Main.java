package com.lesson.Gamecircle;

import javafx.scene.layout.Background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame {
    /*
     *  * Реализовать добавление новых кружков по клику используя ТОЛЬКО массивы
     *  ** Реализовать по клику другой кнопки удаление кружков (никаких эррейЛист)
     * */

    private static final int POS_X = 600;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;
    int length = 5; // думал через переменную сделать увеличение/уменьшение кол-ва шариков
    /*addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            length++;
        }
    });*/
    Sprite[] sprites = new Sprite[length];
    BG b = new BG();


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });

    }

    private Main() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Circles");

        GameCanvas canvas = new GameCanvas(this);
        add(canvas, BorderLayout.CENTER);
        initApplication();
        setVisible(true);

    }


    private void initApplication() {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();

        }


    }

    public void onDrawFrame(GameCanvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);

    }


    private void update(GameCanvas canvas, float deltaTime) {

        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }


    private void render(GameCanvas canvas, Graphics g) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
        b.updateBG(canvas, 43);
        addMouseListener(new MouseAdapter() {
        });
    }

}



