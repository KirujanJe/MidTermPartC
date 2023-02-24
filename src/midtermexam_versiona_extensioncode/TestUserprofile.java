/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author kiruj
 */
public class TestUserprofile {
    public static void main(String[] args){
    
        System.out.println("Enter your name");
        UserProfile userID = nextln(Scanner in); //take input as name
        
        y = UserProfile.getGenre();
        System.out.println(y); // print array of genres availible
        System.out.println("Please pick your favourite Genre");
        UserProfile genre = nextln(Scanner in); //take input of string
        UserProfile.setGenre(genre); //set the genre
     
        System.out.println("Your User Profile has been created"); //final user alert message
 
    } // end of main method
}// end of class
