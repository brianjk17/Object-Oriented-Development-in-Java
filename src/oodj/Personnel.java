/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Brian
 */
public class Personnel extends User{
    
    //functions
    public ArrayList<String> search_peep_byID(int id){              //will return the full data of that id
        File file = new File("People.txt");
        try{
            String data;
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            People person;
            while ((data=br.readLine())!= null){
                person = new People(data);                                  //creates the people object
                if(id==person.getPeepID()){                                 //checks if the id is the one looking for
                    ArrayList<String> peep_data= new ArrayList<>();         //returns the searched person
                    peep_data.add(data);
                    br.close();
                    return peep_data;
                }
            }
        } catch (IOException ioe){
            //ioe.printStackTrace();
            System.out.println("Login Failed");
        } return null;                                //if not found will return null
    }
    
    public ArrayList<String> search_peep_byName(String name){              //will return the full data of that id
        File file = new File("People.txt");
        try{
            String data;
            BufferedReader br = new BufferedReader(new FileReader(file));
            People person;
            ArrayList<String> peep_data= new ArrayList<>();                 //to store the searched person
            while ((data=br.readLine())!= null){
                person = new People(data);                                  //creates the people object
                if(person.getPeepFullname().toLowerCase().contains(name.toLowerCase())){ //checks if the name is the one looking for
                    peep_data.add(data);
                }
            }
            br.close();
            if (peep_data.isEmpty()){
                return null;
            }
            return peep_data;
        }
        catch (IOException ioe){
            System.out.println("File not found");
        }
        return null;                                //if not found will return null
    }
    
    public ArrayList<String> view_all_peep(){        //should return the array which contains all the people
        File participant_file = new File("People.txt");
        try(FileReader fr = new FileReader(participant_file)){
                //Search for the data changed in the array list
                BufferedReader br = new BufferedReader(fr);
                String data;
                ArrayList<String> peoples_data = new ArrayList<>();
                if((data=br.readLine())!=null){
                    peoples_data.add(data);
                    while ((data=br.readLine())!=null){
                        peoples_data.add(data);
                    }
                    br.close();
                    return peoples_data;
                }
                br.close();
                return null;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;    //means no data
    }
    
    public String[] search_onePeep_byID(int id){              //will return the full data of that id
        File file = new File("People.txt");
        try{
            String data;
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            People person;
            while ((data=br.readLine())!= null){
                person = new People(data);                                  //creates the people object
                if(id==person.getPeepID()){                                 //checks if the id is the one looking for
                    String[] data_array=data.split(",");//returns the searched person
                    br.close();
                    return data_array;
                }
            }
        } catch (IOException ioe){
            System.out.println("File not found");
        } return null;                                //if not found will return null
    }
}
