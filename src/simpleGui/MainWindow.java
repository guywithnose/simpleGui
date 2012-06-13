package simpleGui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import java.awt.FlowLayout;
import java.awt.event.*;

/**
 * The Class MainWindow.
 */
public class MainWindow extends JFrame
{

    /**
     * The Class closeListener.
     */
    private class closeAction implements ActionListener
    {

        public closeAction()
        {
            // Do Nothing
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.println(e.getActionCommand());
            System.exit(0);
        }
        
    }

    /**
     * The Class closeListener.
     */
    private class closeListener extends WindowAdapter
    {

        /**
         * Instantiates a new close listener.
         */
        public closeListener()
        {
            // Do Nothing
        }

        /*
         * (non-Javadoc)
         * 
         * @see
         * java.awt.event.WindowAdapter#windowClosing(java.awt.event.WindowEvent
         * )
         */
        @SuppressWarnings("unused")
        @Override
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }

    }

    /**
     * Instantiates a new main window.
     * 
     * @param title
     *            the title
     */
    public MainWindow(String title)
  {
    super(title);
    setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    addWindowListener(new closeListener());
    setLayout(new FlowLayout());
    add(new JLabel("Now formatting your entire hard drive :)"));
    JButton cancelButton = new JButton("Cancel");
    cancelButton.addActionListener(new closeAction());
    JButton okButton = new JButton("OK");
    okButton.addActionListener(new closeAction());
    add(okButton);
    add(cancelButton);
  }
}
