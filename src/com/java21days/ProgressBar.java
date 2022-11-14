package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class ProgressBar extends JFrame {
    Dimension dim = new Dimension(200, 200);

    ProgressBar(String title) throws InterruptedException {
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();

        TimeUnit.SECONDS.sleep(1);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    String time(LocalDateTime dateTime){
        String date = dateTime.toString();
        String[] time = date.split("T");
        System.out.println(time[1]);
        return time[1];
    }

}
