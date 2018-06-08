import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.text.DecimalFormat;

public class DecimalFormatRenderer extends DefaultTableCellRenderer {
    private static final DecimalFormat formatter = new DecimalFormat("#0.000000");

    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        // First format the cell value as required

        value = formatter.format((Number)value);

        // And pass it on to parent class

        setHorizontalAlignment(SwingConstants.RIGHT);

        return super.getTableCellRendererComponent(
                table, value, isSelected, hasFocus, row, column );
    }
}
