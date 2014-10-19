SUMMARY = "WiFi devices based on Ralink 802.11n USB chipsets."
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

RRECOMMENDS_${PN} = " \
    kernel-module-rt2800usb \
    firmware-rt2870 \
    "

PV = "1.0"
PR = "r2"

ALLOW_EMPTY_${PN} = "1"
