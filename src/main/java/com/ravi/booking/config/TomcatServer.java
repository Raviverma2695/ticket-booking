package com.ravi.booking.config;

import org.apache.catalina.Context;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;

public class TomcatServer {
    private static final String ACCESS_LOG_FILE_NAME_SUFFIX = ".log";
    private static final String MAX_CONNECTIONS = "maxConnections";
    private static final String MAX_THREADS = "maxThreads";
    private static final String MIN_SPARE_THREADS = "minSpareThreads";
    public static void main(String[] args) throws Exception {

        String webappDirLocation = "src/main/webapp/";
        String appBase = ".";
        Tomcat tomcat = new Tomcat();

        //The port that we should run on can be set into an environment variable
        //Look for that variable and default to 8080 if it isn't there.
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            webPort = "9100";
        }

        tomcat.setPort(Integer.valueOf(webPort));
        tomcat.getHost().setAppBase(appBase);

        Context context = tomcat.addWebapp( "",appBase);

//        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
//        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());
//
//        // Declare an alternative location for your "WEB-INF/classes" dir
//        // Servlet 3.0 annotation will work
//        File additionWebInfClasses = new File("target/classes");
//        WebResourceRoot resources = new StandardRoot(ctx);
//        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes",
//                additionWebInfClasses.getAbsolutePath(), "/"));
//        ctx.setResources(resources);

        tomcat.getConnector().setAttribute(MAX_CONNECTIONS, 800);
        tomcat.getConnector().setAttribute(MAX_THREADS, 400);
        tomcat.getConnector().setAttribute(MIN_SPARE_THREADS, 50);
        tomcat.start();
        tomcat.getServer().await();
    }
}
