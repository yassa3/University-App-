#!/bin/bash
thresold=50
usage=$(df -h | awk 'BEGIN{}{ if (NR==2) print $6}END{}'| sed 's/%/''/g')
if [ $usage -ge $thresold ]; then
	echo Disk Usage = $usage %, it exceeds the Average >> logfile.log
fi
