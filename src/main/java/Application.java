import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    private JPanel applicationContent;
    private JTable table;
    private JTextField estimation;

    public Application(String title) throws HeadlessException {
        super(title);
        setContentPane(applicationContent);
        setSize(700, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initTable();
    }

    private void initTable() {
        ApproximationTableModel tableModel = new ApproximationTableModel();
        table.setModel(tableModel);

        for (int i = (int) Configuration.a * 10; i <= Configuration.b * 10; i++) {
            double tmp_i = i / 10d;
            double fn = Configuration.function(tmp_i);
            double approx = Approximation.approx(tmp_i);
            double e = Math.abs(fn - approx);
            tableModel.add(new Object[] { tmp_i, fn, approx, e });
        }

        table.getColumnModel().getColumn(1).setCellRenderer(new DecimalFormatRenderer());
        table.getColumnModel().getColumn(2).setCellRenderer(new DecimalFormatRenderer());
        table.getColumnModel().getColumn(3).setCellRenderer(new DecimalFormatRenderer());
    }
}
