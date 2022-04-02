/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class User{
    
    
    //-------Functions-------
    
    //Modify Participant Function
    public void modify_peep(String new_data){  //should have parameter so that can be used for personnel and people
        //the People object with new data
        People new_person= new People(new_data);
        //int search_id = new_person.getPeepID(); //not need?
        
        ArrayList<String> peepArrList = new ArrayList<>();
        File participant_file = new File("People.txt");   //peopletxtfile
        try{
            try(FileReader fr = new FileReader(participant_file)){
                //Search for the data changed in the array list
                BufferedReader br = new BufferedReader(fr);
                String data;
                People tempPeep;
                while ((data=br.readLine())!=null){
                    tempPeep = new People(data);
                    if (tempPeep.getPeepID()==new_person.getPeepID()){
                        //change the data
                        tempPeep.setPeepFullname(new_person.getPeepFullname()); //grab the one from the new data
                        tempPeep.setPeepUsername(new_person.getPeepUsername());
                        tempPeep.setPeepPassword(new_person.getPeepPassword());
                        tempPeep.setPeepDOB(new_person.getPeepDOB());
                        tempPeep.setPeepType(new_person.getPeepType());
                        tempPeep.setPeepICPass(new_person.getPeepICPass());
                        tempPeep.setPeepAppid(new_person.getPeepAppid());//none
                        tempPeep.setPeepStatus(new_person.getPeepStatus());//not vacinated
                    }
                    //System.out.println(tempPeep);
                    peepArrList.add(tempPeep.return_string());
                }
                try (PrintWriter pw= new PrintWriter(new FileWriter(participant_file, false))){
                    //rewrite the whole textfile with the arraylist
                    peepArrList.forEach((String)->{         //Lambda basically short form of function
                        pw.println(String);
                        });
                    JOptionPane.showMessageDialog(null, "Participant updated");
                }catch (IOException ioe){
                    JOptionPane.showMessageDialog(null, ioe.getMessage());
                }
            }catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } catch (IOException ioe) {
                JOptionPane.showMessageDialog(null, ioe.getMessage());
        }
    }
}
