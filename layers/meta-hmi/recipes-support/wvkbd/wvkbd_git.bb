SUMMARY = "Wayland virtual keyboard (wvkbd fork by jjsullivan5196)"
DESCRIPTION = "On-screen keyboard client for Wayland compositors"
HOMEPAGE = "https://github.com/jjsullivan5196/wvkbd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

# Git source
SRC_URI = "git://github.com/jjsullivan5196/wvkbd.git;protocol=https;branch=master"
SRC_URI += "file://0001-deskintl-use-symbols-font.patch"
SRCREV = "9fb1964f5daf617feb26eaa4f8b96e402777d3be"

S = "${WORKDIR}/git"

inherit pkgconfig

EXTRA_OEMAKE += "LAYOUT=deskintl"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 wvkbd-deskintl ${D}${bindir}/wvkbd-deskintl
}

# Build dependencies
DEPENDS = " \
    wayland \
    wayland-protocols \
    wayland-native \
    libxkbcommon \
    cairo \
    pango \
    scdoc-native \
"

# Runtime dependencies
RDEPENDS:${PN} = " \
    wayland \
    libxkbcommon \
"

# Install location
FILES:${PN} += " \
    /usr/bin \
"

