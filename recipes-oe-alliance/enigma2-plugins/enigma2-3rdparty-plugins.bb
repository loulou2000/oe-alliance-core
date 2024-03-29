SUMMARY = "3rd Party plugins for Enigma2"
MAINTAINER = "oe-alliance team"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=8e37f34d0e40d32ea2bc90ee812c9131"

inherit gitpkgv deploy

SRCREV = "${AUTOREV}"
PV = "2.1+gitr${SRCPV}"
PKGV = "2.1+gitr${GITPKGV}"
PR = "r10"

SRC_URI="git://github.com/oe-alliance/3rdparty-plugins.git;protocol=git"

EXTRA_OECONF = " \
    BUILD_SYS=${BUILD_SYS} \
    HOST_SYS=${HOST_SYS} \
    STAGING_INCDIR=${STAGING_INCDIR} \
    STAGING_LIBDIR=${STAGING_LIBDIR} \
"

ALLOW_EMPTY_${PN} = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"

S = "${WORKDIR}/git"

THIRDPARTY_PLUGINS = " \
    enigma2-plugin-dvb-sundtek.controlcenter_1.0-20110318-r2_mipsel.ipk \
    enigma2-plugin-extensions-atmolightd_0.7-pre22_all.ipk \
    enigma2-plugin-extensions-autobouquets-e2_201310201900-r2_mips32el.ipk \
    enigma2-plugin-extensions-bildonline_3.1_mips32el.ipk \
    enigma2-plugin-extensions-bluray_1.4rc1_mips32el.ipk \
    enigma2-plugin-extensions-boblight-enigma2_0.8r6_mips32el.ipk \
    enigma2-plugin-extensions-camofs_8.45_all.ipk \
    enigma2-plugin-extensions-chefkoch_1.4_mips32el.ipk \
    enigma2-plugin-extensions-csfd_9_45-20140125_all.ipk \
    enigma2-plugin-extensions-digitalfernsehen_0.9rc3_mips32el.ipk \
    enigma2-plugin-extensions-facebook_1.2rc7_mips32el.ipk \
    enigma2-plugin-extensions-filesearchfs_2.53_all.ipk \
    enigma2-plugin-extensions-focusonline_1.0rc3_mips32el.ipk \
    enigma2-plugin-extensions-gmailreader-oe2.0_1.3_all.ipk \
    enigma2-plugin-extensions-googlenewsreader_1.0_mips32el.ipk \
    enigma2-plugin-extensions-hetweer_2.4_mips32el.ipk \
    enigma2-plugin-extensions-hdmitest_0.4_mipsel.ipk \
    enigma2-plugin-extensions-kicker_3.3rc4_mips32el.ipk \
    enigma2-plugin-extensions-livefootball-oe2.0_4.9_all.ipk \
    enigma2-plugin-extensions-mediainfo_0.6_r04_all.ipk \
    enigma2-plugin-extensions-mediaportal_5.1.3_all.ipk \
    enigma2-plugin-extensions-msnwetter_0.6rc3_mips32el.ipk \
    enigma2-plugin-extensions-mtv_0.1_mips32el.ipk \
    enigma2-plugin-extensions-muzutv_1.1rc4_mips32el.ipk \
    enigma2-plugin-extensions-moviebrowser_3.4rc5_mips32el.ipk \
    enigma2-plugin-extensions-mp3browser_1.8rc5_mips32el.ipk \
    enigma2-plugin-extensions-navibar_1.1.1_all.ipk \
    enigma2-plugin-extensions-opkg-tools_1.3_mipsel.ipk \
    enigma2-plugin-extensions-planerfs_5.27_all.ipk \
    enigma2-plugin-extensions-pluginspanel_1.0_r01_all.ipk \
    enigma2-plugin-extensions-picturecenterfs_5.17_all.ipk \
    enigma2-plugin-extensions-radiode_0.1_mips32el.ipk \
    enigma2-plugin-extensions-radioonline-oe2.0_1.0_all.ipk \
    enigma2-plugin-extensions-screensaver_5.6.9_all.ipk \
    enigma2-plugin-extensions-screengrabber_2.1a_mips32el.ipk \
    enigma2-plugin-extensions-seriesplugin_0.9_mips32el.ipk \
    enigma2-plugin-extensions-sherlock-vuplus_5.01_mipsel.ipk \
    enigma2-plugin-extensions-skyrecorder_1.5.1_all.ipk \
    enigma2-plugin-extensions-songs-to_0.1_mips32el.ipk \
    enigma2-plugin-extensions-spiegelonline_2.5rc8_mips32el.ipk \
    enigma2-plugin-extensions-sportmax_1.2_mips32el.ipk \
    enigma2-plugin-extensions-subtitleplayer_3.28_mips32el.ipk \
    enigma2-plugin-extensions-spinnerselector_2.0r5_mips32el.ipk \
    enigma2-plugin-extensions-sport1ticker_0.4_all.ipk \
    enigma2-plugin-extensions-sportportal_2013_all.ipk \
    enigma2-plugin-extensions-systemtools-for-ppanels_0.83_mipsel.ipk \
    enigma2-plugin-extensions-thetvdb_0.7-20120607-r1_mips32el.ipk \
    enigma2-plugin-extensions-tmdbinfo_1.1-20130929-r0-r1_mips32el.ipk \
    enigma2-plugin-extensions-translator_0.8rc7_mips32el.ipk \
    enigma2-plugin-extensions-transmission_2.76-r13884_mips32el.ipk \
    enigma2-plugin-extensions-tsmedia-oe2.0_4.8_all.ipk \
    enigma2-plugin-extensions-tvspielfilm_6.2rc14_mips32el.ipk \
    enigma2-plugin-extensions-vcs_1.0-rc5_all.ipk \
    enigma2-plugin-extensions-verkehrsinfo_0.7rc1_mips32el.ipk \
    enigma2-plugin-extensions-vuplusforum_0.7rc3_mips32el.ipk \
    enigma2-plugin-extensions-webmedia_10.0_r02_oe2.0_all.ipk \
    enigma2-plugin-extensions-webradiofs_11.77_all.ipk \
    enigma2-plugin-extensions-wikipedia_2.1rc5_mips32el.ipk \
    enigma2-plugin-extensions-xbmcaddons_6.0_r0_all.ipk \
    enigma2-plugin-extensions-xbmcwetter_1.0rc4_mips32el.ipk \
    enigma2-plugin-extensions-yampmusicplayer_2.1.1-2012-09-23_mipsel.ipk \
    enigma2-plugin-systemplugins-bouquetsprotection_0.2-rc1_all.ipk \
    enigma2-plugin-systemplugins-lcnscanner_1.0-r4_mips32el.ipk \
    enigma2-plugin-systemplugins-recordinfobar_1.0-rc15_mipsel.ipk \
    "

