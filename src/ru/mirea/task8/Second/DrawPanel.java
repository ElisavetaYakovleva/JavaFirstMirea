package ru.mirea.task8.Second;

import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("C:\\Users\\lizab\\OneDrive\\Изображения\\china.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }

}
