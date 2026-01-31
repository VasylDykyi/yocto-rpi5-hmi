SUMMARY = "HMI system SDK development packages"

LICENSE = "MIT"

PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

# PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

RDEPENDS:${PN} = " \
    libmysqlclient-dev \
    mariadb \
    \
    gstreamer1.0-dev \
    gstreamer1.0-plugins-base-dev \
    gstreamer1.0-plugins-good-dev \
    gstreamer1.0-plugins-bad-dev \
    gstreamer1.0-plugins-ugly-dev \
    gstreamer1.0-libav-dev \
    \
    x264-dev \
    x265-dev \
	\
	curlpp-dev \
"