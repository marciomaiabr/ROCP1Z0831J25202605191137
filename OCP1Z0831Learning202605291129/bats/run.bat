
cd C:\Users\Administrador\git\ROCP1Z0831J25202605191137\OCP1Z0831Learning

cls

rmdir bin /s /q

mkdir bin

javac -d bin src/*.java src/pkgs/pkgExes/*.java

java -p bin -m mnOCP1Z0831Learning/pkgs.pkgExes.Exe001

pause
