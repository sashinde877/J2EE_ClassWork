package com.jspiders.musicplayer.operations;
import java.util.Iterator;
import java.util.Scanner;

import com.jspiders.musicplayer.musicpl.MusicPlayer;
import com.jspiders.musicplayer.song.Song;

public class Musicoperations implements MusicOperation{
	
	MusicPlayer m = new MusicPlayer();
	Scanner sc = new Scanner(System.in);  
	@Override
	public void playAll() {
		System.out.println(MusicPlayer.sg.get(0) + " is now playing...");
		for(int i=1; i<MusicPlayer.sg.size(); i++) {
			System.out.println(MusicPlayer.sg.get(i) + ", in queue");
		}
		MusicPlayer.switchchoice();
	}

	@Override
	public void playRandom() {
		int ri = (int) (Math.random() * MusicPlayer.sg.size());
		System.out.println("Random song is playing.." + MusicPlayer.sg.get(ri));
		MusicPlayer.switchchoice();
	}

	@Override
	public void chooseSong() {
		System.out.println(MusicPlayer.sg);
//		System.out.println("Enter Song No.: ");
//		int st = sc.nextInt();
//		for(int i =0; i<m.sg.size(); i++) {
//			if(st == MusicPlayer.sg.get(i).getId()) {
//				System.out.println(MusicPlayer.sg.get(i).getSongName() + " is now playing");
//			}
//		}
		System.out.println("Enter Song Name: ");
		String sr = sc.nextLine();
		int i =0;
		while(i<MusicPlayer.sg.size()) {
			if(MusicPlayer.sg.get(i).getSongName().equals(sr) == true) {
				System.out.println(MusicPlayer.sg.get(i).getSongName() + " is now playing...");
				break;
			}
			i++;
		}
		System.out.println(i);
		MusicPlayer.switchchoice();
		
	}

	@Override
	public void addSong() {
	    System.out.println("Enter Id");
		int i = sc.nextInt();
		System.out.println("Enter Song Name: "); 
		String s = sc.nextLine();
		System.out.println("Enter Song Duration: ");
		String d = sc.nextLine();
		System.out.println("Enter Song Singer Name: ");
		String n = sc.nextLine();
		MusicPlayer.sg.add(new Song(i,s,d,n));
		System.out.println("Song is Added ");
		Iterator<Song> z = MusicPlayer.sg.iterator();
		while(z.hasNext()) {
			int x =1;
		     System.out.println(x + " " + " " + z.next());
		     x++;
	    }
		MusicPlayer.switchchoice();
	}

	@Override
	public void removeSong(String st) {
		for(int i=0; i<MusicPlayer.sg.size(); i++) {
			if(MusicPlayer.sg.get(i).getSongName().equals(st)) {
				MusicPlayer.sg.remove(i);
				i--;
			}
		}
		System.out.println(MusicPlayer.sg);
		MusicPlayer.switchchoice();
		
	}

	@Override
	public void editSong() {
		System.out.println("Select Options");
		System.out.println("1.Edit Song Name \n2.Edit Artist Name \n3.Go Back");
		int n = sc.nextInt();
		switch(n) {
		case 1: for(Song i: MusicPlayer.sg) {
			System.out.println(i);
			}
		System.out.print("Enter Song Name You Want to Edit : ");
		String m = sc.nextLine();
		for(int x = 0; x<MusicPlayer.sg.size(); x++) {
			if(MusicPlayer.sg.get(x).getSongName().equals(m)) {
				System.out.print("Enter Song Name to Rename: ");
				String sr = sc.nextLine();
				MusicPlayer.sg.get(x).setSongName(sr);
    	        System.out.println(MusicPlayer.sg.get(x));
    	        }
			}
		MusicPlayer.switchchoice();
//			    break;
		case 2: for(Song i: MusicPlayer.sg) {
					System.out.println(i);
				}
				System.out.print("Enter Artist Name: ");
				String s1 = sc.nextLine();
				for(int x = 0; x<MusicPlayer.sg.size(); x++) {
					if(MusicPlayer.sg.get(x).getArtist().equals(s1)) {
	    		System.out.print("Enter Artist Name Rename: ");
	    		String sr = sc.nextLine();
	    	    MusicPlayer.sg.get(x).setArtist(sr);
	    	    System.out.println(MusicPlayer.sg.get(x));
					}
				}
		case 3: MusicPlayer.switchchoice();
		}
		
	}
	public void editName() {
		
//		MusicPlayer.switchchoice();
		}
}
