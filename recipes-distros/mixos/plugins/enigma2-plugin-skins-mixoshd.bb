SUMMARY = "Enigma2 Skin MixOS HD 4"
MAINTAINER = "vali"
SECTION = "base"
PRIORITY = "required"
LICENSE = "proprietary"
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

inherit gitpkgv
SRCREV = "${AUTOREV}"
PV = "4.0+git${SRCPV}"
PKGV = "4.0+git${GITPKGV}"
VER ="4.0"
PR = "r0"

SRC_URI="git://github.com/mixos-support/skin4.git"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/*"

do_install() {
    cp -rp ${S}/usr ${D}/
}