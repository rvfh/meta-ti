FILESEXTRAPATHS_prepend := "${THISDIR}/xserver-xorg-1.11.4:"

SRC_URI += "file://0001-add-dri2video.patch"

PR = "${INC_PR}.1"
