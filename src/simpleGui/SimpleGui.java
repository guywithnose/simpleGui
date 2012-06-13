package simpleGui;

import javax.swing.SwingUtilities;

/**
 * The Class SimpleGui.
 */
public class SimpleGui implements Runnable
{

    /** The window. */
    public static MainWindow window = new MainWindow("Simple Gui");

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run()
    {
        window.pack();
        window.setSize(300, 120);
        window.setVisible(true);
    }

    /**
     * The main method.
     * 
     * @param args
     *            the arguments
     */
    public static void main(String[] args)
    {
        try
        {
            SwingUtilities.invokeAndWait(new SimpleGui());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
