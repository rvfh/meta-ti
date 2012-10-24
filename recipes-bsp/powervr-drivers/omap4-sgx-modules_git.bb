DESCRIPTION = "TI PVR kernel module"
HOMEPAGE = "https://launchpad.net/~tiomap-dev"
SECTION = "x11"
LICENSE = "specific"
LIC_FILES_CHKSUM = "file://../../../../GPL-COPYING;md5=60422928ba677faaa13d6ab5f5baaa1e"

COMPATIBLE_MACHINE = "omap4"

inherit module

DEPENDS = "linux-omap4"

SRCREV = "upstream/1.9.0.7.1.1"
PR = "r0"
PV = "1.9.0.7.1.1+gitr${SRCPV}"

SRC_URI = "git://gitorious.org/ubuntu-omap/pvr-omap4-dkms.git;protocol=git;branch=upstream"

S = "${WORKDIR}/git/sgx/eurasiacon/build/linux2/omap4430_linux"

EXTRA_OEMAKE = "\
    DISCIMAGE=${STAGING_DIR_TARGET} \
    KERNELDIR=${STAGING_KERNEL_DIR} \
    SUPPORT_V4L2_GFX=0 \
    KBUILD_CFLAGS_MODULE="-DMODULE -Wno-error" \
    "

do_install() {
    install -d ${D}/lib/modules/${KERNEL_VERSION}/kernel/extra/powervr/
    install -c ${WORKDIR}/git/sgx/eurasiacon/binary2_omap4430_linux_release/target/omapdrm_pvr.ko ${D}/lib/modules/${KERNEL_VERSION}/kernel/extra/powervr/
}
