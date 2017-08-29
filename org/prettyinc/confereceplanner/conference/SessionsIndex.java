package org.prettyinc.confereceplanner.conference;

public
enum SessionsIndex {
    DESIGN_THINKING("creative confidence"), XTREME_PROGRAMMING("xTreme Programming"), TDD("TDD");
    private String sessionName;
    SessionsIndex(String s) {
        sessionName = s;
    }
    public String getSessionName(){
        return sessionName;
    }
}
