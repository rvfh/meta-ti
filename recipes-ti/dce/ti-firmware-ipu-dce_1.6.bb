DESCRIPTION = "TI Ducati Multimedia Firmware"
HOMEPAGE = "https://launchpad.net/~tiomap-dev"
SECTION = "firmware"
LICENSE = "TI"

COMPATIBLE_MACHINE = "omap4"

PV = "1.6+120829+191835+git53cf578"

SRC_URI = "https://github.com/downloads/ebutera/ti-firmwares/ti-firmware-ipu-dce_${PV}.tar.gz"

SRC_URI[md5sum] = "1e9c4b5ffc14f2f9d82d3f53287495f0"
SRC_URI[sha256sum] = "11b89f74a3e8d19b6a22f1f652c8334a9604c0b8f3980d9814430d43b4e58ed7"

LIC_FILES_CHKSUM = "file://ti-firmware-ipu-dce.license.txt;md5=bd402733d2669054ce3d16d450b6121a"

# TODO: add debug firmware
FILES_${PN} = "/lib/firmware/*"

do_compile() {
        :
}

do_install() {
        install -d  ${D}/lib/firmware/
        cp ti-firmware-ipu-dce.xem3 ${D}/lib/firmware/ducati-m3-core0.xem3
}
