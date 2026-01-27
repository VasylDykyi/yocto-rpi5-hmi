SUMMARY = "HMI Qt6 packages"

inherit packagegroup

PACKAGE_ARCH = "${MACHINE_ARCH}"

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