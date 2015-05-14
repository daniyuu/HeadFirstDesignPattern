/**
 * 
 */
package iterator;

/**
 * @author daniyuu
 * @see 
 * @version 
 */
public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;

	/**
	 * 
	 */
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	/* (non-Javadoc)
	 * @see collection.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null){
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
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

}
