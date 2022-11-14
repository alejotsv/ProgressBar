package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class ProgressBar extends JFrame {
    Dimension dim = new Dimension(400, 200);

    ProgressBar(String title) throws InterruptedException {
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JLabel barLabel = new JLabel("Progress");
        int min = 0;
        int max = 100;
        JProgressBar progressBar = new JProgressBar(min, max);
        progressBar.setStringPainted(true);
        panel.add(barLabel);
        panel.add(progressBar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
        pack();
        int i = min;
        while(i<=max){
            TimeUnit.SECONDS.sleep(2);
            progressBar.setValue(i);
            i+=10;
        }
    }
}
