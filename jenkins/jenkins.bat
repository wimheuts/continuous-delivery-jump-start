call D:\Sandboxes\setant.bat
echo ========
echo Start Jenkins webclient in a few seconds at: http://localhost:8080/
echo ========
%java_home%\bin\java -jar jenkins.war --httpPort=9090
pause