#!/bin/bash
#set -e

PROJECT_ROOT=$(cd "$(dirname "$0")/.." && pwd)

mkdir -p $PROJECT_ROOT/build

source $PROJECT_ROOT/layers/poky/oe-init-build-env $PROJECT_ROOT/build/rpi5

bitbake-layers add-layer $PROJECT_ROOT/layers/meta-openembedded/meta-oe
bitbake-layers add-layer $PROJECT_ROOT/layers/meta-openembedded/meta-python
bitbake-layers add-layer $PROJECT_ROOT/layers/meta-openembedded/meta-networking
bitbake-layers add-layer $PROJECT_ROOT/layers/meta-openembedded/meta-multimedia
bitbake-layers add-layer $PROJECT_ROOT/layers/meta-wayland
bitbake-layers add-layer $PROJECT_ROOT/layers/meta-raspberrypi
bitbake-layers add-layer $PROJECT_ROOT/layers/meta-qt6
bitbake-layers add-layer $PROJECT_ROOT/layers/meta-hmi

