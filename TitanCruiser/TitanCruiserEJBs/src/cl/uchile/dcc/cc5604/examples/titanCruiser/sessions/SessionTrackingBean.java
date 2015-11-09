package cl.uchile.dcc.cc5604.examples.titanCruiser.sessions;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Remote(SessionTracking.class)
@Local(SessionTrackingLocal.class)
@Singleton(name = "SessionTracking")
@Startup
public class SessionTrackingBean implements SessionTracking, SessionTrackingLocal {

    private static final Logger logger = Logger.getLogger(SessionTracking.class.getName());

    private List<String> sessions = new ArrayList<String>();

    @Lock(LockType.WRITE)
    public void trackSession(String sessionID) {
        sessions.add(sessionID);
    }

    @Lock(LockType.READ)
    public int activeSessions() {
        return sessions.size();
    }

    @PostConstruct
    private void startingLogging() {
        logger.log(Level.INFO, "Starting to track sessions tracked.");
    }

    @PreDestroy
    private void stoppingLogging() {
        logger.log(Level.INFO, "Stopping to track sessions tracked.");
    }

    @Schedule(minute = "*")
    private void logSummery() {
        logger.log(Level.INFO, "There are " + activeSessions() + " sessions active now.");
    }
}
