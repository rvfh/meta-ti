require recipes-graphics/xorg-xserver/xserver-xorg.inc

# Misc build failure for master HEAD
SRC_URI += "file://crosscompile.patch \
            file://fix_open_max_preprocessor_error.patch \
           "

SRC_URI[md5sum] = "f87d830aa69885275e26dd6327d76a44"
SRC_URI[sha256sum] = "8ac07c35306ba3fb3c0972722dd4e919303039eca1d40ac7862560e0b2c94cf7"

PR = "r0"
