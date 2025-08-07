package com.Rahul;

import com.Rahul.example.Artist;

public class Qone {

	public static void main(String[] args) {
		Artist a[]= new Artist[5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=new Artist();
			a[i].createNewArtist();
		}
		
		showArrayObject(a);
		findDuplicates(a);
		
	}
	
	public static void findDuplicates(Artist[] a1) 
	{
		boolean found=false;
		for(int i=0;i<a1.length;i++)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i].uniqueid.equalsIgnoreCase(a1[j].name))
				{
					System.out.println("Duplicate found : Artist= "+(i+1)+"and Artist = "+(j+1));
					found=false;
				}
			}
		}
		if(!found) {
			System.out.println("No duplicates found.");
		}
	}
	
	public static void  showArrayObject(Artist[] a1) {
		System.out.println("Showing Oject Array:");
		for(Artist a:a1)
		{
			a.showArtist();
		}
	}

}
