package ca.kirti.service;
//https://www.youtube.com/watch?v=cG7FNgD11iE&list=PLB7BB551126EDD5E0&index=10
public class TutorialFinderService {
	
	public String getBestTutorialSite(String language) {
		if (language != null) {
		if(language.equalsIgnoreCase("Java")){
			return "Java from webservice";
		}else if(language.equalsIgnoreCase("dotnet")){
			return "Dontnet from webservice";
		}
		}
		return "can't find any";
			
	}
}
