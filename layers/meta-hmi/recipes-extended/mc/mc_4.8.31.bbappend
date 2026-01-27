FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "\
  file://.profile \
  file://.bashrc \
"

do_install:append() {
    install -d ${D}/root
    install -m 0755 ${WORKDIR}/.profile \
        ${D}/root/.profile

    install -d ${D}/root
    install -m 0755 ${WORKDIR}/.bashrc \
        ${D}/root/.bashrc
}

FILES:${PN} += "\
  /root \
  /root/.profile \
  /root/.bashrc \
"
