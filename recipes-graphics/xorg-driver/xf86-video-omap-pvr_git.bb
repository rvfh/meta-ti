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

LIC_FILES_CHKSUM = "file://README;md5=9bdcd356ac0f2410538105621c5bc0b6"

DEPENDS += "xf86-video-omap omap4-sgx-libs"

SRCREV = "680db4dd468d7d1ff1c63a3bbca09b383826a55f"
PR = "r0"
PV = "1.9.0.7.1-1glp3+gitr${SRCPV}"

SRC_URI = "git://gerrit.ext.ti.com:29418/glp/xf86-video-omap-pvr.git;protocol=ssh;branch=harv/poky"

S = "${WORKDIR}/git"

EXTRA_OECONF = " \
    --with-omap-driver-dir=${STAGING_DIR_TARGET}${includedir} \
    --with-pvr-ddk-dir=${STAGING_DIR_TARGET}${includedir}/ddk_src_dir/eurasia \
    --with-sgx-core=540 \
    --with-sgx-rev=120 \
    "
