#!/bin/bash

if [ -f "openapi.pid" ];
then
   PID=`cat "openapi.pid"`
   echo "Stopping system process pid:$PID"
   kill $PID
   rm -rf openapi.pid
else
   echo "File system.pid does not exist - nothing to stop"
fi
