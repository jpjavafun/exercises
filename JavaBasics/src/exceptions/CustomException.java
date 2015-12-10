/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author jpaisley
 */
public class CustomException extends Exception{
    
    
    private static final long serialVersionUID = 1997753363232807009L;

		public CustomException()
		{
		}

		public CustomException(String message)
		{
			super(message);
		}

		public CustomException(Throwable cause)
		{
			super(cause);
		}

		public CustomException(String message, Throwable cause)
		{
			super(message, cause);
		}

		public CustomException(String message, Throwable cause, 
                                           boolean enableSuppression, boolean writableStackTrace)
		{
			super(message, cause, enableSuppression, writableStackTrace);
		}

    
}
