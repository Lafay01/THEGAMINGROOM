package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator

/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	// FIXME: Add missing pieces to turn this class a singleton 
	//Holds next team identifier
	private static long nextPlayerId = 1;
	
	//Holds next player identifier
	private static long nextTeamId = 1;
	
	private static GameService service = null;
	
	private GameService() {
	}
	
	public static GameService getInstance() {
		if (instance == null) {
			service = new GameService();
			System.out.println("New game service created.");
		}
		else {
			System.out.println("Game service already instantiated.");
		}
		
		return service;
	}


	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		// if found, simply return the existing instance
		Iterator<Game> gamesIterator = games.iterator();
		while (gamesIterator.hasNext()) {
			Game gameInstance = gamesIterator.next();
		if (gameInstance.getName().equalsIgnoreCase(name()) {
			return gameInstance;
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same id
		Iterator<Game> gamesIterator = games.iterator();
		while (gamesIterator.hasNext()) {
			Game gameInstance = gamesIterator.next();
			// if found, simply assign that instance to the local variable
			if (gameInstance.getId()== id) {
				game = gameOne;
				return gameInstance;
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// FIXME: Use iterator to look for existing game with same name
		Iterator<Game> gamesIterator = games.iterator();
		while (gamesIterator.hasNext()) {
			Game gameInstance = gamesIterator.next();
			if (gameInstance.getName().equalsIgnoreCase(name(3)) {
				game = gameInstance;
			}
		}
		// if found, simply assign that instance to the local variable

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
}
