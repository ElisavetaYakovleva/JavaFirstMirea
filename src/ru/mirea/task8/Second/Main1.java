package ru.mirea.task8.Second;

import javax.swing.*;
import java.awt.*;
public class Main1 extends JFrame
{
    public static void main(String[] args)
    {
        Main1 m = new Main1();
        m.paint();
    }
    public void paint()
    {
        JFrame frame = new JFrame();
        DrawPanel panel = new DrawPanel();
        frame.getContentPane().add(panel);
        frame.setSize(736, 920);
        frame.setVisible(true);
    }
}
