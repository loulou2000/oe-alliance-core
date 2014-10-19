SUMMARY = "SMSC75XX USB 2.0 Gigabit Ethernet Devices"
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

RRECOMMENDS_${PN} = " \
    kernel-module-usbnet \
    kernel-module-smsc75xx \
    "

PV = "1.0"
PR = "r3"

ALLOW_EMPTY_${PN} = "1"
