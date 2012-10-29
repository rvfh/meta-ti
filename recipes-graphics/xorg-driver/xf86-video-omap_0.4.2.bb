require recipes-graphics/xorg-driver/xorg-driver-video.inc

SUMMARY = "X.Org X server -- TI OMAP integrated graphics chipsets driver"

DESCRIPTION = "Open-source X.org graphics driver for TI OMAP graphics \
Currently relies on a closed-source submodule for EXA acceleration on \
the following chipsets: \
  + OMAP3430 \
  + OMAP3630 \
  + OMAP4430 \
  + OMAP4460 \
  + OMAP5430 \
  + OMAP5432 \
\
NOTE: this driver is work in progress..  you probably don't want to try \
and use it yet.  The API/ABI between driver and kernel, and driver and \
acceleration submodules is not stable yet.  This driver requires the \
omapdrm kernel driver w/ GEM support. \
"

LIC_FILES_CHKSUM = "file://COPYING;md5=10ce5de3b111315ea652a5f74ec0c602"

DEPENDS += "virtual/libx11 drm xf86driproto udev"

SRC_URI = "git://anongit.freedesktop.org/xorg/driver/xf86-video-omap;protocol=git;tag=xf86-video-omap-0.4.2"

SRC_URI += " \
    file://0000-UBUNTU-Add-Headers-for-dev-package.patch;md5=5dcb948bfb8d36eac37f4c975f2e47c0 \
    file://0001-dri2-fix-some-leaks.patch;md5=f193e6d32f31d8fecf9c71f58a7a78b1 \
    file://0002-WIP-dri2video-v5.patch;md5=a4c6bfa84ecff1d29143579fefc44e58 \
    file://0003-WIP-non-multiplanar-dri2video.patch;md5=c78cc0d3f704b7077780900f8862f185 \
    file://0004-dri2-fix-various-leaks.patch;md5=d3dd131d71e10e409f2997b6a07a5852 \
    file://0005-dri2-fix-clipping-with-dri2video.patch;md5=f63c501812a09f860d4b040377774d39 \
    file://0006-Fix-WIP-dri2video-v5.patch;md5=d3dff26dba672e8cefcb5a37122310a1 \
    "

S = "${WORKDIR}/git"
