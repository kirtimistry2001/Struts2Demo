package ca.kirti.actions;

import ca.kirti.service.TutorialFinderService;

public class TutorialAction {
	private String bestTutoriasSites;
	private String language;
	
	public String execute() {
		System.out.println("Hello! from Tutorial Action");
		//call business service method
		TutorialFinderService tutorialFinderService =
				new TutorialFinderService();
		//access input variable which we are getting from jsp
		//it uses the setter method of member variable (language)
		// it can be passed like 
		//http://localhost:8080/Struts2Demo/tutorials/getTutorial.action?language=dotnet
		System.out.println("I received input from jsp:"+language);
		setBestTutoriasSites(tutorialFinderService.getBestTutorialSite(language));
		System.out.println(bestTutoriasSites);
		return "success";
	}
	// this getter is used in front end by jsp file using struts-tag
	//1st you must include : <%@ taglib prefix="s" uri="/struts-tags" %>
	//2nd use it : <s:property value="bestTutoriasSites"/>
	public String getBestTutoriasSites() {
		return bestTutoriasSites;
	}
	public void setBestTutoriasSites(String bestTutoriasSites) {
		this.bestTutoriasSites = bestTutoriasSites;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

}
