package com.example.demo;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.RequestBody;


@Path("/apis")
public class Employees {

	@GET
	@Produces("application/json")
	public String[] getAllUsers() {
		String str[] = {"Babuvignesh", "Chandan"};
		return str;
	}
	
	@POST
	@Path("/user")
	@Consumes("application/json")
	@Produces("application/json")
	public User putAllUsers(@RequestBody  User u) {
	
		return u;
	}
	@DELETE
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public String deletebody(@PathParam("id") String userid) {
		
		return userid+" is deleted successfully";
	}
	
	@PUT
	@Path("/{id}")
	@Produces("application/json")
	public String update(@PathParam("id") String userid) {
		return userid+" is updated successfully";
	}
}


