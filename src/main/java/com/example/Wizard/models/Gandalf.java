package com.example.Wizard.models;

public class Gandalf implements WizardInterface {
	
	private OutfitInterface myOutfit;

    public Gandalf(OutfitInterface wizardOutfit) {
        myOutfit = wizardOutfit;
    }
	
	public String giveAdvice() { 
		return "A wizard is never late. Nor is he early; he arrives precisely when he means to.";
	}
	
    public String changeDress() {
        return this.myOutfit.whatIsMyColor();
    }
}