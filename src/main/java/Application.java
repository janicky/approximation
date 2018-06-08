import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    private JPanel applicationContent;
    private JTable table;

    public Application(String title) throws HeadlessException {
        super(title);
        setContentPane(applicationContent);
        setSize(700, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        initTable();
    }

    private void initTable() {
        table.setModel(new ApproximationTableModel());
    }
}
