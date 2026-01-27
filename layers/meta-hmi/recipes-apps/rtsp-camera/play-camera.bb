SUMMARY = "Play RTSP camera"
SECTION = "apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI = " \ 
    file://play_rtsp_stream.sh \
    file://play-camera.service \		
"

RDEPENDS:${PN} = "sway"

inherit systemd features_check

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/play-camera.service \
        ${D}${systemd_system_unitdir}/play-camera.service

    install -d ${D}/root/scripts
    install -m 0755 ${WORKDIR}/play_rtsp_stream.sh \
        ${D}/root/scripts/play_rtsp_stream.sh
}

SYSTEMD_SERVICE:${PN} += "play-camera.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

FILES:${PN} += "\
  /root \
  /root/scripts \
  /root/scripts/play_rtsp_stream.sh \
"

INSANE_SKIP:${PN} += "file-rdeps"
