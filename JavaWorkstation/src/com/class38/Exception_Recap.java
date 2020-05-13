package com.class38;

public class Exception_Recap {

/* 
 * exception - 
 *  2 types: checked = exception that is being checked by compiler and must be handled 
 *  		 unchecked = exception that is not being checked by the compiler
 *  ALL EXCEPTION OCCUR ONLY AT THE RUN TIME
 *  
 *  Exception handling keywords/block
 *  
 * try - block of code that might throw an exception
 * catch - block that catches an object of the matching exception
 * 
 * 
 * 
 * finally (keyword) - Block of code that is associated with try block and it will
 * 		always execute whether E occur or not.
 * 		Usually we put "clean up" inside finally block
 * example
 * 	}finally{
 * 		close DataBase connection;
 * }
 *  
 *  We can have multiple catch block associated with 1 try, but only can have
 *  1 finally block.
 *  
 *  
 * throws (keyword) - handles responsibility of handling Exception responsibility to the caller.
 * 	It will pass it on to someone else (the person trying to call the method etc.)
 *  Delegates responsibility to handle exception to the caller/method that calls
 *  Compiler will give you 2 options when checked Exception:
 *  1. use try & catch - handle the exception
 *  2. throws - do not handle it now and pass it to whoever calls that method
 * 
 * throw (keyword) - is a keyword used to throw the actual exception
 *  It is actually throwing that exception object
 * 	example
 * 	throw new ExceptionName("Enter custom message");
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	
 */

}
