DESCRIPTION = "TI PVR Support libs, built from source"
HOMEPAGE = "https://launchpad.net/~tiomap-dev"
SECTION = "x11"
LICENSE = "specific"
LIC_FILES_CHKSUM = "file://eurasia/eurasiacon/build/linux2/omap4430_linux/components.mk;md5=c2330cb6fbc7e7e50fa73339e6310302"

COMPATIBLE_MACHINE = "omap4"

DEPENDS = "virtual/libx11"

SRCREV = "74a28844620b42f31ca75b0437c533b705fd7772"
PR = "r0"
PV = "1.9.0.7.1-1glp3+gitr${SRCPV}"

SRC_URI = "git://gerrit.ext.ti.com/ubuntu/img-ddk-linux-xorg.git;protocol=ssh;branch=harv/poky"

S = "${WORKDIR}/git"
B = "${WORKDIR}/git/eurasia/eurasiacon/build/linux2/omap4430_linux"

EXTRA_OEMAKE = "\
    DISCIMAGE=${D} \
    CROSS_COMPILE=${TARGET_PREFIX} \
    AR=ar \
    CC=gcc \
    CXX=g++ \
    LD=ld \
    V=1 \
    "

FILES_${PN} = "/usr"

do_install() {
    oe_runmake install
    ln -s ${S} ${STAGING_DIR_TARGET}${includedir}/ddk_src_dir
}

# Shut up the QA
do_package_qa() {
    :
}
