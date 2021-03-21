package com.tinnova.votes;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VotesCounts {
    private int valids;
    private int whites;
    private int nulls;
    public int getTotalVoters(){
        return valids+whites+nulls;
    }

}
