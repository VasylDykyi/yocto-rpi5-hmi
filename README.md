# Raspberry Pi 5 HMI – Yocto Linux (Qt 6)

Yocto-based Linux distribution for Raspberry Pi 5 with Qt 6.
Can be used to create HMI devices.

## Features

- **Target platform**
  - Raspberry Pi 5 (aarch64)
  - Yocto Project (Scarthgap-compatible)
  - Custom `hmi` distro

- **Graphics & UI**
  - Qt 6 (QtBase, QtDeclarative, QtWayland)
  - Wayland compositor: **sway**
  - EGLFS support (early boot / splash / fallback UI)
  - Qt WebEngine support (Chromium-based)

- **Multimedia**
  - GStreamer 1.0 (base / good / bad / ugly / libav)
  - Video codecs: x264, x265
  - V4L2 utilities

- **System**
  - systemd
  - Custom systemd services
  - Automatic rootfs resize on first boot
  - Dedicated HMI user

- **Development & Debug**
  - Cross-compilation SDK with Qt 6
  - gdb / gdbserver support
  - QtCreator and VS Code (CMake-based) workflows
  - Native and target debugging

- **Build & Deployment**
  - RPM-based package management (dnf)
  - Custom Yocto layers
  - Custom runtime bundles (non-allarch)
  - SDK generation (`meta-toolchain-qt6-hmi`)
  - WIC images for SD / SSD boot

- **Host support**
  - Ubuntu Linux
  - Windows WSL2


## Quick start

### For Ubuntu host or WSL:
Install dependencies:
```bash
sudo apt update
sudo apt upgrade -y

sudo apt install -y \
  gawk wget git diffstat unzip texinfo gcc build-essential \
  chrpath socat cpio python3 python3-pip python3-pexpect \
  xz-utils debianutils iputils-ping \
  python3-git python3-jinja2 python3-subunit \
  zstd file locales \
  rpm dnf liblz4-tool \
  curl rsync bc \
  bison flex libssl-dev libelf-dev libncurses-dev lz4 pigz \
  dosfstools mtools parted util-linux e2fsprogs bmap-tools \
  ninja-build cmake clang lld llvm nodejs npm \
  libdbus-1-dev libglib2.0-dev \
  help2man groff man-db \
  libdrm-dev libgbm-dev wayland-protocols \
  xterm sudo \
  ccache distcc
```

Setup locale:
```bash
sudo locale-gen en_US.UTF-8
export LANG=en_US.UTF-8
```

Clone the repository:
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

Rewrite local.conf(from build/rpi5):
```bash
echo 'MACHINE ??= "raspberrypi5"' > conf/local.conf
echo 'DISTRO = "hmi"' >> conf/local.conf
```

Specify the number of parallel tasks (optional, example for 8–16 core host):
```bash
echo 'BB_NUMBER_THREADS = "10"' >> conf/local.conf
```

Specify the number of parallel compilation threads(optional):
```bash
echo 'PARALLEL_MAKE = "-j 16"' >> conf/local.conf
```

Build image(from build/rpi5):
```bash
bitbake hmi-image
```

Build SDK(from build/rpi5):
```bash
bitbake meta-toolchain-qt6-hmi
```