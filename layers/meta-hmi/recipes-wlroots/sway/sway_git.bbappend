FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

inherit systemd useradd

SRC_URI += "\ 
  file://sway.service \
  file://sway-autologin \
  file://config \
"

do_install:append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/sway.service \
        ${D}${systemd_system_unitdir}/sway.service

    install -d ${D}${sysconfdir}/pam.d
    install -m 0644 ${WORKDIR}/sway-autologin \
        ${D}${sysconfdir}/pam.d/sway-autologin

    install -d ${D}/home/sway/.config/sway
    install -m 0644 ${WORKDIR}/config \
        ${D}/home/sway/.config/sway/config
}

FILES:${PN} += "\
  /home \
  /home/sway \
  /home/sway/.config \
  /home/sway/.config/sway \
  /home/sway/.config/sway/config \
"

USERADD_PACKAGES = "${PN}"

SYSTEMD_SERVICE:${PN} += "sway.service"
SYSTEMD_AUTO_ENABLE:${PN} = "enable"

USERADD_PARAM:${PN} = "--home /home/sway --shell /bin/sh --user-group -G video,input,render,wayland sway"
GROUPADD_PARAM:${PN} = "-r wayland; -r render"

INSANE_SKIP:${PN} += "file-rdeps"
