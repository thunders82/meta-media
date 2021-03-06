include recipes-stef/images/xbmc-image.bb

IMAGE_FEATURES += "debug-tweaks"

###DISTRO_FEATURES_remove += "bluez4"
PREFERRED_PROVIDER = "bluez5"

# SOC_EXTRA_IMAGE_FEATURES ?= "tools-testapps"
SOC_EXTRA_IMAGE_FEATURES=""

# Add extra image features
#EXTRA_IMAGE_FEATURES += " \
#    ${SOC_EXTRA_IMAGE_FEATURES} \
#    nfs-server \
#    tools-debug \
#    tools-profile \
#"

IMAGE_INSTALL += " \
    libsdl \
    scummvm \
    python-imaging \
    python-pyudev \
    my-media-custom-rfs \
"
#    xbmc \
#    procps \
#    util-linux-mount \
#    libntfs-3g \
#    ntfsprogs \
#    ntfs-3g \
#    ntp \
#    ntp-utils \
#    tvheadend \
#    util-linux \
#    firmware-imx-vpu-imx6d \
#    fsl-rc-local \
#    xbmc-image-custom-rfs \
#    packagegroup-core-sdk \
#    joe \
#"

export IMAGE_BASENAME = "my-media-image"

