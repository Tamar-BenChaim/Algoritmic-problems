package aaa;

import java.util.Arrays;
import java.util.Iterator;

public class polindrom {

	public static int polindrom(String str) {
		int mat [] []=new int[str.length()+1][str.length()+1];
		for (int i = 1; i < mat.length; i++) {
			mat[i][i] = 1;
		}
		for (int len = 1; len < mat.length; len++) {
			for (int i = 1; i < mat.length-len; i++) {
				int j = i + len;
				mat[i][j]=Math.max(mat[i][j-1], mat[i+1][j]);
				if(str.charAt(i-1) == str.charAt(j-1))
					mat[i][j] = Math.max(mat[i][j], mat[i+1][j-1]+2);
			}
		}
		for (int i = 0; i < mat.length; i++) 
		{
			System.out.println(Arrays.toString(mat[i]));
		}
		
		int i = 1;
		int j = mat.length-1;
		while(i>0 && j>0) 
		{
			if(mat[i][j-1] == mat[i][j])
			{
				j = j-1;
			}
			else if(mat[i+1][j] == mat[i][j]) 
			{
				System.out.print(str.charAt(j-1));
				i = i+1;
			}
			else if(mat[i+1][j-1]+2 == mat[i][j]) 
			{
				System.out.print(str.charAt(j-1));
				i = i+1;
				j = j-1;
			}			
			
		}
		System.out.println();
		return mat[1][mat.length-1];
	}
	
	
	public static void main(String[] args) {
		String str="srrtgrssgr";
		System.out.println(polindrom(str));

	}

}

