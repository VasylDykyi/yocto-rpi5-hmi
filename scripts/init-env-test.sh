#!/bin/bash
set -e

echo $(pwd)

ROOT=$(cd "$(dirname "$0")/.." && pwd)

echo $ROOT
#source $ROOT/layers/poky/oe-init-build-env $ROOT/build/rpi5

#bitbake-layers add-layer $ROOT/layers/meta-openembedded/meta-oe
#bitbake-layers add-layer $ROOT/layers/meta-openembedded/meta-python
#bitbake-layers add-layer $ROOT/layers/meta-openembedded/meta-networking
#bitbake-layers add-layer $ROOT/layers/meta-wayland
#bitbake-layers add-layer $ROOT/layers/meta-raspberrypi
#bitbake-layers add-layer $ROOT/layers/meta-qt6
#bitbake-layers add-layer $ROOT/layers/meta-charge-station
