import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds and
 * displays the application GUI and initialises all other components.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 0.4
 */
public class ImageViewer
{
    private JFrame frame;
    private ImagePanel imagePanel;
    
    /**
     * Create an ImageViewer show it on screen.
     */
    public ImageViewer()
    {
        makeFrame();
    }


    // ---- implementation of menu functions ----
    
    /**
     * Open function: open a file chooser to select a new image file.
     */
    private void openFile()
    {
        OFImage image = ImageFileManager.getImage();
        imagePanel.setImage(image);
        frame.pack();
    }
    
    /**
     * Quit function: quit the application.
     */
    private void quit()
    {
        System.exit(0);
    }
    
    // ---- swing stuff to build the frame and all its components ----
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        frame = new JFrame("ImageViewer");
        makeMenuBar(frame);
        
        Container contentPane = frame.getContentPane();
        
        imagePanel = new ImagePanel();
        contentPane.add(imagePanel);

        // building is done - arrange the components and show        
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * Create the main frame's menu bar.
     * @param frame   The frame that the menu bar should be added to.
     */
    private void makeMenuBar(JFrame frame)
    {
        final int SHORTCUT_MASK =
            Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();


        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        // create the File manu
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
            openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
            openItem.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { openFile(); }
                           });
        fileMenu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
            quitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
            quitItem.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { quit(); }
                           });
        fileMenu.add(quitItem);

         JMenuItem helpItem = new JMenuItem("Help");
            helpItem.setAccelerator(KeyStroke.getKeyStroke(133, SHORTCUT_MASK));
            helpItem.addActionListener(new ActionListener() {
                               public void actionPerformed(ActionEvent e) { Launch(); }
                           });
        fileMenu.add(helpItem);
    }
    
     private void Launch(){
        String [] words;
        System.out.println("Launching from St. Petersburg, Russia");
        System.out.println("Target Location: Las Vegas,NV");
        System.out.println("Calibrating");
        for(int count = 0; count < 7; count++){
            System.out.println(".");
            wait(1000); 
        }
        System.out.println("Launching in....");
        for(int count = 10; count > 0; count--){
            System.out.println(count);
             wait(1000); 
        }
        System.out.println("Successful launch");
        System.out.println("ETA: May 20, 2016 Time: 9:50AM");
    }
    
     /**
     * Wait for a specified number of milliseconds before finishing.
     * This provides an easy way to specify a small delay which can be
     * used when producing animations.
     * @param  milliseconds  the number 
     */
    public void wait(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        } 
        catch (Exception e)
        {
            // ignoring exception at the moment
        }
    }
}
