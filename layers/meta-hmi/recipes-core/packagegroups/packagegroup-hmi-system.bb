SUMMARY = "HMI system packages"

LICENSE = "MIT"

PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    sway \
    swaybg \
    swayidle \
    swaylock \
    foot \
    grim \
    slurp \
    mc \
    nano \
    htop \
    x264 \
    x265 \
    rsync \
    ninja \
    v4l-utils \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \
    gst-devtools \
    gst-examples \
    gstreamer1.0-libav \
    gstreamer1.0-meta-base \
    gstreamer1.0-omx \
    gstreamer1.0-python \
    gstreamer1.0-rtsp-server \
    gstreamer1.0-vaapi \
    play-camera \
    mariadb-server \
    mariadb-client \
    curl \
    e2fsprogs-resize2fs \
    util-linux-sfdisk \
    expand-rootfs \
"
