import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class MiniLibraryApp extends JFrame {

    private JTable table;
    private DefaultTableModel model;
    private JTextField searchField;

    // Sample 10 books data
    private Object[][] books = {
            {"The Alchemist", "Paulo Coelho", "Available"},
            {"1984", "George Orwell", "Available"},
            {"To Kill a Mockingbird", "Harper Lee", "Available"},
            {"Pride and Prejudice", "Jane Austen", "Available"},
            {"The Great Gatsby", "F. Scott Fitzgerald", "Available"},
            {"Moby Dick", "Herman Melville", "Available"},
            {"War and Peace", "Leo Tolstoy", "Available"},
            {"Hamlet", "William Shakespeare", "Available"},
            {"The Catcher in the Rye", "J.D. Salinger", "Available"},
            {"Harry Potter", "J.K. Rowling", "Available"}
    };

    public MiniLibraryApp() {
        setTitle("📚 Mini Library (10 Books)");
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout
        setLayout(new BorderLayout());

        // Table model
        String[] columnNames = {"Title", "Author", "Status"};
        model = new DefaultTableModel(books, columnNames);
        table = new JTable(model);
        table.setRowHeight(25);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Search Panel
        JPanel searchPanel = new JPanel(new FlowLayout());
        searchField = new JTextField(20);
        JButton searchBtn = new JButton("🔍 Search");
        JButton resetBtn = new JButton("Reset");

        searchPanel.add(new JLabel("Search Book:"));
        searchPanel.add(searchField);
        searchPanel.add(searchBtn);
        searchPanel.add(resetBtn);

        add(searchPanel, BorderLayout.NORTH);

        // Borrow / Return Panel
        JPanel actionPanel = new JPanel(new FlowLayout());
        JButton borrowBtn = new JButton("📖 Borrow");
        JButton returnBtn = new JButton("✅ Return");
        actionPanel.add(borrowBtn);
        actionPanel.add(returnBtn);

        add(actionPanel, BorderLayout.SOUTH);

        // Search Action
        searchBtn.addActionListener(e -> {
            String keyword = searchField.getText().toLowerCase();
            for (int i = 0; i < table.getRowCount(); i++) {
                String title = table.getValueAt(i, 0).toString().toLowerCase();
                table.setRowHeight(i, title.contains(keyword) ? 25 : 0); // Hide rows not matching
            }
        });

        resetBtn.addActionListener(e -> {
            searchField.setText("");
            for (int i = 0; i < table.getRowCount(); i++) {
                table.setRowHeight(i, 25); // Reset all rows visible
            }
        });

        // Borrow Action
        borrowBtn.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row >= 0) {
                if (table.getValueAt(row, 2).equals("Available")) {
                    table.setValueAt("Borrowed", row, 2);
                    JOptionPane.showMessageDialog(this, "You borrowed: " + table.getValueAt(row, 0));
                } else {
                    JOptionPane.showMessageDialog(this, "Already Borrowed!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a book!");
            }
        });

        // Return Action
        returnBtn.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row >= 0) {
                if (table.getValueAt(row, 2).equals("Borrowed")) {
                    table.setValueAt("Available", row, 2);
                    JOptionPane.showMessageDialog(this, "You returned: " + table.getValueAt(row, 0));
                } else {
                    JOptionPane.showMessageDialog(this, "This book is not borrowed!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a book!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MiniLibraryApp().setVisible(true));
    }
}
