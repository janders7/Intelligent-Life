/**
 * 
 */
package game_classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import room_classes.Room;
import character_classes.Player;

/**
 * @author Alejandro Guzman
 *
 */
public class Game {

	private HashMap<String, String> usernamePasswordMap = new HashMap<>();
	private String username = "";
	private String password = "";

	/**
	 * 
	 */
	public Game() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public Game(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/**
	 * 
	 * @return
	 */
	public String saveGame() {
		File f = new File("game.txt");
		try {
			FileOutputStream output = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getHelp() {
		String help = "-----HELP MENU-----" + "\nEnter \'H\' for help"
				+ "\nEnter \'I\' for inventory" + "\nEnter \'M\' for map"
				+ "\nEnter \'S\' for player statistics"
				+ "\n-----HELP MENU-----";
		return help;
	}

	/**
	 * 
	 * @param r
	 * @return
	 */
	public String getMap(Room r) {
		return r.getDescription();
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	public String getInventory(Player p) {
		ArrayList<String> inventory = p.getInventory();
		String s = "Inventory: ";
		for (int i = 0; i < inventory.size(); i++) {
			s = s + inventory.get(i) + " ";
		}
		return s;
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	public String getStatistics(Player p) {
		return "Statistics: " + p.toString();
	}

	/**
	 * 
	 */
	public void existingUserLogin() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Opening existing account.\nEnter username: ");
		username = userInput.nextLine();

		// checks if the username exists
		if (checkIfUsernameExists(username) == true) {
			System.out.println("Enter password: ");
			password = userInput.nextLine();
			// check if password is correct for the key..
			if (isCorrectPassword(username, password) == true) {
				System.out.println("Correct password.");
				// enter saved game..
			} else {
				System.out.println("Incorrect password.");
			}

		} else {
			System.out
					.println("Account not found. Please try again or create new account."
							+ "\nTo create new account, enter 'new'. \nTo open an existing "
							+ "account, enter any other key.");
			String input = userInput.nextLine();
			if (input.equalsIgnoreCase("new")) {
				// calls the newUserLogin() method if 'new' is entered
				newUserLogin();
			} else {
				// else calls the existingUserLogin() method to try again
				existingUserLogin();
			}
		}
	}

	/**
	 * 
	 */
	public void newUserLogin() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Creating new account.\nEnter username: ");
		username = userInput.nextLine();

		// if username does not exist
		if (checkIfUsernameExists(username) == false) {
			System.out.println("Enter password: ");
			password = userInput.nextLine();
			// add username and password to map
			usernamePasswordMap.put(username, password);
			System.out.println("Account created successfully.");
			//System.out.println(usernamePasswordMap);
		} else {
			System.out
					.println("The username already exists. Please create another username "
							+ "or enter a saved username."
							+ "\nTo create new account, enter 'new'.\nTo open an existing "
							+ "account, enter any other key.");
			String input = userInput.nextLine();
			if (input.equalsIgnoreCase("new")) {
				// calls the newUserLogin() method if 'new' is entered
				newUserLogin();
			} else {
				// else calls the existingUserLogin() method to try again
				existingUserLogin();
			}
		}
	}

	/**
	 * 
	 * @param username
	 * @return
	 */
	// this is a helper method to break apart the new/existingUserLogin()
	// methods, it checks if the username already exists
	public boolean checkIfUsernameExists(String username) {
		boolean usernameExists;
		if (usernamePasswordMap.containsKey(username)) {
			usernameExists = true;
		} else {
			usernameExists = false;
		}
		return usernameExists;

	}

	/**
	 * 
	 * @param username
	 * @param userEnteredPassword
	 * @return
	 */
	public boolean isCorrectPassword(String username, String userEnteredPassword) {
		boolean isCorrectPassword = false;
		String usernamePasswordValue = usernamePasswordMap.get(username);
		if (userEnteredPassword.equals(usernamePasswordValue)) {
			isCorrectPassword = true;
		}
		return isCorrectPassword;
	}

	/**
	 * 
	 * @return
	 */
	public HashMap<String, String> getUsernamePasswordMap() {
		return usernamePasswordMap;
	}

	/**
	 * 
	 * @param usernamePasswordMap
	 */
	public void setUsernamePasswordMap(
			HashMap<String, String> usernamePasswordMap) {
		this.usernamePasswordMap = usernamePasswordMap;
	}

	/**
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
