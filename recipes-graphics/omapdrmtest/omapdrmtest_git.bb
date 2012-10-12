SUMMARY = "Tool to test OMAP DRM feature."
DESCRIPTION = ""
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://viddec3test.c;md5=f08687f72156c155f0f22272b1741946"

# DEPENDS = "virtual/libx11 linux-omap4 libdrm libdce ffmpeg libavutil libdri2 domx"
DEPENDS = "virtual/libx11 linux-omap4 libdrm libdri2 domx"

inherit autotools pkgconfig

SRCREV = "d3697f8d0d528e44c1a0f7fdf0d12d36f5d433bf"
PR = "r0"
PV = "1.0.4+gitr${SRCPV}"

SRC_URI = "git://gitorious.org/gstreamer-omap/omapdrmtest.git;protocol=git;branch=omx_cam"

SRC_URI += "file://0001-OMX-Cam-add-pthread-to-linker-flags.patch \
           "
S = "${WORKDIR}/git"

EXTRA_OECONF += "--with-kernel-source=${STAGING_DIR_TARGET}/usr/src/kernel"
