/**
 * 
 */
package game_classes;

import item_classes.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

import room_classes.Room;
import character_classes.Player;

/**
 * class: Game2
 * 
 * course: ITEC 3150 Spring 2015
 * 
 * written: April 1, 2015
 * 
 * @author Alejandro Guzman
 * @version 1.0
 * 
 * 
 *          Contain the methods save, getHelp, getStats, getInventory, userLogin
 * 
 *
 */
public class Game2 {

	/**
	 * A string that tracks the username of the player.
	 */
	private String username;

	/**
	 * A hashset cotaining string that tracks all the usernames created.
	 */
	private HashSet<String> usernameSet = new HashSet<String>();

	/**
	 * Default constructor
	 */
	public Game2() {

	}

	/**
	 * Constructor that assigns a username
	 * 
	 * @param username
	 */
	public Game2(String username) {
		this.username = username;
	}

	/**
	 * saveGame Save the current game state in a binary file to recall at a
	 * later time.
	 * 
	 * @return
	 */
	public String saveGame() {
		String savedMessage = "";

		return savedMessage;
	}
	
	// loadGame loads a saved Game ready for playing.
	/**
	 * 
	 * @return 
	 */
	public String loadGame() {
		String loadMessage = "";
		File file = new File("");
		Scanner in = null;
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
		// load saved game
		
		in.close();
		return loadMessage;
	}

	/**
	 * getHelp Print a help menu description with all the available hot keys.
	 * 
	 * @return A string description of a help menu with all the available inputs
	 *         for the game.
	 */
	public String getHelp() {
		String help = "-----HELP MENU-----" + "\nEnter \'H\' for help"
				+ "\nEnter \'I\' for inventory" + "\nEnter \'M\' for map"
				+ "\nEnter \'S\' for player statistics"
				+ "\n-----HELP MENU-----";
		return help;
	}

	/**
	 * getMap
	 * 
	 * @param r
	 * @return A room description.
	 */
	public String getMap(Room r) {
		return r.getDescription();
	}

	/**
	 * getInvenotory Iterates through the inventory and prints each item.
	 * 
	 * @param p
	 * @return A string representation of the entire inventory.
	 */
	public String getInventory(Player p) {

		// Copy the player inventory and store it in a temporary inventory
		// variable.
		java.util.ArrayList<Item> inventory = p.getInventory();
		String s = "Inventory: ";

		// Iterate through the inventory and add all elements to the string.
		for (int i = 0; i < inventory.size(); i++) {
			s = s + inventory.get(i) + " ";
		}
		return s;
	}

	/**
	 * getStatistics Call the toString method in player.
	 * 
	 * @param p
	 * @return A string representation of the player statistics.
	 */
	public String getStatistics(Player p) {
		return "Statistics: " + p.toString();
	}

	/**
	 * userLogin Handle the logic to accept valid user input and prompt the
	 * player to either enter a previous save game or to create a new game.
	 * 
	 */
	public void userLogin() {

		// Temp variable for username.
		String tempUsername;

		// Store the user input.
		String userInput;

		// Create scanner called input.
		Scanner input = new Scanner(System.in);
		System.out.println("To sign into your account enter 'E'."
				+ "\nTo create a new account enter 'N'.");

		// Take user input and store in userInput.
		userInput = input.nextLine();

		// Handles the valid and invalid input by the user.
		while (true) {
			if (userInput.equalsIgnoreCase("E")) {
				System.out.println("Enter your username.");

				// Store user input in tempUsername.
				tempUsername = input.nextLine();

				// Check if the username already exists. If if does not then
				// prompt the user to enter another username.
				while (checkExistingUsername(tempUsername.toUpperCase()) == false) {
					System.out.println("Username " + tempUsername.toUpperCase()
							+ " does not exist.\nEnter your username.");
					tempUsername = input.nextLine();
				}
				System.out
						.println("Username entered successfully.\nEntering saved game.\nWelcome back "
								+ tempUsername.toUpperCase());
				// enter the saved game with the correct rooms, items,
				// inventory,player health and attack, monsters, print the
				// current
				// room and player statistics
				break;
			}
			if (userInput.equalsIgnoreCase("N")) {
				System.out.println("Create new username.");

				// Store user input in tempUsername.
				tempUsername = input.nextLine();

				// Check if the username already exists. If if does then
				// prompt the user to enter another username.
				while (checkExistingUsername(tempUsername.toUpperCase()) == true) {
					System.out.println("Username " + tempUsername.toUpperCase()
							+ " already exists.\nCreate new username.");
					tempUsername = input.nextLine();
				}
				// Add the username entered to the set.
				usernameSet.add(tempUsername.toUpperCase());
				// Sets the username equal to the tempUsername entered by the
				// user.
				username = tempUsername;
				System.out
						.println("Username "
								+ tempUsername.toUpperCase()
								+ " created successfully."
								+ "\nEntering new game.\n   ! WELCOME TO !\n! INTELLIGENT LIFE !");
				// Enter new game.
				Room newRoom = new Room(15, 15, 15, 15); // Note: Creating a new
															// Room and new
															// Playe rwill have
															// to be modified.
				Player newPlayer = new Player(username);
				break;
			} else {
				// Ask user to enter another input if the input is not N or E.
				System.out
						.println("Invalid input.\nTo sign into your account enter 'E'."
								+ "\nTo create a new account enter 'N'.");
				userInput = input.nextLine();
			}
		}
		input.close();
	}

	/**
	 * checkExistingUsername Check whether the user input username exists in the
	 * set already.
	 * 
	 * @param username
	 * @return A boolean indicating whether the username entered by the user
	 *         exists already.
	 */
	public boolean checkExistingUsername(String username) {
		boolean doesExist = false;

		// Iterates through the usernameSet and if it exists then sets boolean
		// to true
		for (String s : usernameSet) {
			if (s.equals(username)) {
				doesExist = true;
			}
		}
		return doesExist;
	}

	/**
	 * getUsername
	 * 
	 * @return The username.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * getUsernameSet
	 * 
	 * @return A HashSet<String> representation of the hash set that holds all
	 *         the usernames.
	 */
	public HashSet<String> getUsernameSet() {
		return usernameSet;
	}

}
