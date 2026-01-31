SUMMARY = "HMI Qt6 packages"

LICENSE = "MIT"

PACKAGE_ARCH = "${TUNE_PKGARCH}"

inherit packagegroup

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

RDEPENDS:${PN} = " \
    qtbase \
    qtdeclarative \
    qtwayland \
    qtserialbus \
    qtserialbus-tools \
    qtserialport \
    qt5compat \
    qtwebsockets \
    qtmqtt \
    qttranslations \
    qtvirtualkeyboard \
    qttranslations-qtbase \
    qttranslations-qtdeclarative \
    qtwebchannel \
    qtwebengine \
    qtwebview \
"