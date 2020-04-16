set currpath=.\
if "%OS%" == "Windows_NT" set currpath=%~dp0%

set src=%currpath%src
set dest=%currpath%classes
set classpath=%dest%

javac  -sourcepath %src%  -d %dest% %src%\*.java
javac  -sourcepath %src%  -d %dest% %src%\hgs\angel\Monkey.java
javac  -sourcepath %src%  -d %dest% %src%\hgs\main\AppMain.java
javac  -sourcepath %src%  -d %dest% %src%\mypack1\Food.java
javac  -sourcepath %src%  -d %dest% %src%\mypack2\Pig.java

java -classpath %classpath% hgs.main.AppMain
java -classpath %classpath% mypack2.Pig

