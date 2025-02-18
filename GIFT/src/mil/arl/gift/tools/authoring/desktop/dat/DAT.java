/**
 * Copyright Dignitas Technologies, LLC
 * 
 * This file and its contents are governed by one or more distribution and
 * copyright statements as described in the LICENSE.txt file distributed with
 * this work.
 */
package mil.arl.gift.tools.authoring.desktop.dat;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import mil.arl.gift.common.PackageUtil;
import mil.arl.gift.common.io.DetailedException;

import org.apache.log4j.PropertyConfigurator;

/**
 * This class is the entry point for the domain knowledge file (DKF) authoring tool (DAT).
 * 
 * @author mhoffman
 *
 */
public class DAT {
    
    static {
        //use DAT log4j
        PropertyConfigurator.configureAndWatch(PackageUtil.getConfiguration() + "/tools/authoring/dat/dat.log4j.properties");
    }  
    
    /** the main window for this tool */
    private DATForm datForm;
    
    /** singleton instance of this class */
    private static DAT instance = null;
    
    /**
     * Return the singleton instance of this class
     * 
     * @return the singleton instance
     * @throws DetailedException if there was a problem with the dkf schema file
     */
    public static DAT getInstance() throws DetailedException{
        
        if(instance == null){
            instance = new DAT();
        }
        
        return instance;
    }
    
    /**
     * Class constructor - build dialog
     * @throws DetailedException if there was a problem with the dkf schema file
     */
    private DAT() throws DetailedException{        

        String courseSchema = DATProperties.getInstance().getSchemaFilename();
        if(courseSchema != null){
            datForm = new DATForm(new File(courseSchema));
        }else{
            datForm  = new DATForm();
        }
    }
    
    /**
     * Initialize the tool's dialog and display it
     * @throws Throwable if there was a problem connecting to the UMS database
     */
    public void init() throws Throwable{
        datForm.init();
    }
    
    /**
     * Dispose the tool's dialog
     */
    public void dispose(){
        datForm.close();
    }
    
    /**
     * Get the tool's main window
     * 
     * @return DATForm
     */
    public DATForm getDATForm(){
        return datForm;
    }

    /**
     * Instantiate the DAT dialog
     * 
     * @param args - not used
     */
    public static void main(String[] args) {
        
        DAT dat = null;
        
        try{  
            dat = DAT.getInstance();
            
            dat.init();
        
            showStartedPrompt();            
            
            //dispose after user has decided to close via terminal window
            dat.dispose();
            
        }catch(Throwable e){
            e.printStackTrace();
            
            if(dat != null){
                //close the dialog to force user to look at minimized terminal window for more information
                dat.dispose();
            }
            
            JOptionPane.showMessageDialog(null,
                    "The DKF Authoring Tool closed unexpectedly.  Check the log file and the console window for more information.",
                    "DKF Authoring Tool Error",
                    JOptionPane.ERROR_MESSAGE);
            
            showUnexpectedExitPrompt();
        }
        
        System.out.println("Good-bye");
    }
    
    /**
     * Show a message indicating the DAT has launched and prompt for user to exit the application
     */
    protected static void showStartedPrompt(){

        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("DAT is running, check log for more details");
            String input = null;
            do {
                System.out.print("Press Enter to Exit\n");
                input = inputReader.readLine();

            } while (input.length() != 0);

        } catch (Exception e) {

            System.err.println("Caught exception while reading input: \n");
            e.printStackTrace();
        }
    }
    
    /**
     * Show an unexpected exit prompt and then exit.
     */
    protected static void showUnexpectedExitPrompt(){
        
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.println("The tool has exited, check prompt and log for more details");
            String input = null;
            do {
                System.out.print("Press Enter to Exit");
                input = inputReader.readLine();

            } while (input.length() != 0);

        } catch (Exception e) {

            System.err.println("Caught exception while reading input: \n");
            e.printStackTrace();
        }
        
        System.out.println("Good-bye");
        //Instead of using the usual error code 1 here, GIFT uses an arbitrary 101 exit code which is checked for
        //in scripts/runCommand.bat
        System.exit(101);       
    }

}
