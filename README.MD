### this jenkins pipeline will 
presume that you have downloaded and started the tomcat server with no issues. 
Tomcat ready to receive deployments and enabling TEXT based and GUI based management interface.
1. git clone code
2. build *.war
3. deploy *.war to tomcat container


1.
docker-compose up -d

2.
http://localhost:8888

3.
set username password

4.
install default plugins

5.
jenkins-manager => install plugin "Deploy to Container Plugin"

6.
create jenkins job
also making Git and Maven installed

7.
create credentials for tomcat-role login

8,
build #6 job