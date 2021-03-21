package com.tinnova.votes;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VotesApplication {

	public static void main(String[] args) {
		//Creates an object with the votes info. Based on instructions:
		VotesCounts votesCounts = VotesCounts.builder()
				.valids(800)
				.whites(150)
				.nulls(50)
				.build();

		//Calculate the percentages and print then.
		VotesPercentageService service = new VotesPercentageService();
		System.out.println("Valid votes: " + service.calcValidsPercentage(votesCounts) + "%");
		System.out.println("White votes: " + service.calcWhitesPercentage(votesCounts) + "%");
		System.out.println("Null votes: " + service.calcNullsPercentage(votesCounts) + "%");
	}

}
