import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class NoNullArrayList<T> extends ArrayList<T> {
	public NoNullArrayList() {
		super();
	}
	public NoNullArrayList (int startingCapacity) {
		super(startingCapacity);
	}
	public boolean add(T value) {
		if (value == null) {
			throw new IllegalArgumentException("null is not a valid value");
		}
		super.add(value);
	return true;
	}
	public void add(int index, T value) {
		if (value == null) {
			throw new IllegalArgumentException("null is not a valid value");
		}
		super.add(index, value);
	}
	public T set(int index, T value) {
		if (value == null) {
			throw new IllegalArgumentException("null is not a valid value");
		}
		super.set(index, value);
		return value;
	}
}
