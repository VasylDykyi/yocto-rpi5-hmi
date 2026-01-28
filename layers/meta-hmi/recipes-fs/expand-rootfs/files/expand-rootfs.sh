#!/bin/bash

echo ",+" | sfdisk -N 2 /dev/mmcblk0

sleep 2

systemctl disable expand-rootfs.service