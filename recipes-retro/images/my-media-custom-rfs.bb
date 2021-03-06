DESCRIPTION = "MY-MEDIA image RFS customization"
 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
DEPENDS = "libsdl scummvm"

PR = "r0"

SRC_URI = " \
 file://fb.modes \
 file://asoundrc \
"

#SRC_URI_append_utilite = "file://boot_utilite_ssd.scr "

do_install () {
install -d ${D}/etc/
install -d ${D}/home/
install -d ${D}/home/root/
install -m 0644 ${WORKDIR}/fb.modes ${D}/etc/
install -m 0644 ${WORKDIR}/asoundrc ${D}/home/root/.asoundrc
}

FILES_${PN} += "/home/root " 
