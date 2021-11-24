package ru.mirea.task8.Third;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
public class Main extends JFrame
{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 400;
    static Image image;
    protected static ArrayList<Image> frames = new ArrayList<>();
    public Main()
    {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics graphic)
    {
        super.paintComponents(graphic);
        graphic.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args)
    {
        new Main();
        frames.add(new ImageIcon("C:\\Users\\lizab\\OneDrive\\Изображения\\пр8\\хоба1.jpg").getImage());
        frames.add(new ImageIcon("C:\\Users\\lizab\\OneDrive\\Изображения\\пр8\\хоба2.jpg").getImage());
        frames.add(new ImageIcon("C:\\Users\\lizab\\OneDrive\\Изображения\\пр8\\хоба3.jpg").getImage());
        frames.add(new ImageIcon("C:\\Users\\lizab\\OneDrive\\Изображения\\пр8\\хоба4.jpg").getImage());

        Main frame = new Main();

        while (true)
        {
            for (int i = 0; i < 3; i++)
            {
                image = frames.get(i);
                frame.repaint();
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}