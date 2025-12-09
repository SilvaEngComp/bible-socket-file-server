#!/usr/bin/env sh

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

# Attempt to set APP_HOME
APP_HOME=`dirname "$0"`
APP_HOME=`cd "$APP_HOME" && pwd`

# Locate gradle-wrapper.jar
WRAPPER_JAR="$APP_HOME/gradle/wrapper/gradle-wrapper.jar"
if [ ! -f "$WRAPPER_JAR" ]; then
  echo "Gradle Wrapper JAR not found!"
  exit 1
fi

# Locate Java
if [ -n "$JAVA_HOME" ]; then
  JAVA_EXE="$JAVA_HOME/bin/java"
else
  JAVA_EXE="java"
fi

exec "$JAVA_EXE" -Dorg.gradle.appname="$APP_HOME" -classpath "$WRAPPER_JAR" org.gradle.wrapper.GradleWrapperMain "$@"

