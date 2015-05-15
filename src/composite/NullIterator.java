/**
 * 
 */
package composite;

import java.util.Iterator;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class NullIterator implements Iterator {

	/**
	 * 
	 */
	public NullIterator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

}
