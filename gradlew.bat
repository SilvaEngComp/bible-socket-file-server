@echo off
%JAVA_EXE% -Dorg.gradle.appname=%DIR% -classpath %WRAPPER_JAR% org.gradle.wrapper.GradleWrapperMain %*
if defined JAVA_HOME set JAVA_EXE=%JAVA_HOME%\bin\java
set JAVA_EXE=java
)
  exit /b 1
  echo Gradle Wrapper JAR not found!
) else (
  set WRAPPER_JAR=%DIR%gradle\wrapper\gradle-wrapper.jar
if exist "%DIR%gradle\wrapper\gradle-wrapper.jar" (
set DIR=%~dp0
setlocal

