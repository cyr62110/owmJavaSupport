package fr.cvlaminck.owm.exception;

public class UseCityNameError extends Error {

	private static final long serialVersionUID = 3632587759957462791L;

	public UseCityNameError()
	{
		super("You have already set city name, you cannot set this property too.");
	}
	
}