#     Install any packages t_append =hat are only For this machines feed here, uncomment the line below and change as required
THIRDPARTY_MACHINE_PLUGINS_vuuno = " \
    enigma2-plugin-extensions-sdg-imagedownloader-v0.6-oe-2.0-vu-all.ipk \
    "
THIRDPARTY_MACHINE_PLUGINS_vuultimo = " \
    enigma2-plugin-extensions-sdg-imagedownloader-v0.6-oe-2.0-vu-all.ipk \
    "
THIRDPARTY_MACHINE_PLUGINS_vusolo = " \
    enigma2-plugin-extensions-sdg-imagedownloader-v0.6-oe-2.0-vu-all.ipk \
    "
THIRDPARTY_MACHINE_PLUGINS_vuduo = " \
    enigma2-plugin-extensions-sdg-imagedownloader-v0.6-oe-2.0-vu-all.ipk \
    "
THIRDPARTY_MACHINE_PLUGINS_vusolo2 = " \
    enigma2-plugin-extensions-sdg-imagedownloader-v0.6-oe-2.0-vu-all.ipk \
    "
THIRDPARTY_MACHINE_PLUGINS_vuduo2 = " \
    enigma2-plugin-extensions-sdg-imagedownloader-v0.6-oe-2.0-vu-all.ipk \
    "
