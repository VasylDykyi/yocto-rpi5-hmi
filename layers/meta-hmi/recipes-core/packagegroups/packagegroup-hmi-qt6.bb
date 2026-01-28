SUMMARY = "HMI Qt6 packages"

LICENSE = "MIT"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

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