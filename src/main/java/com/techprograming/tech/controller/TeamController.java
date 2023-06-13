package com.techprograming.tech.controller;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprograming.tech.entity.Team;
import com.techprograming.tech.service.TeamService;

@RestController
@RequestMapping("api/team")
public class TeamController {
	
	
	@Autowired TeamService  teamService;
	
	@Autowired Environment env;
	
	
	@GetMapping("/getTeams")
	public ResponseEntity<List<Team>> getTeamList(){
		
		List<Team> teamList = teamService.getTeamData();
		System.out.println(env.getProperty("port"));
		return ResponseEntity.accepted().body(teamList);
	}
	
	@GetMapping("/getTeams/{id}")
	public ResponseEntity<Team> getSinglePlayer(@PathVariable(value = "id") int id ){
		
		Team singlePlayerData = teamService.getSinglePlayerData(id);
		System.out.println();
		System.out.println("port-----"+env.getProperty("server.port"));
        System.out.println("1997");
		return ResponseEntity.accepted().body(singlePlayerData);
	}
	
	
	@PostMapping("/saveteam")
	public ResponseEntity<Team> saveTeam(@RequestBody Team team) throws Exception{
		
		Team teamData = teamService.saveTeamData(team);
		
		return ResponseEntity.accepted().body(teamData);
	}
	

}
