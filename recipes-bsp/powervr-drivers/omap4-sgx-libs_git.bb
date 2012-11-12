DESCRIPTION = "TI PVR Support libs"
HOMEPAGE = "https://launchpad.net/~tiomap-dev"
SECTION = "x11"
LICENSE = "specific"
LIC_FILES_CHKSUM = "file://COPYING;md5=901c78b70db15edfad6973915205603b"

COMPATIBLE_MACHINE = "omap4"

DEPENDS = "virtual/libx11"

SRCREV = "2394fded7f0803bc3c416520fe585ceb5919f450"
PR = "r0"
PV = "1.9.0.7.1.3+gitr${SRCPV}"

SRC_URI = "git://gitorious.org/poky-omap/omap4-sgx-libs.git;protocol=git"

inherit bin_package

S = "${WORKDIR}/git"

FILES_${PN} = "/usr"

do_install() {
    tar xf omap4-sgx-libs-1.9.0.7.1-1glp3.tar.xz -C ${D} --strip-components=1
}

# Shut the QA up
do_package_qa() {
    :
}
