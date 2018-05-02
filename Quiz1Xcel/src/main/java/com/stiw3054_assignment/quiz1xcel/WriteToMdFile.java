/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stiw3054_assignment.quiz1xcel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author abdullah
 */
public class WriteToMdFile {
    private StudentList stud;
    BufferedWriter writer = null;
    File file;

    public WriteToMdFile(StudentList stud) {
        this.stud = stud;
        file = new File ("/users/abdullah/Downloads/List of Supervisors (A171).markdown");
        //file = new File ("/Users/abdullah/231440-STIW3054-A172-A1.wiki/new.markdown");
    }

    public WriteToMdFile(StudentList stud, String file) {
        this.stud = stud;
        this.file = new File (file);
    }
    
    public void WriteFile () throws Exception{
            FileWriter fw = new FileWriter(file);
            writer = new BufferedWriter(fw);
            String text = "## A171 Practicum\n----\n" +
                   "### From 21/02/2018 to 20/08/2018\n" +
                    "----\n";
            Student student = stud.getStudent(0);
            text += "| \\"+student.getNum()+" | Matric Num | " + student.getName() + ""
                         + " | " + student.getSv() + " |\n";
            text += "|:------|:-------|:--------|:--------|\n";
            
            
            for(int i=1; i<stud.getSize(); i++){
                student = stud.getStudent(i);
               
                text += "| "+student.getNum()+" | "+ student.getMatric() +" | " + student.getName() + ""
                         + " | " + student.getSv() + " |\n";
            }
            
            String append = text;
            writer.write(append);
            writer.close();
    
    }
    
    
    
}
