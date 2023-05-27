package JavaBasics;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExample {

	private final String first, last;
	public HashCodeExample(String first, String last)
	{
	this.first = first;
	this.last = last;
	}
	public boolean equals(Object o)
	{
	if (!(o instanceof HashCodeExample ))
	return false;
	HashCodeExample n = (HashCodeExample)o;
	return n.first.equals(first) && n.last.equals(last);
	}
	public static void main(String[] args)
	{
	Set<HashCodeExample> s = new HashSet<HashCodeExample>();
	s.add(new HashCodeExample("Bijan", "Patel"));
	System.out.println(
	s.contains(new HashCodeExample("Bijan", "Patel")));
	System.out.println((new HashCodeExample("Bijan", "patil")).equals(new HashCodeExample("Bijan", "Patel")));
	}
	}