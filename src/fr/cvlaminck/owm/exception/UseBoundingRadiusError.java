package fr.cvlaminck.owm.exception;

public class UseBoundingRadiusError extends Error 
{
	private static final long serialVersionUID = 927983390708651252L;

	public UseBoundingRadiusError()
	{
		super("You have already set bounding radius property, you cannot set this property too.");
	}
}
