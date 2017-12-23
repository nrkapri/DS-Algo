package javaProj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class NSort implements Comparable<NSort>{
	int age;
	String name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NSort other = (NSort) obj;
		if (age != other.age)
			return false;
		return true;
	}







	public NSort(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}



	public static void main(String[] args) {

		List<NSort> arr=new ArrayList<NSort>();

		Random r= new Random();
		
		
		for(int i=0;i<100;i++)
		{
			int x=0;
			x=r.nextInt();
	//		System.out.println("\n new int:"+x);
			arr.add(new NSort(x,"nayan"));
		}



		



		Collections.sort(arr);
		

//System.out.println("array:"+arr.toString());
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ","+this.age;
	}








	@Override
	public int compareTo(NSort a) {
		// TODO Auto-generated method stub
		return (age < a.age? -1 : (age == a.age ? 0 : 1));
	}




}
