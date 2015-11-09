package cl.uchile.dcc.cc5604.examples.titanCruiser.sessions;

import sun.rmi.runtime.Log;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.logging.Level;
import java.util.logging.Logger;

@Singleton(name = "SessionLogging")
@Startup
@DependsOn("SessionTracking")
public class LoggerSessionBean {

    private static final Logger logger = Logger.getLogger(Log.class.getName());

    private SessionTrackingLocal sessionTracking;

    public void printSessionReport(){

    }

    @PostConstruct
    private void startingLogging(){
        logger.log(Level.INFO, "Starting to log sessions tracked.");
    }

    @PreDestroy
    private void stoppingLogging(){
        logger.log(Level.INFO, "Stopping to log sessions tracked.");
    }
}
