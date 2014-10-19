SUMMARY = "Merge machine and distro options to create a enigma2 machine task/package"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "1.0"
PR = "r15"

INITSCRIPT_NAME = "swap"
INITSCRIPT_PARAMS = "start 60 S ."

inherit update-rc.d

inherit packagegroup

DEPENDS = "enigma2-pliplugins opensif-feeds"

RRECOMMENDS_${PN} = "\
    cifs \
    hddtemp \
    ntfs-3g \
    ntfsprogs \
    dosfstools \
    opensif-libemu \
    python-compression \
    python-terminal \
    python-textutils \
    enigma2-plugin-systemplugins-videomode \
    enigma2-plugin-extensions-autotimer \
    enigma2-plugin-extensions-audiosync \
    enigma2-plugin-extensions-epgsearch \
    enigma2-plugin-extensions-imdb \
    enigma2-plugin-systemplugins-crossepg \
    enigma2-plugin-extensions-lcnscanner \
    enigma2-plugin-extensions-openairplay \
    enigma2-plugin-extensions-graphmultiepg \
    enigma2-plugin-systemplugins-skinselector \
    enigma2-plugin-extensions-lcnscanner \
    enigma2-plugin-systemplugins-videoenhancement \
    \
    ${@base_contains("MACHINE_FEATURES", "3dtv", "enigma2-plugin-systemplugins-osd3dsetup" , "", d)} \
    ${@base_contains("MACHINE", "inihdx", "enigma2-plugin-systemplugins-inifansetup" , "", d)} \
    ${@base_contains("MACHINE", "inihdx", "enigma2-plugin-systemplugins-inivfd" , "", d)} \
    "

SRC_URI = "file://swap file://panel.conf"
FILES_${PN} = "${sysconfdir} ${datadir}"

do_install_append() {
    install -d ${D}/${sysconfdir}/init.d
    install -d ${D}/${datadir}/enigma2/defaults/

    echo "${MACHINE}" > ${D}/${sysconfdir}/machine
    echo "${DISTRO_CODENAME}" > ${D}/${sysconfdir}/branch

    install -m 0755 ${WORKDIR}/swap ${D}/${sysconfdir}/init.d/
    install -m 0644 ${WORKDIR}/panel.conf ${D}/${datadir}/enigma2/defaults/
}
