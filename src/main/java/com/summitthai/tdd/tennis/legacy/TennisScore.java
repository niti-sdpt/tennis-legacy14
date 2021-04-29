package com.summitthai.tdd.tennis.legacy;

import java.util.Random;

public class TennisScore {

	public static void main(String[] args) {
		
		try {
			
			
		} finally {
			
		}
		
		
		

	}
	
	public static String playGame() {
		
		Random rn        = null;
		int    playerA   = 0;
		int    playerB   = 0;
		
		try {
				rn      = new Random();
				playerA = rn.nextInt(10) + 1;
				playerB = rn.nextInt(10) + 1;
				
				if (playerA > playerB) {
					return "A";
				} else if (playerB > playerA) {
					return "B";
				} else {
					playerA = rn.nextInt(1000) + 1;
					playerB = rn.nextInt(1000) + 1;
					
					if (playerA > playerB) {
						return "A";
					} else {
						return "B";
					}
				}
				
		} finally {
			rn        = null;
			playerA   = 0;
			playerB   = 0;
			
		}
	}
	
	public static void callScore(final int playerAScore,
			                     final int playerBScore) {
		try {
			if (playerAScore == 0 && playerBScore == 0) {
				System.out.println("Love - Love!");
			} else if (playerAScore >= 40  
					&& (playerAScore - playerBScore == 10)) {
				System.out.println("Advantage for player A");
			} else if (playerBScore >= 40  
					&& (playerBScore - playerAScore == 10)) {
				System.out.println("Advantage for player B");
			} else if (playerBScore == 40 && playerAScore == 40) {
				System.out.println("Dueue");
			} else {
				System.out.println(getPointName(playerAScore).
						           concat(" - ").
						           concat(getPointName(playerBScore)));
			}
			
		} finally {
			
		}
	}
		
		public static String getPointName(int point) {
			
			if (point == 0) {
				return "Love";
			} else if (point == 15) {
				return "Fifteen";
			} else if (point == 30) {
				return "Thirty";
			} else if (point == 40) {
				return "Forty";
			} else {
				return "I don't know";
			}
		}

}
