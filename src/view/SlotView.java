/*
 * Created by JFormDesigner on Tue Jun 29 21:25:02 CEST 2021
 */

package view;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class SlotView extends JFrame {
    public SlotView() {
        super("Superminitragaperras");
        initComponents();

        lblImg1.setText("");
        lblImg2.setText("");
        lblImg3.setText("");

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        menuBar2 = new JMenuBar();
        menu1 = new JMenu();
        menu2 = new JMenu();
        menuItem2 = new JMenuItem();
        menuItem1 = new JMenuItem();
        lblImg1 = new JLabel();
        lblImg2 = new JLabel();
        lblImg3 = new JLabel();
        btnPlay = new JButton();
        lblCredit = new JLabel();
        lblPrice = new JLabel();
        btnRestart = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar2 ========
        {

            //======== menu1 ========
            {
                menu1.setText("text");

                //======== menu2 ========
                {
                    menu2.setText("text");

                    //---- menuItem2 ----
                    menuItem2.setText("text");
                    menu2.add(menuItem2);

                    //---- menuItem1 ----
                    menuItem1.setText("text");
                    menu2.add(menuItem1);
                }
                menu1.add(menu2);
            }
            menuBar2.add(menu1);
        }
        setJMenuBar(menuBar2);

        //---- lblImg1 ----
        lblImg1.setText("text");
        contentPane.add(lblImg1);
        lblImg1.setBounds(10, 10, 100, 100);

        //---- lblImg2 ----
        lblImg2.setText("text");
        contentPane.add(lblImg2);
        lblImg2.setBounds(120, 10, 100, 100);

        //---- lblImg3 ----
        lblImg3.setText("text");
        contentPane.add(lblImg3);
        lblImg3.setBounds(230, 10, 100, 100);

        //---- btnPlay ----
        btnPlay.setText("text");
        contentPane.add(btnPlay);
        btnPlay.setBounds(20, 200, 80, btnPlay.getPreferredSize().height);

        //---- lblCredit ----
        lblCredit.setText("text");
        contentPane.add(lblCredit);
        lblCredit.setBounds(350, 10, 100, lblCredit.getPreferredSize().height);

        //---- lblPrice ----
        lblPrice.setText("text");
        contentPane.add(lblPrice);
        lblPrice.setBounds(new Rectangle(new Point(150, 200), lblPrice.getPreferredSize()));

        //---- btnRestart ----
        btnRestart.setText("text");
        contentPane.add(btnRestart);
        btnRestart.setBounds(new Rectangle(new Point(260, 200), btnRestart.getPreferredSize()));

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JMenuBar menuBar2;
    public JMenu menu1;
    public JMenu menu2;
    public JMenuItem menuItem2;
    public JMenuItem menuItem1;
    public JLabel lblImg1;
    public JLabel lblImg2;
    public JLabel lblImg3;
    public JButton btnPlay;
    public JLabel lblCredit;
    public JLabel lblPrice;
    public JButton btnRestart;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
