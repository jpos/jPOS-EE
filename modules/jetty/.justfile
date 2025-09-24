run:
    gradle clean iA && q2 -Dorg.slf4j.simpleLogger.log.org.eclipse.jetty.server=debug -Dorg.slf4j.simpleLogger.log.org.eclipse.jetty.deploy=info


curl:
     curl http://localhost:8080/index.html
