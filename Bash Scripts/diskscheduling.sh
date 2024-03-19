#!/bin/bash
cpu_threshold=75
cpu_usage=$(wmic cpu get loadpercentage | awk 'BEGIN{}{if (NR==2) print $1}')
if [ $cpu_usage -gt $cpu_threshold ]; then
	echo Cpu Usage Perecnt = $cpu_usage %, it is high >> logfile.log
fi

ram_threshold=25
ram_available=$(Systeminfo | grep 'Available Physical Memory' | awk '{print $4}' | sed 's/,/''/g')
ram_total=$(Systeminfo | grep 'Total Physical Memory' | awk '{print $4}' | sed 's/,/''/g')
percent=$((ram_available * 100/ram_total))
usage_percent=$((100-percent))
if [ $percent -lt $ram_threshold ]; then
	echo Memory Usage Percent = $usage_percent %, it is above Average >> logfile.log
fi

disk_threshold=25
disk_usage_percent=$(df -h | awk 'BEGIN{}{ if (NR==2) print $6 }END{}' | sed 's/%//g')
disk_available_percent=$((100 - disk_usage_percent))
if [ $disk_available_percent -lt $disk_threshold ]; then
	echo Disk Usage Percent = $disk_usage_percent %, it is above Average >> logfile.log
fi
