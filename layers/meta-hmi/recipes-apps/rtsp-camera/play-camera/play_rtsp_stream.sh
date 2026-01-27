#!/bin/bash

sleep 2

USER_ID=$(id -u sway)

export XDG_RUNTIME_DIR=/run/user/$USER_ID
export WAYLAND_DISPLAY=wayland-1
export SWAYSOCK=/run/user/$USER_ID/sway-ipc.$USER_ID.$(pgrep -x sway).sock

while true; do
  gst-launch-1.0 rtspsrc location=rtsp://192.168.88.133/stream0 protocols=udp latency=0 \
               ! rtph265depay \
               ! h265parse \
               ! avdec_h265 \
               ! queue max-size-buffers=2 leaky=downstream \
               ! videoconvert \
               ! waylandsink sync=false
  sleep 2
done
