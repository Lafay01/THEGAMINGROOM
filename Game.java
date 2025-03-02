package com.gamingroom;

import java.util.Array;
import jave.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {

private List<Team> teams = new ArrayList<>();
	
	private static
	long id;
	String name;
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
	}

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	public Team addTeam(String teamName) {
		for (Team team : team) {
			if (team.getName().equalsIgnoreCase(teamName)) {
				System.out.println("Name already exists: " + teamName);
				return null;
		}
	}
		
		//Create and add new team
		Team newTeam = new Team(teams.size() + 1, teamName);
		teams.add(newTeam);
		return newTeam;
	}
}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}
