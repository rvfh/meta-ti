DESCRIPTION = "X11 image + Rob Clark's DRM tests for OMAP"

require recipes-graphics/images/core-image-x11.bb

CORE_IMAGE_EXTRA_INSTALL += "\
    gst-meta-video \
    gst-meta-audio \
    gst-plugin-ducati-ducati \
    gst-plugins-bad-dri2 \
    ti-firmware-ipu-dce \
    omapdrmtest \
    omap4-sgx-modules \
    omap4-sgx-libs \
    xf86-video-omap-pvr \
    "
