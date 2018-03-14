package projectgui;
 
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
 
public class TabbedPaneDemo extends JPanel {
    public TabbedPaneDemo() {
        super(new GridLayout(1, 1));
         
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Making an object of the SetUp class, so it can be added to the frame
        Parse parseTab = new Parse();
        parseTab.setLayout(null); // set the layout
        tabbedPane.addTab("Parse", parseTab);
         
        // Making an object of the SetUp class, so it can be added to the frame
        Insert insertTab = new Insert();
        insertTab.setLayout(null); // set the layout
        tabbedPane.addTab("Insert", insertTab);
         
        //Add the tabbed pane to this panel.
        add(tabbedPane);
         
        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
}