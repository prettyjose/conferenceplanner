package org.prettyinc.confereceplanner.conference;

public class Conference{
    String confId,confName;
    SessionOrganiser org;
    public Conference(String confId, String confName){
        this.confId = confId;
        this.confName = confName;
        org=SessionOrganiser.getSessionOrg();
    }
    public void plan(int n){
        org.addSessions(n);
    }
}