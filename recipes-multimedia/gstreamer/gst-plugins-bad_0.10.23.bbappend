COMPATIBLE_MACHINE = "omap4"

# 2012/09/26: pvrvideosink: Limit size to 1080p as it is a hardware limitation
SRCREV = "3eb68bf5bcd79d490e35d29f262a0a9d84da36ff"

DEPENDS = "libdri2"

SRC_URI = "git://gitorious.org/gstreamer-omap/gst-plugins-bad.git;protocol=git;branch=v0.10.23+ti"

S = "${WORKDIR}/git"

# TODO: add pvr drivers to enable the pvr plugin
EXTRA_OECONF += " --disable-pvr"

do_configure_prepend() {
       git submodule init && git submodule update
       autopoint -f
}
