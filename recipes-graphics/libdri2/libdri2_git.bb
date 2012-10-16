SUMMARY = "Library for the DRI2 extension to the X Window System."
DESCRIPTION = ""
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=827da9afab1f727f2a66574629e0f39c"

DEPENDS = "libdrm virtual/libx11"

inherit autotools pkgconfig

SRCREV = "4f1eef3183df2b270c3d5cbef07343ee5127a6a4"
PR = "r0"
PV = "1.0.3+gitr${SRCPV}"

SRC_URI = "git://github.com/robclark/libdri2.git;protocol=git"

SRC_URI += "\
    file://0001-dri2video-support.patch \
    file://0002-fix-typo.patch \
    file://0003-Fix-potential-NPE-if-user-doesn-t-register-display.patch \
    file://0004-Add-multi-planar-support.patch \
    "

S = "${WORKDIR}/git"
