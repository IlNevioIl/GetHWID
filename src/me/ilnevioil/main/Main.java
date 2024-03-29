package me.ilnevioil.main;

import javax.swing.*;

/**
 * Made by _bt on 08 April 2021
 * JOptionPane message added by Peter on 31 August 2022
 */

public class Main {
    public static String hwid = System.getProperty("user.name") + " " + System.getenv("COMPUTERNAME") + " " + System.getenv("os") + " " + System.getProperty("os.name") + " " + System.getenv("PROCESSOR_IDENTIFIER") + " " + System.getProperty("os.arch") + " " + System.getProperty("os.version") + " " + System.getProperty("user.language") + " " + System.getenv("SystemRoot") + " " + System.getenv("HOMEDRIVE") + " " + System.getenv("PROCESSOR_LEVEL") + " " + System.getenv("PROCESSOR_REVISION") + " " + System.getenv("PROCESSOR_IDENTIFIER") + " " + System.getenv("PROCESSOR_ARCHITECTURE") + " " + System.getenv("PROCESSOR_ARCHITEW6432") + " " + System.getenv("NUMBER_OF_PROCESSORS");

    public static void main(String args[]) {
        showMessage(); //Show the JOptionPane message! - Peter

        //Todo: Gui
        //All this down here is for a future gui update (there will be a JOptionPane message for now - Peter):

        /*JFrame jf1 = new JFrame();
        jf1.setVisible(true);
        jf1.setSize(500, 100);
        jf1.setTitle("HWID Scanner by _bt");
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setLayout(null);
        jf1.setResizable(false);
        jf1.setLocationRelativeTo(null);
        jf1.requestFocus();

        JLabel jLabel = new JLabel("==Please use this in your cmd==");
        jLabel.setVisible(true);
        jLabel.setBounds(150, 20, 200, 20);
        jf1.add(jLabel);*/
    }

    public static void showMessage() {
        copyToClipboard();
        JOptionPane.showMessageDialog((Component)null, "HWID: " + hwid, "Copied to clipboard!", 0);
    }

    public static void copyToClipboard() {
        StringSelection selection = new StringSelection(hwid);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
}
