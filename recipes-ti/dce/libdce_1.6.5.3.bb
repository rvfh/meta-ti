require libdce.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=483f94bdaf5d31cd94aa2317f9ad2684"

PV = "1.6.5.3+gitr${SRCPV}"

# 2012/09/19: add wayland support
SRCREV = "f8ceaa494055a5a35753e721c4bc62182bd56dd3"

SRC_URI = "git://gitorious.org/gstreamer-omap/libdce.git;protocol=git"

S = "${WORKDIR}/git"
