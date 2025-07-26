@echo off
cd /d F:\JAVA
git add .
git commit -m "Auto commit on %date% at %time%"
git push origin main
pause
