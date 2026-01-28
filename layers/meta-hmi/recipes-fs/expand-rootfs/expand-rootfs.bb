SUMMARY = "Expand rootfs on first boot"
SECTION = "fs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \ 
    file://expand-rootfs.sh \
    file://expand-rootfs.service \		
"

RDEPENDS:${PN} = "util-linux-sfdisk"

inherit systemd

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/expand-rootfs.service \
        ${D}${systemd_system_unitdir}/expand-rootfs.service

    install -d ${D}/root/scripts
    install -m 0755 ${WORKDIR}/expand-rootfs.sh \
        ${D}/root/scripts/expand-rootfs.sh
}

SYSTEMD_SERVICE:${PN} += "expand-rootfs.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

FILES:${PN} += "\
  /root \
  /root/scripts \
  /root/scripts/expand-rootfs.sh \
"

INSANE_SKIP:${PN} += "file-rdeps"
