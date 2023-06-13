package com.techprograming.tech.service;

import java.util.List;

import com.techprograming.tech.entity.Team;

public interface TeamService {

	public List<Team> getTeamData();
	
	public Team getSinglePlayerData(int id);
	
	public Team saveTeamData(Team team) throws Exception;
}
