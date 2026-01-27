# RPI5 HMI Yocto Project

Yocto-based Linux distribution for Raspberry Pi 5 with Qt 6.
Can be used to create HMI devices.

## Quick start

```bash
sudo apt-get update
sudo apt-get upgrade -y
```

Clone the repositorie:
```bash
git clone https://github.com/VasylDykyi/yocto-rpi5-hmi.git
cd yocto-rpi5-hmi
git submodule update --init --recursive
```

Initialize environment:
```bash
cd scripts
source init-env.sh
```

Prepare local.conf(from build/rpi5):
```bash
echo 'MACHINE ??= "raspberrypi5"' > conf/local.conf
echo 'DISTRO = "hmi"' >> conf/local.conf
```

Specify num threads(Optional):
```bash
echo 'BB_NUMBER_THREADS = "20"' >> conf/local.conf
```

Build image(from build/rpi5):
```bash
bitbake hmi-image
```
