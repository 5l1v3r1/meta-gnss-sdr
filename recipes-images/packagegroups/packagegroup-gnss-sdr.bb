# packagegroup definitions to help the GNSS-SDR community build images
# they like.

LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
    packagegroup-gnss-sdr-base \
    packagegroup-gnss-sdr-bin \
    packagegroup-gnss-sdr-drivers \
    packagegroup-gnss-sdr-extradevel \
"

PROVIDES = "${PACKAGES}"

#    to launch gnuradio-companion (3.7) is still missing the python-pygtk lib)
SUMMARY_packagegroup-gnss-sdr-base = "Required packages."
RDEPENDS_packagegroup-gnss-sdr-base = " \
    gnuradio \
    gflags \
    glog \
    armadillo \
    gtest \
    gnutls \
    log4cpp \
    hdf5 \
    devmem2 \
    matio \
    uhd \
    python3-mako \
    python3-six \
    python-pyqt5 \
    python-pyqt \
    python-txws \
    python-pyephem \
    liberation-fonts \
    python-pygobject \    
    pugixml \
    protobuf \
    rtl-sdr \
    libpcap \
    gr-osmosdr \
    gr-iio \
    gnuplot \
    gpstk \
    gnss-simulator \
"

SUMMARY_packagegroup-gnss-sdr-bin = "GNSS-SDR binary."
RDEPENDS_packagegroup-gnss-sdr-bin = " \
    gnss-sdr \
"

SUMMARY_packagegroup-gnss-sdr-drivers = "RF front-end drivers."
RDEPENDS_packagegroup-gnss-sdr-drivers = " \
    uhd \
    rtl-sdr \
    libhackrf \
    gr-osmosdr \
    gr-iio \
    iio-oscilloscope \
    ezdma \
"

SUMMARY_packagegroup-gnss-sdr-extradevel = "Extra utilities."
RDEPENDS_packagegroup-gnss-sdr-extradevel = " \
    nano \
    gedit \
    htop \
    git \
    wget \
    gdb \
    gqrx \
    xinput-calibrator \
    xserver-xorg-extension-glx \
    directfb-examples \
    wpa-supplicant \
    hostapd \
    dnsmasq \
    lighttpd \
    lighttpd-module-cgi \
    libuio \
"

