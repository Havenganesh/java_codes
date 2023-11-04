package genericsDemo;

public class NumbersOperation<T> {
	void getType(T a) {
		System.out.println(a.getClass());
	}
}
