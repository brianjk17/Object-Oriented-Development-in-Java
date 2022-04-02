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
public class Appointment {
    private int appID;
    private String appDate;
    private int vaccID;
    private int peepID;

    //-------Constructors-------
    public Appointment() {
    }

    public int getAppID() {
        return appID;
    }

    public void setAppID(int appId) {
        this.appID = appId;
    }

    public String getAppDate() {
        return appDate;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    public int getVaccID() {
        return vaccID;
    }

    public void setVaccID(int vaccID) {
        this.vaccID = vaccID;
    }

    public int getPeepID() {
        return peepID;
    }

    public void setPeepID(int peepID) {
        this.peepID = peepID;
    }
    
    public Appointment(String data) {
        String[] dataArray = data.split(",");   //split by ","
        this.appID = Integer.parseInt(dataArray[0]);
        this.appDate=dataArray[1];
        this.vaccID = Integer.parseInt(dataArray[2]);
        this.peepID = Integer.parseInt(dataArray[3]);
    }
    public String return_string(){
        String app_data =  appID+","+
                           appDate+","+
                           vaccID+","+
                           peepID;
        return app_data;
    }
    //functions
    public boolean add_Application(String app_date, String vac_name, String vac_loc,int id){
        try{
            int lastID=0;
            String lines;
            try (BufferedReader reader = new BufferedReader(new FileReader("Appointment.txt"))) {
                while ((lines=reader.readLine()) != null) {                     //auto increment ID
                    String [] data = lines.split(",");
                    lastID=Integer.parseInt(data[0]);
                }
                appID=lastID+1;
            } catch (IOException e) {
                e.printStackTrace();
            }
            File file = new File("Vaccine.txt");
            try{
                String data;
                int VaID=0;
                BufferedReader br = new BufferedReader(new FileReader(file));

                ArrayList<String> vacArray= new ArrayList<>();
                while ((data=br.readLine())!= null){
                    
                    Vaccine vacc = new Vaccine(data);                                //creates the vaccine object
                    if(vacc.getVacName().toLowerCase().contains(vac_name.toLowerCase()) &&
                            vacc.getVacLoc().toLowerCase().contains(vac_loc.toLowerCase())){ //checks if the vaccine name and location is the one looking for
                        vacArray.add(data);
                        String[] detail=data.split(",");
                        VaID= Integer.parseInt(detail[0]);                       //gets the ID detail
                    }
                }
                peepID=id;
                appDate= app_date;
                try (PrintWriter appoi = new PrintWriter(new BufferedWriter(new FileWriter("Appointment.txt",true)))){
                        Vaccine vac = new Vaccine(VaID);
                        int current = Integer.parseInt(vac.getVacSupp());
                        if(current==0){
                            JOptionPane.showMessageDialog(null,"Empty Supply, Please re-enter"); //if current supply can not book
                            return false;
                        }else{
                            appoi.append(appID+","+appDate+","+VaID+","+peepID+"\n");
                            appoi.close();
                            vac.setVacSupp(String.valueOf(current-1));           //-1 the supply
                            vac.modify_vacc(vac.return_string());
                            People peep = new People(peepID);
                            peep.setPeepAppid(String.valueOf(appID));            //give appointment ID to participant text file
                            peep.modify_peep(peep.return_string());
                            JOptionPane.showMessageDialog(null,"Appointment Booked Successfully");
                            return true;
                        }
                        
                        
                    } catch(IOException ioe){
                        ioe.printStackTrace();
                    }
                
                br.close();
                //return vacArray;
                if(vacArray.isEmpty()){
                    return false;                                                //if no match
                }
                
            }
            catch (Exception ioe){
                //ioe.printStackTrace();
                System.out.println("File Not Found");
            }
            //return null;
            }
            catch(Exception e){

            }
        return false;
    }
    
    public ArrayList<String> search_byPeepID(int id){              //will return the full data of that id
        File file = new File("Appointment.txt");
        try{
            String data;
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            while ((data=br.readLine())!= null){
                Appointment app = new Appointment(data);
                if(id==app.getPeepID()){   //checks if the id is the one looking for
                    ArrayList<String> appArray= new ArrayList<>();         //returns the searched person
                    appArray.add(data);
                    return appArray;
                }
            }
        }
        catch (IOException ioe){
            //ioe.printStackTrace();
            System.out.println("User not found");
        }
        return null;
    }
    public ArrayList<String> view_all_details(){        //should return the array which contains all the appointment
        File participant_file = new File("Appointment.txt");
        try(FileReader fr = new FileReader(participant_file)){
                //Search for the data changed in the array list
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
            
        }
        return null;    //means no data
    }
    
    public void remove_app(String new_data){  //should have parameter so that can be used for personnel and people
        //the Appointment object with new data
        Appointment new_app= new Appointment(new_data);
        //int search_id = new_person.getPeepID(); //not need?
        
        ArrayList<String> appArrList = new ArrayList<>();
        File participant_file = new File("Appointment.txt");
        try{
            try(FileReader fr = new FileReader(participant_file)){
                //Search for the data changed in the array list
                BufferedReader br = new BufferedReader(fr);
                String data;
                Appointment tempApp;
                while ((data=br.readLine())!=null){
                    tempApp = new Appointment(data);
                    if (tempApp.getAppID()== new_app.getAppID()){
                        
                    }
                    else{
                        appArrList.add(tempApp.return_string());
                    }
                }
                People peep = new People(new_app.getPeepID());
                peep.setPeepAppid("none");                                   // if booking cancelled remove appointment id from participant data
                peep.modify_peep(peep.return_string());
                Vaccine vac = new Vaccine(new_app.getVaccID());
                int current = Integer.parseInt(vac.getVacSupp());
                vac.setVacSupp(String.valueOf(current+1));                   //if booking cancelled +1 supply
                vac.modify_vacc(vac.return_string());
                try (PrintWriter pw= new PrintWriter(new FileWriter(participant_file, false))){
                    //rewrite the whole textfile with the arraylist
                    appArrList.forEach((String)->{         //Lambda basically short form of function
                        pw.println(String);
                        });
                    JOptionPane.showMessageDialog(null, "Appointment Deleted");
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
    public void modify_app(String new_data){  //should have parameter so that can be used for personnel and people
        //the Appointment object with new data
        Appointment new_app= new Appointment(new_data);
        
        ArrayList<String> appArrList = new ArrayList<>();
        File participant_file = new File("Appointment.txt");
        try{
            try(FileReader fr = new FileReader(participant_file)){
                //Search for the data changed in the array list
                BufferedReader br = new BufferedReader(fr);
                String data;
                Appointment tempApp;
                while ((data=br.readLine())!=null){
                    tempApp = new Appointment(data);
                    if (tempApp.getAppID()==new_app.getAppID()){
                        //change the data
                        tempApp.setAppDate(new_app.getAppDate());
                        tempApp.setVaccID(new_app.getVaccID());
                        tempApp.setPeepID(new_app.getPeepID());
                    }
                    appArrList.add(tempApp.return_string());
                }
                try (PrintWriter pw= new PrintWriter(new FileWriter(participant_file, false))){
                    //rewrite the whole textfile with the arraylist
                    appArrList.forEach((String)->{         //Lambda basically short form of function
                        pw.println(String);
                        });
                    JOptionPane.showMessageDialog(null, "Appointment Data Updated");
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
