package ddos;

import java.awt.Container;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DDOS
        extends JFrame {

    private JButton jButton1;
    private JButton jButton3;
    private JCheckBox jCheckBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;

    /**
     *
     */
    public DDOS() {
        initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jLabel2 = new JLabel();
        this.jTextField2 = new JTextField();
        this.jCheckBox1 = new JCheckBox();
        this.jButton1 = new JButton();
        this.jButton3 = new JButton();
        this.jTextField3 = new JTextField();
        this.jTextField4 = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();

        setDefaultCloseOperation(3);
        setResizable(false);

        this.jLabel1.setText("Enter address: ");

        this.jTextField1.setText("example.com");

        this.jLabel2.setText("Enter Port: ");

        this.jTextField2.setText("80");

        this.jCheckBox1.setSelected(true);
        this.jCheckBox1.setText("Attack With TOR");

        this.jButton1.setText("Attack Now");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DDOS.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton3.setText("Check Uptime Website");
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DDOS.this.jButton3ActionPerformed(evt);
            }
        });
        this.jTextField3.setText("100");

        this.jTextField4.setText("100");

        this.jLabel3.setText("Threads");

        this.jLabel4.setText("Socks per Thread");

        this.jLabel5.setText("[Demo Tool DDos - nguyenduit © 2016]");
        this.jLabel5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                DDOS.this.jLabel5MouseClicked(evt);
            }
        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel5, -1, -1, 32767).addComponent(this.jButton3, -1, -1, 32767).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jCheckBox1, -2, 180, -2).addGap(2, 2, 2)).addGroup(layout.createSequentialGroup().addComponent(this.jTextField3, -2, 86, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField4)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.jTextField1, -2, 145, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField2, -2, 29, -2).addComponent(this.jLabel2))).addGroup(layout.createSequentialGroup().addComponent(this.jLabel3, -2, 82, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel4))).addGap(0, 0, 32767)).addComponent(this.jButton1, -1, -1, 32767)).addContainerGap()));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(16, 16, 16).addComponent(this.jLabel5).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jLabel2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField1, -2, -1, -2).addComponent(this.jTextField2, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jLabel4)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField3, -2, -1, -2).addComponent(this.jTextField4, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jCheckBox1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3).addContainerGap()));

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String ip = this.jTextField1.getText();
        int port = Integer.parseInt(this.jTextField2.getText());
        int a = Integer.parseInt(this.jTextField3.getText());
        int b = Integer.parseInt(this.jTextField4.getText());
        for (int k = 0; k < a; k++) {
            new Thread(new function(ip, port, b, this.jCheckBox1.isSelected())).start();
        }
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URL("http://isup.me/" + this.jTextField1.getText()).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jLabel5MouseClicked(MouseEvent evt) {
        try {
            Desktop.getDesktop().browse(new URL("http://google.com").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DDOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DDOS().setVisible(true);
            }
        });
    }
}
