import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.net.NetworkInterface;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JFrame frame;
    private ScrollPane scrollPane;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI window = new GUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     * @throws FileNotFoundException 
     */
    public GUI() throws FileNotFoundException {
        initialize();
        addRowToTable();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblLiveRegisterDirector = new JLabel("Live Register Director");
        lblLiveRegisterDirector.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(lblLiveRegisterDirector, BorderLayout.NORTH);
        
        JButton btnSort = new JButton("Sort By Name");
        JButton btnSortCode = new JButton("Sort By Code");
        btnSortCode.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                deleteAllRows();
                try {
                    addRowToTable();
                } catch (FileNotFoundException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }); 
        btnSort.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                LiveRegisterDirectory data = new LiveRegisterDirectory();
                MergeSorter sort = new MergeSorter();
                LinkedList<String[]> sortedlist = new LinkedList<>();
                try {
                    ArrayList<String[]> list = data.ArrayList();
                    list = sort.sort(list);
                    for(int i = 0; i<list.size();i++)
                    {
                        sortedlist.addLast(list.get(i));
                    }
                    deleteAllRows();
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    Object rowData[] = new Object[2];
                    for(int i = 0; i<list.size();i++)
                    {
                        rowData[0] = sortedlist.getValue(i)[0];
                        rowData[1] = sortedlist.getValue(i)[1];
                        model.addRow(rowData);
                    }
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        frame.getContentPane().add(btnSortCode, BorderLayout.NORTH);
        frame.getContentPane().add(btnSort, BorderLayout.SOUTH);
        
        scrollPane = new ScrollPane();
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {
            },
            new String[] {
                "Code", "Name"
            }
        ));
        frame.getContentPane().add(table, BorderLayout.WEST);
        scrollPane.add(table);
        
        

    }
    
    public LinkedList Data() throws FileNotFoundException
    {
        LiveRegisterDirectory data = new LiveRegisterDirectory();
        LinkedList<String[]> list = data.List();
        return list;
    }
    
    public void addRowToTable() throws FileNotFoundException
    {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        LinkedList<String[]> list = Data();
        Object rowData[] = new Object[2];
        for(int i = 0; i<list.size();i++)
        {
            rowData[0] = list.getValue(i)[0];
            rowData[1] = list.getValue(i)[1];
            model.addRow(rowData);
        }
    }
    
    public void deleteAllRows()
    {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

}
