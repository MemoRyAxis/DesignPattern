package com.memory.gof.strategy;

/**
 * @author MemoRyAxis
 * @todo Context : provide method to client and this method could choose a strategy for client
 * @date 2014/9/2 16:48
 */
public class JoblessCoder {

    public void huntForAJob(JobHunt jobHunt) {
        jobHunt.getSkill();
    }

    public static void main(String[] args) {
        JoblessCoder coder = new JoblessCoder();
        coder.huntForAJob(new IOSer());
        coder.huntForAJob(new Weber());
    }
}
