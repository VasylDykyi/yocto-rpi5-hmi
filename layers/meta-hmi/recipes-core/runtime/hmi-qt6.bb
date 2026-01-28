SUMMARY = "HMI Qt6 runtime package set"

LICENSE = "MIT"

PACKAGE_ARCH = "${MACHINE_ARCH}"

ALLOW_EMPTY:${PN} = "1"

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