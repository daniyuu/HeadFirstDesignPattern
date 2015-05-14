/**
 * 
 */
package iterator;

import java.util.ArrayList;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class PancakeHouseIterator implements Iterator {
	ArrayList items;
	int position = 0;
	/**
	 * 
	 */
	public PancakeHouseIterator(ArrayList items) {
		this.items = items;
	}

	/* (non-Javadoc)
	 * @see collection.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if(position >= items.size() || items.get(position) == null){
			return false;
		}else{
			return true;
		}
	}

	/* (non-Javadoc)
	 * @see collection.Iterator#next()
	 */
	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem) items.get(position);
		position = position + 1;
		return menuItem;
	}

}
