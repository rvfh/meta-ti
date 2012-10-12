DESCRIPTION = "GStreamer plugins for omap4 using libdce"
HOMEPAGE = "http://gitorious.org/gstreamer-omap/gst-ducati"
SECTION = "multimedia"
LICENSE = "TI"

COMPATIBLE_MACHINE = "omap4"

require recipes-multimedia/gstreamer/gst-plugins.inc

PR = "r1"
PV = "gitr${SRCPV}"

# 2012/09/25: ducatividenc: log extended error info, and use the correct one from _process
SRCREV = "9f29c17f8dcbd8cf59c8ad3b00d87534b6fc4579"

SRC_URI = "git://gitorious.org/gstreamer-omap/gst-ducati.git;protocol=git"

LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

S = "${WORKDIR}/git"

DEPENDS = "gstreamer gst-plugins-base gst-plugins-bad libdrm libdce"

inherit autotools gettext pkgconfig

do_configure_prepend() {
       git submodule init && git submodule update
       autopoint -f
}
