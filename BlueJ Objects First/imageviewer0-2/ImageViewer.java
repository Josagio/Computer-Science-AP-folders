import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds 
 * and displays the application GUI.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 0.2
 */
public class ImageViewer
    implements ActionListener
{
    private JFrame frame;
    private JTextField display;
    private String [] words = {"Launching from St. Petersburg, Russia","Target Location: Las Vegas,NV","Calibrating"};
    
    class startActionListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            start();
        }
    }
    
    /**
     * Create an ImageViewer show it on screen.
     */
    public ImageViewer()
    {
        makeFrame();
    }

    /**
     * Receive notification of an action.
     * @param event Details of the action.
     */
    public void actionPerformed(ActionEvent event) 
    { 
        //System.out.println("Menu item: " + event.getActionCommand());
        if(event.getActionCommand().equals("Open")){
            openFile();
        }else if(event.getActionCommand().equals("Quit")){
            quit();
        }else if(event.getActionCommand().equals("Save")){
            saveFile();
        }else if(event.getActionCommand().equals("Launch")){
            redisplay();
        }else if(event.getActionCommand().equals("Help")){
            Help();
        }else{
            System.out.print("Where did this button come from I did not program this");
        }
        
    }
    
    /**
     * Update the interface display to show the current value of the 
     * calculator.
     */
    private void redisplay()
    {
       display.setText(words[0]);
       wait(1000);
       display.setText(words[1]);
       wait(1000);
       display.setText(words[2]);
    }

    
    // ---- swing stuff to build the frame and all its components ----
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        frame = new JFrame("ImageViewer");
        makeMenuBar(frame);
        
        //Container contentPane = frame.getContentPane();
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout(2,2));
        contentPane.setBorder(new EmptyBorder(10,30,10,30));
        display = new JTextField();
        contentPane.add(display, BorderLayout.NORTH);
        
        JLabel label = new JLabel("I am a label. I can display some text.");
        contentPane.add(label, BorderLayout.SOUTH);
        JButton button = new JButton("Launch");
        contentPane.add(button, BorderLayout.CENTER);
        
        button.addActionListener(this);

        // building is done - arrange the components and show        
        //frame.pack();
        frame.resize(700,150);
        frame.setVisible(true);
    }
    
    /**
     * Create the main frame's menu bar.
     * @param frame   The frame that the menu bar should be added to.
     */
    private void makeMenuBar(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // create the File menu
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        JMenu fileMenu2 = new JMenu("Class-File");
        menubar.add(fileMenu2);
        
        JMenuItem startItem = new JMenuItem("Start");
        startItem.addActionListener(new startActionListener());
        fileMenu2.add(startItem);
        
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(this);
        fileMenu.add(saveItem);
        
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(this);
        fileMenu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(this);
        fileMenu.add(quitItem);
        
        JMenuItem helpItem = new JMenuItem("Help");
        helpItem.addActionListener(this);
        fileMenu.add(helpItem);
    }
    
    private void openFile(){
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Openning an item will be in the next build");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
    
    private void saveFile(){
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Saving an item will be in the next build");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
    
    private void quit(){
        System.exit(0);
    }
    
    public void start(){
        System.out.print("Booting");
        for(int count = 0; count < 6; count++){
            System.out.print(".");
            wait(1000); 
        }
        System.out.println();
        System.out.print("Program Started nested classes work!");
    }
    
    private void Launch(){
   
        //System.out.println("Launching from St. Petersburg, Russia");
        //System.out.println("Target Location: Las Vegas,NV");
        //System.out.println("Calibrating");
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
    
    private void Help(){
      System.out.println("________________________________________");
      System.out.println("Image viewer 0-2");
      System.out.println("Created by: Robert J. Leggio III");
      System.out.println("Sorry there is not much to help you with");
      System.out.println("----------------------------------------");
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
