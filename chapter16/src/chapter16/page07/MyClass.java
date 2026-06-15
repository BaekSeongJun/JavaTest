package chapter16.page07;

//Object == T
public class MyClass<T> {
	private T t;

	public MyClass(T t)
	{
		this.t = t;
	}

	public T getT()
	{return t;}
	public void setT(T t)
	{this.t = t;}

}