THIRDPARTY_MACHINE_PLUGINS_et4x00 = " \
    enigma2-plugin-extensions-newxtrend-hbbtv_1.7_mips32el.ipk \
    "
THIRDPARTY_MACHINE_PLUGINS_et5x00 = " \
    "
THIRDPARTY_MACHINE_PLUGINS_et6x00 = " \
    enigma2-plugin-extensions-et-webbrowser_2.0.0-r0_et6x00.ipk \
    enigma2-plugin-weblinks-basic_1.3-r0_et6x00.ipk \
    enigma2-plugin-weblinks-games_1.0-r0_et6x00.ipk \
    "
THIRDPARTY_MACHINE_PLUGINS_et8000 = " \
    enigma2-plugin-extensions-newxtrend-hbbtv_1.7_mips32el.ipk \
     "
THIRDPARTY_MACHINE_PLUGINS_et9x00 = " \
    enigma2-plugin-extensions-et-webbrowser_2.0.0-r0_et9x00.ipk \
    enigma2-plugin-weblinks-basic_1.3-r0_et9x00.ipk \
    enigma2-plugin-weblinks-games_1.0-r0_et9x00.ipk \
    "
THIRDPARTY_MACHINE_PLUGINS_et10000 = " \
    enigma2-plugin-extensions-newxtrend-hbbtv_1.7_mips32el.ipk \
     "
THIRDPARTY_MACHINE_PLUGINS_e3hd = " \
    enigma2-plugin-extensions-hbbtv_4.1_E3HD_mips32el.ipk \
    "

do_install() {
}

python populate_packages_prepend () {
    p = ""
    plugins = bb.data.getVar('THIRDPARTY_PLUGINS', d, 1)
    if bb.data.getVar('THIRDPARTY_MACHINE_PLUGINS', d, 1) is not None:
        plugins += bb.data.getVar('THIRDPARTY_MACHINE_PLUGINS', d, 1)
    if bb.data.getVar('THIRDPARTY_EXTRA_PLUGINS', d, 1) is not None:
        plugins += bb.data.getVar('THIRDPARTY_EXTRA_PLUGINS', d, 1)

    if plugins is not None:
        for package in plugins.split():
            p += package.split('_')[0] + " "

    bb.data.setVar('PACKAGES', p, d)
}

do_deploy() {
    rm -rf ${DEPLOY_DIR_IPK}/3rdparty
    rm -rf ${DEPLOY_DIR_IPK}/${MACHINE}_3rdparty
    install -d 0755 ${DEPLOY_DIR_IPK}/3rdparty
    install -d 0755 ${DEPLOY_DIR_IPK}/${MACHINE}_3rdparty
    for i in ${THIRDPARTY_PLUGINS}; do
        if [ -f $i ]; then
            install -m 0644 $i ${DEPLOY_DIR_IPK}/3rdparty;
        fi
    done;
    for i in ${THIRDPARTY_MACHINE_PLUGINS}; do
        if [ -f $i ]; then
            install -m 0644 $i ${DEPLOY_DIR_IPK}/${MACHINE}_3rdparty;
        fi
    done;
    for i in ${THIRDPARTY_EXTRA_PLUGINS}; do
        if [ -f $i ]; then
            install -m 0644 $i ${DEPLOY_DIR_IPK}/3rdparty;
        fi
    done;
    pkgdir=${DEPLOY_DIR_IPK}/3rdparty
    if [ -e $pkgdir ]; then
        chmod 0755 $pkgdir
    fi
    pkgdir=${DEPLOY_DIR_IPK}/${MACHINE}_3rdparty
    if [ -e $pkgdir ]; then
        chmod 0755 $pkgdir
    fi
}

addtask do_deploy before do_package_write after do_package_write_ipk
