require recipes-graphics/xorg-driver/xorg-driver-video.inc

SUMMARY = "X.Org X server -- TI OMAP integrated graphics chipsets driver"

DESCRIPTION = "Closed-source X.org graphics driver for EXA acceleration on \
TI OMAP chipsets below: \
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

LIC_FILES_CHKSUM = "file://COPYING;md5=901c78b70db15edfad6973915205603b"

DEPENDS += "xf86-video-omap omap4-sgx-libs"

SRCREV = "e146523c911f82bb1fd0839bdcb9b06cc1c16d89"
PR = "r0"
PV = "1.9.0.7.1-1glp3+gitr${SRCPV}"

SRC_URI = "git://gitorious.org/poky-omap/xf86-video-omap-pvr.git;protocol=git"

inherit bin_package

S = "${WORKDIR}/git"

FILES_${PN} = "/usr"

do_install() {
    tar xf xf86-video-omap-pvr-2_1.9.0.7.1-1glp3.tar.xz -C ${D} --strip-components=1
}
