package lab4;

/**
 * This class implements a simple soccer team
 * 
 */
public class SoccerTeam {

	

	/**
	 * This is the default constructors. At most 11 player can play in this team. At
	 * most there are 4 roles players can have.
	 */
	private SoccerTeam() {
		
	}

	/**
	 * This is the overloaded constructor for this class
	 * 
	 * @param player is an array containing all the players who entered the team.
	 * @param coach  is the coach that trains the team's players.
	 */

	private SoccerTeam(Player[] player, Coach coach) {
		

	}

	/**
	 * This is the copy constructor for this class
	 * 
	 * @param team is an object of SoccerTeam, whose component is deeply copied into
	 *             the component of this object.
	 */
	private SoccerTeam(SoccerTeam team) {
		

	}

	/**
	 * This is a static factory method
	 */
	public static SoccerTeam getInstance() {
		return new SoccerTeam(new Player[11], Coach.getInstance());
    }
		
	

	/**
	 * This is a static factory method
	 * 
	 * @param player is an array that contains players.
	 * @param coach  is a coach of the team
	 */
	public static SoccerTeam getInstance(Player[] player, Coach coach) {
		return new SoccerTeam(player, coach);
	}

	/**
	 * This is a static factory method
	 * 
	 * @param team is an object of SoccerTeam
	 */
	public static SoccerTeam getInstance(SoccerTeam team) {
		return new SoccerTeam(team);
	}

	/**
	 * This is the getter method for the player list.
	 */
	public void getPlayers() {
	
	}

	/**
	 * This is the getter method for the coach attribute.
	 */

	public void getCoach() {
		
	}

	/**
	 * This is the setter method for the player attribute, which deeply copies the
	 * input parameter into the player attribute of this object.
	 * 
	 * @param player is an array of Player, whose elements are copied in the player
	 *               attribute of this object.
	 */

	public void setPlayers(Player[] player) {
	
	}

	/**
	 * This is the setter method for the coach attribute, which deeply copies the
	 * input parameter into the coach attribute of this object.
	 * 
	 * @param coach is an object of Coach, whose attributes are copied in the coach
	 *              attribute of this object.
	 */
	public void setCoach(Coach coach) {
		
		
		
	}

}

/**
 * 
 * This class represent each player required to play in this team. A player has
 * a number, a name, and a role. A role can be either defense, central, striker,
 * or goal keeper. these roles can be represented by the characters 'd', 'c',
 * 's', or 'g'
 *
 */
class Player {


	
	
	/**
	 * This is the overloaded constructor for this class
	 * Constructs a new Player instance with the specified attributes.
	 *
	 * @param num  The jersey number of the player.
	 * @param name The name of the player.
	 * @param role The role of the player (use 'D' for defense, 'C' for center, 'S' for striker, 'G' for goalkeeper).
	 */
	private Player(int num, String name, char role) {
	   
	}


	/**
	 * This is the copy constructor for this class
	 * Constructs a new Player instance by copying the attributes from an existing Player object.
	 *
	 * @param player The Player object from which to copy attributes.
	 */
	private Player(Player player) {
	
	}

	/**
	 * This is a static factory method.
	 */
	public static Player getInstance() {
		 return new Player(0, "", ' ');		
	}

	/**
	 * This is a static factory method
	 * 
	 * @param num  is the player number
	 * @param name is the name of player
	 * @param role is the role of the player in the team
	 */
	public static Player getInstance(int num, String name, char role) {
		return new Player(num,name,role);
	}

	/**
	 * This is a static factory method
	 * 
	 * @param player is an object of Player
	 * @return 
	 */
	public static Player getInstance(Player player) {
		return new Player(player);
		
	}

	/**
	 * This is the getter method for attribute name
	 */
	public void getName() {
		
	}

	/**
	 * This is the getter method for attribute role
	 */
	public void getRole() {
		
	}

	/**
	 * This is the setter method for attribute name
	 * 
	 * @param name is the value that is used to initialize name attribute
	 */
	public void setName(String name) {
		
	}

	/**
	 * This is the setter method for attribute role
	 * 
	 * @param role is a character to initialize attribute role.
	 */
	public void setRole(char role) {
		
	}

}

/**
 * This class represent the coach that trains the team's players. A coach has a
 * name, a number of years of experience, and a level of expertise. The level of
 * expertise can be represented by one of the strings: "high", "average", or
 * "beginner".
 */
class Coach {


	


		/**
		 * This is a static factory method
		 * 
		 * @param name     is the name of the coach.
		 * @param yearsExp is the number of years of experience as int.
		 * @param level    is a string that indicate the level of experience.
		 */
		public Coach(String name, int yearsExp, String level) {
		

		}

		/**
		 * This is a static factory method that initializes the attributes to their
		 * default values.
		 * 
		 * @return It returns an object of Coach
		 */
		
	
	
		public static Coach getInstance() {
			return new Coach("", 0, "");
			
		}

		/**
		 * This is a static factory method
		 * 
		 * @param name     is the name of the coach.
		 * @param yearsExp is the number of years of experience as int.
		 * @param level    is a string that indicate the level of experience.
		 * @return it returns a Coach object.
		 */
		public static Coach getInstance(String name, int yearsExp, String level) {
			return new Coach(name, yearsExp, level);
		}

		/**
		 * This is the copy constructor.
		 * 
		 * @param coach is an object of Coach that is used to initialize this object.
		 */
		private Coach(Coach coach) {
			

		}

		/**
		 * Constructs a new Coach instance by copying the attributes from an existing
		 * Coach object.
		 * 
		 * @param coach The Coach object from which to copy attributes.
		 * @return a new Coach instance by copying the attributes from an existing Coach
		 *         object
		 */
		public static Coach getInstance(Coach coach) {
			return new Coach("", 0, "");
			
		}

		/**
		 * Retrieves the name of the coach.
		 * 
		 * @return The name of the coach.
		 */
		public String getName() {
			return null;
		
		}

		/**
		 * Retrieves the number of years of coaching experience.
		 * 
		 * @return The number of years of coaching experience.
		 */
		public int getYearsExp() {
			return 0;
			
		}

		/**
		 * Retrieves the coaching level of the coach.
		 * 
		 * @return The coaching level of the coach
		 */
		public String getLevel() {
			return null;
			
		}

		/**
		 * Sets the name of the coach.
		 *
		 * @param name The new name for the coach.
		 */
		public void setName(String name) {
		   
		}

		/**
		 * Sets the number of years of coaching experience for the coach.
		 *
		 * @param yearsExp The new number of years of coaching experience.
		 */
		public void setYearsExp(int yearsExp) {
		
		}

		/**
		 * Sets the coaching level of the coach.
		 *
		 * @param level The new coaching level for the coach ("beginner", "average", or "high").
		 */
		public void setLevel(String level) {
		  
		}

}
