/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stiw3054_assignment.quiz1xcel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author abdullah
 */
public class TestingNoni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String cmd = "cd 231440-STIW3054-A172-A1.wiki";
        String command = "git add List of Supervisors (A171).markdown";
        String cmd2 = "git push";

        Process proc = Runtime.getRuntime().exec(cmd);
                proc = Runtime.getRuntime().exec(command);
                proc = Runtime.getRuntime().exec(cmd2);
                
        // Read the output

        BufferedReader reader =  
              new BufferedReader(new InputStreamReader(proc.getInputStream()));

        String line = "";
        while((line = reader.readLine()) != null) {
            System.out.print(line + "\n");
        }

        proc.waitFor();   
        
        
    }
    
}
