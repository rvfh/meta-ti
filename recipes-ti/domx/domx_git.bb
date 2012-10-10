SUMMARY = "TI OMX message builder library."
DESCRIPTION = "These libraries allow for the standard OMX APIs to be exposed to \
application while 'doing the right thing' to talk to the underlying kernel and \
beyond firmware."
LICENSE = "proprietary-binary"
LIC_FILES_CHKSUM = "file://libdomx.pc.in;md5=30f87157a3b139d354104a72276170e7"

DEPENDS = "linux-omap4 libdrm"

inherit autotools pkgconfig

SRCREV = "2.2"
PR = "r0"
PV = "2.2+gitr${SRCPV}"

SRC_URI = "git://gitorious.org/gstreamer-omap/domx.git;protocol=git"

S = "${WORKDIR}/git"

EXTRA_OECONF += "--with-kernel-source=${STAGING_DIR_TARGET}/usr/src/kernel/"

# Force plugins into their own package, so they don't end up in the -dev one
PACKAGES =+ "${PN}-plugins"
FILES_${PN}-plugins = " ${libdir}/libOMX.TI.*.so*"

RDEPENDS_${PN} += "${PN}-plugins"
