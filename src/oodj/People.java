/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class People extends User{
    private int peepID;
    private String peepUsername;
    private String peepFullname;
    private String peepDOB;
    private String peepPassword;
    private String peepICPass;
    private String peepType;
    private String peepAppid;
    private String peepStatus;
    
    //-------Constructors-------
    public People(){
    }
    
    //Register
    public People(String peepUsername, String peepFullname, String peepDOB, String peepPassword, String peepICPass, String peepType) {
        this.peepUsername = peepUsername;
        this.peepPassword = peepPassword;
        this.peepFullname = peepFullname;
        this.peepDOB = peepDOB;
        this.peepICPass = peepICPass;
        this.peepType = peepType;
    }
    
    //Login
    public People(String peepUsername, String peepPassword) {
        this.peepUsername = peepUsername;
        this.peepPassword = peepPassword;
    }

    //People object ID,fullname,dob,participantType,ID/IC,status,AppointmentID
    //sets the person object with the variable from the combined data string
    public People(String data){
        String[] dataArray = data.split(",");   //split by ","
        this.peepID =(Integer.parseInt(dataArray[0]));
        this.peepUsername =(dataArray[1]);
        this.peepPassword =(dataArray[2]);
        this.peepFullname =(dataArray[3]);
        this.peepDOB=(dataArray[4]);
        this.peepType=(dataArray[5]);
        this.peepICPass=(dataArray[6]);
        this.peepAppid =(dataArray[7]);//none
        this.peepStatus =(dataArray[8]);//not vacinated
    }
    
    public People(int id){ //get participant data from id
        Personnel find_person=new Personnel();
        String[] dataArray=((find_person.search_peep_byID(id)).get(0)).split(",");
        this.peepID =(Integer.parseInt(dataArray[0]));
        this.peepUsername =(dataArray[1]);
        this.peepPassword =(dataArray[2]);
        this.peepFullname =(dataArray[3]);
        this.peepDOB=(dataArray[4]);
        this.peepType=(dataArray[5]);
        this.peepICPass=(dataArray[6]);
        this.peepAppid =(dataArray[7]);//none
        this.peepStatus =(dataArray[8]);
    }
    
    //-------Get Set Methods-------
    public int getPeepID() {
        return peepID;}
    public void setPeepID(int peepID) {
        this.peepID = peepID;}
    public String getPeepFullname() {
        return peepFullname;}
    public void setPeepFullname(String peepFullname) {
        this.peepFullname = peepFullname;}
    public String getPeepDOB() {
        return peepDOB;}
    public void setPeepDOB(String peepDOB) {
        this.peepDOB = peepDOB;}
    public String getPeepPassword() {
        return peepPassword;}
    public void setPeepPassword(String peepPassword) {
        this.peepPassword = peepPassword;}
    public String getPeepUsername() {
        return peepUsername;}
    public void setPeepUsername(String peepUsername) {
        this.peepUsername = peepUsername;}
    public String getPeepICPass() {
        return peepICPass;}
    public void setPeepICPass(String peepICPass) {
        this.peepICPass = peepICPass;}
    public String getPeepType() {
        return peepType;}
    public void setPeepType(String peepType) {
        this.peepType = peepType;}
    public String getPeepAppid() {
        return peepAppid;}
    public void setPeepAppid(String appid) {
        this.peepAppid = appid;}
    public String getPeepStatus() {
        return peepStatus;}
    public void setPeepStatus(String status) {
        this.peepStatus = status;}
    
    //-------Functions-------
    public String return_string(){ //return the participant data
        String peep_data =  peepID+","+
                            peepUsername+","+
                            peepPassword+","+
                            peepFullname+","+
                            peepDOB+","+
                            peepType+","+
                            peepICPass+","+
                            peepAppid+","+
                            peepStatus;
        return peep_data;
    }
    
    public boolean register_peep()
    {
        try{
            int lastID=0;
            String lines;
            try (BufferedReader reader = new BufferedReader(new FileReader("People.txt"))) {
                while ((lines=reader.readLine()) != null) {                      //auto increment ID
                    String [] data = lines.split(",");
                    lastID=Integer.parseInt(data[0]);
                }
                peepID=lastID+1;
            } catch (IOException e) {
                e.printStackTrace();
            }
            boolean noduplicate=true;
            String line;
            BufferedReader file = new BufferedReader(new FileReader("People.txt"));
            while ((line=file.readLine())!= null){
                String [] data = line.split(",");                                //validate username (must be unique)
                if(peepUsername.equals(data[1])){
                    JOptionPane.showMessageDialog(null,"Username already taken, Please re-enter username");
                    noduplicate=false;
                    break;
                }
            }
            if(noduplicate){
                try (PrintWriter regis = new PrintWriter(new BufferedWriter(new FileWriter("People.txt",true)))){
                    regis.append(peepID+","+peepUsername+","+peepPassword+","+peepFullname+","+peepDOB+","+peepType+","+peepICPass+","+"none"+","+"Non-Vaccinated"+"\n");
                    regis.close();
                    JOptionPane.showMessageDialog(null,"Register Successfully");
                    return true;
                } catch(IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Information, Please re-enter");
        }
        return false;
    }
    
    public String login_peep(){
        try{
            if (peepUsername.equals("Admin") && peepPassword.equals("Admin123")){  //for admin
                return "admin";      //so the system know it is the admin
            }
            else{
                String line;
                BufferedReader file = new BufferedReader(new FileReader("People.txt"));
                while ((line=file.readLine())!= null){
                    String [] data = line.split(",");                            //check data for the participant
                    if(peepUsername.equals(data[1]) && peepPassword.equals(data[2])){
                        return data[0];
                    }
                }
                return "false";
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return "false";
    }
}
