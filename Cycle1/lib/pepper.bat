::msg * " Welcome to Pepper, The Go-To To-Do command line interface for software engineers!"


echo %DATE%
echo %TIME%
set datetimef=%date:~-4%_%date:~3,2%_%date:~0,2%__%time:~0,2%_%time:~3,2%_%time:~6,2%
echo %datetimef%

timeout /t 10

cls
cd  "C:\Users\Myles\Pepper"
::Below is the line starts the .jar file
javac Pepper.java
java  Pepper.java