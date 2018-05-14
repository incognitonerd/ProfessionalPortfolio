package com.professionalportfolio.doms;
public class Endpoint {
	private String url;
	private String description;
	private String query;
	private String name;
	
	public Endpoint(){
	}
	
	public Endpoint(String url, String description, String query, String name){
		this.url = url;
		this.description = description;
		this.query = query;
		this.name = name;
	}
	
	public String getUrl(){
		return url;
	}
	
	public void setUrl(String url){
		this.url = url;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getQuery(){
		return query;
	}
	
	public void setQuery(String query){
		this.query = query;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
