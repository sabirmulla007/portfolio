package JavaBasics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class JoinThreads {
	static void printPascal(int n)
	{
	for (int line = 0; line < n; line++)
	{
	for (int i = 0; i <= line; i++)
		System.out.print(pattern(line, i)+" ");
	System.out.println();
	}
	}
	static int pattern(int n, int k)
	{
	int res = 1; 
	if (k > n - k) k = n - k;
	for (int i = 0; i < k; ++i)
	{
	res *= (n - i);
	res /= (i + 1);
	}
	return res;
	}
	public static void main(String args[])
	{
	int n = 7; printPascal(n);
	}
	}