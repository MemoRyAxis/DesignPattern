package com.memory.gof.cor;

import com.memory.gof.base.Level;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MemoRyAxis
 * @todo Request : the request will be execute from client
 * @date 2014/8/21 10:56
 */
public class Request {

    private Map header;
    private String body;

    public Request(String body) {
        header = new HashMap();
        header.put("level", Level.LEVEL00);
        this.body = body;
    }

    public void setRequestLevel(Level level) {
        header.put("level", level);
    }

    public Level getRequestLevel() {
        return (Level) this.header.get("level");
    }

    void execute() {
        System.out.println(this.getRequestLevel().getDisplayName() + " | " + this.body);
    }
}
