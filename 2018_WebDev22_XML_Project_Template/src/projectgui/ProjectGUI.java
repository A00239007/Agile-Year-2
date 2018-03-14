package projectgui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ProjectGUI{

    /**
     * Main Method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create and set up the window.
        JFrame frame = new JFrame("TabbedPaneDemo");
        frame.setSize(550, 450);    // Set up the size
        frame.setTitle("SAX, DOM and StAX Parser");   // set up the main title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set up what happens when it closes
        
        //Add content to the window.
        frame.add(new TabbedPaneDemo(), BorderLayout.CENTER);
         
        // Set up The Menu Bar on frame
        JMenuBar menuBar = new JMenuBar(); // add the menu bar
        JMenu menu = new JMenu("File");    // create the menu
        menuBar.add(menu);                 // add the menu to the menu bar
        JMenuItem fileItem = new JMenuItem("Exit"); // create a menu item
        fileItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(fileItem);             //add the menu item
        frame.setJMenuBar(menuBar);        // add the menu bar to the frame
                
        // set the frame so it can not be sizeable
        frame.setResizable(false);
        
        // show the frame
        frame.setVisible(true);
    }
    
}
