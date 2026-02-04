SUMMARY = "Minimal symbols font for wvkbd"
DESCRIPTION = "DejaVu Sans font providing keyboard glyphs for wvkbd"
LICENSE = "OFL-1.1"
LIC_FILES_CHKSUM = "file://DejaVuSans.ttf;md5=eccb7a74720fc377b60d6b2110530fd9"

SRC_URI = "file://DejaVuSans.ttf"

S = "${WORKDIR}"

inherit allarch fontcache

do_install() {
    install -d ${D}${datadir}/fonts/truetype
    install -m 0644 ${WORKDIR}/DejaVuSans.ttf \
        ${D}${datadir}/fonts/truetype/
}

FILES:${PN} += "${datadir}/fonts"
