FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
  file://.profile \
  file://.bashrc \
  file://ini \
"

RDEPENDS:${PN} = "nano"

do_install:append() {
    install -d ${D}/root
    install -m 0755 ${WORKDIR}/.profile \
        ${D}/root/.profile

    install -d ${D}/root
    install -m 0755 ${WORKDIR}/.bashrc \
        ${D}/root/.bashrc

    install -d ${D}/root/.config/mc
    install -m 0755 ${WORKDIR}/ini \
        ${D}/root/.config/mc/ini
}

FILES:${PN} += "\
  /root \
  /root/.profile \
  /root/.bashrc \
  /root/.config \
  /root/.config/mc \
  /root/.config/mc/ini \
"
