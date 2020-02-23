package util;

/**
 * @(#)CCelula.java
 *
 *
 * @author Rodrigo Richard Gomes
 * @coauthor Arthur Gramiscelli Branco
 * @version 2.00 2020/2/23
 */

public class CCelula {
	public Object item;
	public CCelula prox;    	
    public CCelula(Object valorItem, CCelula proxCelula)
    {
        item = valorItem;
        prox = proxCelula;
    }    			
    public CCelula(Object valorItem)
    {
        item = valorItem;
        prox = null;
    }    			        	
    public CCelula()
    {
    	item = null;
        prox = null;
    }    			        	
}