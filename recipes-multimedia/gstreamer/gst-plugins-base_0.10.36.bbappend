
COMPATIBLE_MACHINE = "omap4"

# 2012/09/20: typefind: give less weight to H.263 streams when few blocks are found
SRCREV = "fad32193a79b394c8e7e630b0aa739462a424fa4"

SRC_URI = "git://gitorious.org/gstreamer-omap/gst-plugins-base.git;protocol=git;branch=v0.10.36+ti \
           file://gst-plugins-base-tremor.patch \
           file://configure.ac-fix-subparse-plugin.patch"

S = "${WORKDIR}/git"

do_configure_prepend() {
       git submodule init && git submodule update
       autopoint
}
