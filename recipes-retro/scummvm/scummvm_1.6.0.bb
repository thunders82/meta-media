DESCRIPTION = "Virtual Machine for several classic graphical point-and-click adventure games"
HOMEPAGE = "http://www.scummvm.org"
SECTION = "games"
PRIORITY = "optional"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=32538efa0d3ded3b9f85c716db7e0f8b"

inherit autotools

#SRC_URI = "${SOURCEFORGE_MIRROR}/scummvm/scummvm-1.6.0.tar.bz2 "

SRC_URI = "${SOURCEFORGE_MIRROR}/scummvm/scummvm-${PV}.tar.bz2 "
#           file://scummvm.desktop \
#           file://no-strip.patch \
#"

DEPENDS = "directfb virtual/libsdl libvorbis libogg zlib \
           ${@base_conditional('ENTERPRISE_DISTRO', '1', '', 'libmad mpeg2dec', d)}"

EXTRA_OECONF = " \
  --host=${HOST_SYS} \
  --backend=sdl \
  --with-sdl-prefix=${STAGING_BINDIR_CROSS} \
  --prefix=${prefix} \
  --with-ogg-prefix=${STAGING_LIBDIR}/.. \
  --with-vorbis-prefix=${STAGING_LIBDIR}/.. \
  --disable-alsa \
  --enable-plugins \
  --default-dynamic \
  --enable-all-engines \
"

EXTRA_OEMAKE = "MANDIR=${mandir}"

do_configure() {
	${S}/configure ${EXTRA_OECONF}
}

#SRC_URI[md5sum] = "d71d1df5c8262556fedbe885972fbf6e"
#SRC_URI[sha256sum] = "81831cd878a8daad2976f65c92139a2102233082c7d2770579d7e425b19cea2e"

SRC_URI[md5sum] = "473c151ff44e3db7b603ecacd800a0d2"
SRC_URI[sha256sum] = "396060da6a8f391438055c292a280048d29dc408c5b615db43256a86f0e57ec4"
  
