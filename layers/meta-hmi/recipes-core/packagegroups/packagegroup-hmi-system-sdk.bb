SUMMARY = "HMI system SDK development packages"

LICENSE = "MIT"

inherit packagegroup

PACKAGE_ARCH = ""

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

RDEPENDS:${PN} = " \
    libmysqlclient-dev \
    mariadb-dev \
    \
    gstreamer1.0-dev \
    gstreamer1.0-plugins-base-dev \
    gstreamer1.0-plugins-good-dev \
    gstreamer1.0-plugins-bad-dev \
    gstreamer1.0-plugins-ugly-dev \
    gstreamer1.0-libav-dev \
    \
    libx264-dev \
    libx265-dev \
"