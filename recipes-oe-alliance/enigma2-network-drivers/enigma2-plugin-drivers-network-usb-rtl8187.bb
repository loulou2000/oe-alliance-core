SUMMARY = "WiFi devices for Realtek 802.11a/bg chipsets."
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

RRECOMMENDS_${PN} = " \
    kernel-module-rtl8187 \
    "

PV = "1.0"
PR = "r2"

ALLOW_EMPTY_${PN} = "1"
