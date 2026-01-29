#!/bin/bash

ROOTFS_DEVICE="/dev/mmcblk0"
ROOTFS_PARTITION_NUM=2
ROOTFS_PARTITION_DEV="${ROOTFS_DEVICE}p${ROOTFS_PARTITION_NUM}"
EXPAND_ROOFS_SERVICE="expand-rootfs.service"

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
MARKERS_DIR="${SCRIPT_DIR}/MARKERS"

EXPANDED_MARK="${MARKERS_DIR}/ROOTFS_IS_EXPANDED"
RESIZE_FS_MARK="${MARKERS_DIR}/NEED_TO_RESIZE_FS"

mkdir -p "${MARKERS_DIR}"

if [[ -f "$EXPANDED_MARK" ]]; then
    exit 0
fi

if [[ -f "$RESIZE_FS_MARK" ]]; then
    resize2fs "${ROOTFS_PARTITION_DEV}"
    systemctl disable "${EXPAND_ROOFS_SERVICE}"
    rm $RESIZE_FS_MARK
    DF_RES="$(df -h)"
    echo "${DF_RES}" > $EXPANDED_MARK
    sync
else
    echo ",+" | sfdisk -N "${ROOTFS_PARTITION_NUM}" "${ROOTFS_DEVICE}" --force
    sleep 1
    touch $RESIZE_FS_MARK
    reboot
fi
