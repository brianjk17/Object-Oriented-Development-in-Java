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
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Vaccine {
    private int VacID;
    private String VacName;
    private String VacLoc;
    private String VacSupp;
    
    //constructor
    public Vaccine(){ 
    }
    
    public Vaccine(String VacName, String VacLoc, String VacSupp) {
        this.VacName = VacName;
        this.VacLoc = VacLoc;
        this.VacSupp = VacSupp;
    }

    public Vaccine(int VacID, String VacName, String VacLoc, String VacSupp) {
        this.VacID = VacID;
        this.VacName = VacName;
        this.VacLoc = VacLoc;
        this.VacSupp = VacSupp;
    }

    public Vaccine(String vacc_data) {
        String[] vacc_data_arr = vacc_data.split(",");   //split by ","
        this.VacID = Integer.parseInt(vacc_data_arr[0]);
        this.VacName=vacc_data_arr[1];
        this.VacLoc=vacc_data_arr[2];
        this.VacSupp=vacc_data_arr[3];
    }
    
    public Vaccine(int id){
        String[] dataArray=((search_byVacID(id)).get(0)).split(",");
        this.VacID = Integer.parseInt(dataArray[0]);
        this.VacName=dataArray[1];
        this.VacLoc=dataArray[2];
        this.VacSupp=dataArray[3];
    }
 
    public int getVacID() {
        return VacID;}
    public void setVacID(int VacID) {
        this.VacID = VacID;}
    public String getVacName() {
        return VacName;}
    public void setVacName(String VacName) {
        this.VacName = VacName;}
    public String getVacSupp() {
        return VacSupp;}
    public void setVacSupp(String VacSupp) {
        this.VacSupp = VacSupp;}
    public String getVacLoc() {
        return VacLoc;}
    public void setVacLoc(String VacLoc) {
        this.VacLoc = VacLoc;}
    
    //functions
    public ArrayList<String> search_byVacID(int id){              //will return the full data of that id
        File file = new File("Vaccine.txt");
        try{
            String data;
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            while ((data=br.readLine())!= null){
                Vaccine vacc = new Vaccine(data);
                if(id==vacc.getVacID()){                                 //checks if the id is the one looking for
                    ArrayList<String> vacArray= new ArrayList<>();         //returns the searched person
                    vacArray.add(data);
                    return vacArray;
                }
            }
        }
        catch (IOException ioe){
            System.out.println("File Not Found");
        }
        return null; //if not found will return null
    }
    
    public ArrayList<String> search_byVacName(String vacname){              //will return the full data of that id
        File file = new File("Vaccine.txt");
        try{
            String data;
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            ArrayList<String> vacArray= new ArrayList<>();  
            while ((data=br.readLine())!= null){
                Vaccine vacc = new Vaccine(data);
                if(vacc.getVacName().toLowerCase().contains(vacname.toLowerCase())){ //checks if the name is the one looking for
                    vacArray.add(data);
                }
            }
            br.close();
            if(vacArray.isEmpty()){
                return null; //if not found will return null
            }
            return vacArray;
        }
        catch (IOException ioe){
            System.out.println("File Not Found");
        }
        return null;                                //if not found will return null
    }
    
    public ArrayList<String> search_byVacLoc(String vacloc){              //will return the full data of that id
        File file = new File("Vaccine.txt");
        try{
            String data;
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            ArrayList<String> vacArray= new ArrayList<>();  
            while ((data=br.readLine())!= null){
                Vaccine vacc = new Vaccine(data);
                if(vacc.getVacLoc().toLowerCase().contains(vacloc.toLowerCase())){ //checks if the location is the one looking for
                    vacArray.add(data);
                }
            }
            br.close();
            if(vacArray.isEmpty()){
                return null; //if not found will return null
            }
            return vacArray;
        }
        catch (IOException ioe){
            System.out.println("File Not Found");
        }
        return null;                                //if not found will return null
    }
    
    public ArrayList<String> search(int id,String vacname,String vacloc){  //will return the full data of that id
        File file = new File("Vaccine.txt");
        try{
            String data;
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            ArrayList<String> vacArray= new ArrayList<>();  
            while ((data=br.readLine())!= null){
                Vaccine vacc = new Vaccine(data);                                
                if(id==vacc.getVacID() && 
                        vacc.getVacName().toLowerCase().contains(vacname.toLowerCase()) &&
                        vacc.getVacLoc().toLowerCase().contains(vacloc.toLowerCase())){ //checks if the name, id, and location is the one looking for
                    vacArray.add(data);
                }
            }
            br.close();
            if(vacArray.isEmpty()){
                return null; //if not found will return null
            }
            return vacArray;
        }
        catch (IOException ioe){
            System.out.println("File Not Found");
        }
        return null;                                //if not found will return null
    }
    
    public ArrayList<String> search_by_details(String vacname,String vacloc){              //will return the full data of that id
        File file = new File("Vaccine.txt");
        try{
            String data;
            BufferedReader br = new BufferedReader(new FileReader(file));

            ArrayList<String> vacArray= new ArrayList<>();
            while ((data=br.readLine())!= null){
                Vaccine vacc = new Vaccine(data);                                
                if(vacc.getVacName().toLowerCase().contains(vacname.toLowerCase()) &&
                        vacc.getVacLoc().toLowerCase().contains(vacloc.toLowerCase())){ //checks if the name and location is the one looking for
                    vacArray.add(data);
                }
            }
            br.close();
            if(vacArray.isEmpty()){
                return null; //if not found will return null
            }
            return vacArray;
        }
        catch (IOException ioe){
            System.out.println("File Not Found");
        }
        return null;                                //if not found will return null
    }
    
    public ArrayList<String> search_by_id_name(int id,String vacname){              //will return the full data of that id
        File file = new File("Vaccine.txt");
        try{
            String data;                  
            BufferedReader br = new BufferedReader(new FileReader(file));

            ArrayList<String> vacArray= new ArrayList<>();
            while ((data=br.readLine())!= null){
                Vaccine vacc = new Vaccine(data);                               
                if(id==vacc.getVacID() &&
                        vacc.getVacName().toLowerCase().contains(vacname.toLowerCase())){ //checks if the name and id is the one looking for
                    vacArray.add(data);
                }
            }
            br.close();
            if(vacArray.isEmpty()){
                return null;//if not found will return null
            }
            return vacArray;
        }
        catch (IOException ioe){
            System.out.println("File Not Found");
        }
        return null;                                //if not found will return null
    }
    
    public ArrayList<String> search_by_id_loc(int id,String vacloc){  //will return the full data of that id
        File file = new File("Vaccine.txt");
        try{
            String data;
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            ArrayList<String> vacArray= new ArrayList<>();  
            while ((data=br.readLine())!= null){
                Vaccine vacc = new Vaccine(data);                                
                if(id==vacc.getVacID() &&
                        vacc.getVacLoc().toLowerCase().contains(vacloc.toLowerCase())){ //checks if the id and location is the one looking for
                    vacArray.add(data);
                }
            }
            br.close();
            if(vacArray.isEmpty()){
                return null;//if not found will return null
            }
            return vacArray;
        }
        catch (IOException ioe){
            System.out.println("File Not Found");
        }
        return null;                                //if not found will return null
    }
      
    public ArrayList<String> view_all_details(){
        File participant_file = new File("Vaccine.txt");
        try(FileReader fr = new FileReader(participant_file)){
                //Search for the data in the file
                BufferedReader br = new BufferedReader(fr);
                String data;
                ArrayList<String> vaccData = new ArrayList<>();
                if((data=br.readLine())!=null){
                    vaccData.add(data);
                    while ((data=br.readLine())!=null){
                        vaccData.add(data);
                    }
                    return vaccData;
                }
        }catch(Exception e){
            System.out.println("File Not Found");
        }
        return null;    //means no data
    }
    
    public void addVac(){
        
        
        int lastID=0;
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader("Vaccine.txt"))) {
            while ((line=reader.readLine()) != null) {
                String [] data = line.split(",");
                lastID=Integer.parseInt(data[0]);
            }
            VacID=lastID+1; //auto increment ID
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (PrintWriter regis = new PrintWriter(new BufferedWriter(new FileWriter("Vaccine.txt",true)))){
            //id,name,location,currentSupply
            //since new initial and current supply the same
            regis.append(VacID+","+VacName+","+VacLoc+","+VacSupp+"\n");
            regis.close();
            JOptionPane.showMessageDialog(null,"Added Successfully");
        }
        catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println("File Not Found");
        }
    }
    
    public String return_string(){
        String vac_data =  VacID+","+
                           VacName+","+
                           VacLoc+","+
                           VacSupp;
        return vac_data;
    }
    
    
    /*public void remove_vacc(String new_data){  //should have parameter so that can be used for personnel and people
        //the People object with new data
        Vaccine new_vac= new Vaccine(new_data);
        //int search_id = new_person.getPeepID(); //not need?
        
        //remove vacc detail in Vaccine.txt
        ArrayList<String> peepArrList = new ArrayList<>();
        File participant_file = new File("Vaccine.txt");   //peopletxtfile
        try{
            try(FileReader fr = new FileReader(participant_file)){
                //Search for the data changed in the array list
                BufferedReader br = new BufferedReader(fr);
                String data;
                Vaccine tempVacc;
                while ((data=br.readLine())!=null){
                    tempVacc = new Vaccine(data);
                    if (tempVacc.getVacID()== new_vac.getVacID()){}
                    else{
                        peepArrList.add(tempVacc.return_string());
                    }
                }
                try (PrintWriter pw= new PrintWriter(new FileWriter(participant_file, false))){
                    //rewrite the whole textfile with the arraylist
                    peepArrList.forEach((String)->{         //Lambda basically short form of function
                        pw.println(String);
                        });
                    JOptionPane.showMessageDialog(null, "Vaccine Suply Deleted");
                }catch (IOException ioe){
                    JOptionPane.showMessageDialog(null, ioe.getMessage());
                }
            }catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } catch (IOException ioe) {
                JOptionPane.showMessageDialog(null, ioe.getMessage());
        }
    }*/

    public void modify_vacc(String new_data){  //should have parameter so that can be used for personnel and people
        //the People object with new data
        Vaccine new_vac= new Vaccine(new_data);
        //int search_id = new_person.getPeepID(); //not need?
        
        ArrayList<String> peepArrList = new ArrayList<>();
        File participant_file = new File("Vaccine.txt");   //peopletxtfile
        try{
            try(FileReader fr = new FileReader(participant_file)){
                //Search for the data changed in the array list
                BufferedReader br = new BufferedReader(fr);
                String data;
                Vaccine tempVacc;
                while ((data=br.readLine())!=null){
                    tempVacc = new Vaccine(data);
                    if (tempVacc.getVacID()==new_vac.getVacID()){
                        //change the data
                        tempVacc.setVacName(new_vac.getVacName());
                        tempVacc.setVacLoc(new_vac.getVacLoc());
                        tempVacc.setVacSupp(new_vac.getVacSupp());
                    }
                    peepArrList.add(tempVacc.return_string());
                }
                try (PrintWriter pw= new PrintWriter(new FileWriter(participant_file, false))){
                    //rewrite the whole textfile with the arraylist
                    peepArrList.forEach((String)->{         //Lambda basically short form of function
                        pw.println(String);
                        });
                    JOptionPane.showMessageDialog(null, "Vaccine Supply Data Updated");
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
