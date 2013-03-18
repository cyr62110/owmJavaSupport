package fr.cvlaminck.owm.exception;

public class UseIdError extends Error 
{
	private static final long serialVersionUID = -5898262793094257748L;

	public UseIdError()
	{
		super("You have already set an id, you cannot set this propertie too.");
	}
}
