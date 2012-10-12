DESCRIPTION = "TI Ducati IVA-HD hardware codec acceleration API"
HOMEPAGE = "http://gitorious.org/ubuntu-omap/dce"
SECTION = "multimedia"
LICENSE = "TI"

COMPATIBLE_MACHINE = "omap4"

inherit autotools

DEPENDS = "virtual/libx11 libdrm libdri2"
RDEPENDS = "ti-firmware-ipu-dce"
