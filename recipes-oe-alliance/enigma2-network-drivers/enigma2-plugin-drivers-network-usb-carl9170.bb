SUMMARY = "WiFi devices for Atheros AR9170 devices."
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

RRECOMMENDS_${PN} = " \
    kernel-module-carl9170 \
    firmware-carl9170 \
    "

PV = "1.0"
PR = "r2"

ALLOW_EMPTY_${PN} = "1"
