package com.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue
	private int playerid;
	private String  playername;
	private String teamname;
	private int age;
	
	public Player() {
		
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Player(int playerid, String playername, String teamname, int age) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.teamname = teamname;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", teamname=" + teamname + ", age=" + age
				+ "]";
	}

}
