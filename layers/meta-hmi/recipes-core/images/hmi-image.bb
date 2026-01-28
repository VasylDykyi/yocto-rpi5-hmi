SUMMARY = "HMI main image"

require recipes-core/images/core-image-base.bb

IMAGE_FEATURES += "ssh-server-openssh"
IMAGE_FEATURES += "allow-empty-password"
IMAGE_FEATURES += "debug-tweaks"
IMAGE_FEATURES += "tools-debug"

IMAGE_INSTALL += " \
    hmi-system \
    hmi-qt6 \
"

