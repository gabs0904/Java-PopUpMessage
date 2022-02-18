package com.company;
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

    public static void main(String[] args) {
	// write your code here
        showMessageDialog(null,"You've been hacked","WARNING",1);
        showMessageDialog(null,"To solve it","WARNING",1);
        showMessageDialog(null,"answer a simple question","WARNING",1);
        int returnValue = 0;
        double wow;

        returnValue = JOptionPane.showConfirmDialog(null, "Will you go out with me?", "♡♡♡", JOptionPane.YES_NO_OPTION);
        if (returnValue == JOptionPane.YES_OPTION)
            showMessageDialog(null, "Yayyy");
        else if (returnValue == JOptionPane.NO_OPTION)
            showMessageDialog(null, "Wrong answer","",  ERROR_MESSAGE);
    }

}
