/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author daksh
 */
// This is branched
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Choose your favorite genre:");
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        
        if (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid genre choice.");
            return;
        }

        
        String chosenGenre = genres[genreChoice - 1];
        UserProfile userProfile = new UserProfile(name, chosenGenre);

        
        System.out.println("User profile created successfully for " + name + " with favorite genre: " + chosenGenre);
    }
}

