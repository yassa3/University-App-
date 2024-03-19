#!/bin/bash
d=$(date +"Y%m%d%H%M%S")
dumpname="dumpf_${d}.dmp"
expdp UNIVERSITY/787898 DIRECTORY=test dumpfile=${dumpname} logfile=logf.log schemas=UNIVERSITY
if [ $? -eq 0 ]; then
	echo BackUp Success >> logFile.log
else
	echo BackUp Failed >> logFile.log
fi
