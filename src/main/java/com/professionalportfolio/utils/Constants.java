package com.professionalportfolio.utils;
public enum Constants{
	HOME_JSP_PATH("/WEB-INF/views/home.jsp"), //
	ENDPOINTS_JSP_PATH("/WEB-INF/views/availableEndpoints.jsp"), //
	LOCAL_PROPERTIES_FILE_("//Users//Argos//git//ProfessionalPortfolio//src//main//resources//application.properties"), //
	SERVER_PROPERTIES_FILE_(
			"//var//lib//jenkins//workspace//ProfessionalPortfolio//src//main//resources//application.properties"), //
	STRING_TESTER("randomStringForUnitTesting");
	//
	//
	//
	private final String string;
	
	private Constants(String string){
		this.string = string;
	}
	
	public String getStr(){
		return this.string;
	}
}