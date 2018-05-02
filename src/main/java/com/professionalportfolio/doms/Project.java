package com.professionalportfolio.doms;
public class Project {
	private String name;
	private String description;
	private String technologies;
	private String appUrl;
	private String githubUrl;
	
	public Project(){
	}
	
	public Project(String name, String description, String technologies, String appUrl, String githubUrl){
		this.name = name;
		this.description = description;
		this.technologies = technologies;
		this.appUrl = appUrl;
		this.githubUrl = githubUrl;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getTechnologies(){
		return technologies;
	}
	
	public void setTechnologies(String technologies){
		this.technologies = technologies;
	}
	
	public String getAppUrl(){
		return appUrl;
	}
	
	public void setAppUrl(String appUrl){
		this.appUrl = appUrl;
	}
	
	public String getGithubUrl(){
		return githubUrl;
	}
	
	public void setGithubUrl(String githubUrl){
		this.githubUrl = githubUrl;
	}
}
