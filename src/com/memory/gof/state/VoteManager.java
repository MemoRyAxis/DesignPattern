package com.memory.gof.state;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/9/2 10:09
 */
public class VoteManager {

    Map<String, Integer> voteCount = new HashMap<String, Integer>();

    public void vote() {
        // logic
    }
}

class VoteTest {

    public static void main(String[] args) {
        VoteManager manager = new VoteManager();
        manager.vote();
    }
}