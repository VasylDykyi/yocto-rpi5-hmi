SUMMARY = "HMI system runtime package set"

LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

ALLOW_EMPTY:${PN} = "1"

RDEPENDS:${PN} = " \
    sway \
    swaybg \
    swayidle \
    swaylock \
    foot \
    grim \
    slurp \
    mc \
    htop \
    nano \
    htop \
    x264 \
    x265 \
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
    e2fsprogs \
    util-linux-sfdisk \
    expand-rootfs \
"
