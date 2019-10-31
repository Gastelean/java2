package com.lesson.Gamecircle;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Handler;

class BG {
    void updateBG(GameCanvas canvas, float deltaTime) {
        int i = (int) (Math.random() * 10);
        if (i < 5) {
            try {
                Thread.sleep((long) deltaTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            canvas.setBackground(Color.getHSBColor(34, 34, 34));
        } else {
            try {
                Thread.sleep((long) deltaTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            canvas.setBackground(Color.getHSBColor(40, 40, 40));
        }

    }
}