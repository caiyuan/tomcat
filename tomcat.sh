#!/usr/bin/env bash

TOMCAT_HOME="$(pwd)/output/build"
WORK_PATH="$(pwd)/work"

###
export JAVA_OPTS="-Xms128m -Xmx1024m"
export CATALINA_HOME="$TOMCAT_HOME"
export CATALINA_BASE="$WORK_PATH"

###
if [ ! -d "$CATALINA_BASE" ]; then
  #
  mkdir -p "$CATALINA_BASE/logs" "$CATALINA_BASE/webapps/ROOT"
  cp -r "$CATALINA_HOME/conf" "$CATALINA_BASE"
  #
  echo "Welcome !" > "$CATALINA_BASE/webapps/ROOT/index.html"
fi

###
case $1 in
start)
  "$CATALINA_HOME/bin/catalina.sh" start
  echo 'start done !'
  ;;
stop)
  "$CATALINA_HOME/bin/catalina.sh" stop
  echo 'stop done !'
  ;;
restart)
  "$CATALINA_HOME/bin/catalina.sh" stop
  sleep 3s
  "$CATALINA_HOME/bin/catalina.sh" start
  echo 'restart done !'
  ;;
configtest)
  "$CATALINA_HOME/bin/catalina.sh" configtest
  ;;
version)
  "$CATALINA_HOME/bin/catalina.sh" version
  ;;
*)
  # "$CATALINA_HOME/bin/catalina.sh" "$@"
  ;;
esac

exit 0
