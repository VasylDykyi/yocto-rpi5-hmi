SUMMARY = "Meta package for building an installable Qt6 toolchain and SDK for HMI"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SDK_NAME = "hmi-sdk-qt6"
SDK_VERSION = "1.0"
SDK_TITLE = "HMI Qt6 SDK"

inherit populate_sdk populate_sdk_qt6_hmi
