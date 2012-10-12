
COMPATIBLE_MACHINE = "omap4"

SRCREV = "2096b1022ad513f90639aa7a04445a2da8bc5363"

SRC_URI = "git://gitorious.org/gstreamer-omap/gstreamer.git;protocol=git;branch=v0.10.36+ti"

S = "${WORKDIR}/git"

do_configure_prepend() {
       git submodule init && git submodule update
       autopoint
}
