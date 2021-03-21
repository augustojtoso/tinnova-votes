package com.tinnova.votes;

import org.springframework.stereotype.Service;

@Service
public class VotesPercentageService {
    public int calcValidsPercentage(VotesCounts votesCounts){
        return 100*votesCounts.getValids()/votesCounts.getTotalVoters();
    }

    public int calcNullsPercentage(VotesCounts votesCounts){
        return 100*votesCounts.getNulls()/votesCounts.getTotalVoters();
    }

    public int calcWhitesPercentage(VotesCounts votesCounts){
        return 100*votesCounts.getWhites()/votesCounts.getTotalVoters();
    }
}
