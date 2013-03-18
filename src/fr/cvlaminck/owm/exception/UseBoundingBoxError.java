package fr.cvlaminck.owm.exception;

public class UseBoundingBoxError extends Error {

	private static final long serialVersionUID = -2795892535391404459L;
	
	public UseBoundingBoxError()
	{
		super("You have already set bouding box property, you cannot set this property too.");
	}

}
