package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {
	
	private List<Player> players = new ArrayList<>();
	long id;
	String name;
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Player addPlayer(String playerName) {
		for (Player player : player) {
			if (player.getName().equalsIgnoreCase(playerName)) {
				System.out.println("Player name already exists: " + playerName);
				return null;
		}
	}
		
		public List<Player> getPlayers() {
			return players;
		}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
