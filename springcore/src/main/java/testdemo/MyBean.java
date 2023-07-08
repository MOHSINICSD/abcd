package testdemo;

import org.springframework.stereotype.Component;

//@Component
public class MyBean {

	int data=100;

	@Override
	public String toString() {
		return "MyBean [data=" + data + "]";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
