# RPI5 HMI Yocto Project

Yocto-based Linux distribution for Raspberry Pi 5 with Qt 6.

## Quick start

```bash
git submodule update --init --recursive
source scripts/init-env.sh
bitbake charge-station-image
