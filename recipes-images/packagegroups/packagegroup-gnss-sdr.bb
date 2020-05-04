# packagegroup definitions to help the GNSS-SDR community build images
# they like.

LICENSE = "MIT"

inherit packagegroup

PACKAGES = " \
    packagegroup-gnss-sdr-base \
    packagegroup-gnss-sdr-bin \
    packagegroup-gnss-sdr-drivers \
    packagegroup-gnss-sdr-extradevel \
    packagegroup-gnss-sdr-qt5 \
"

PROVIDES = "${PACKAGES}"

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
DEPENDS_packagegroup-gnss-sdr-bin = " \
    gnss-sdr \
"

SUMMARY_packagegroup-gnss-sdr-drivers = "RF front-end drivers."
DEPENDS_packagegroup-gnss-sdr-drivers = " \
    uhd \
    rtl-sdr \
    libhackrf \
    gr-osmosdr \
    gr-iio \
    iio-oscilloscope \
"

SUMMARY_packagegroup-gnss-sdr-extradevel = "Extra utilities."
DEPENDS_packagegroup-gnss-sdr-extradevel = " \
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

SUMMARY_packagegroup-gnss-sdr-qt5 = "QT5 development."
DEPENDS_packagegroup-gnss-sdr-qt5 = " \
    qtbase \     
    qtbase-fonts \     
    qtbase-plugins \     
    qtbase-tools \     
    qtbase-examples \     
    qtdeclarative \     
    qtdeclarative-plugins \     
    qtdeclarative-tools \     
    qtdeclarative-examples \     
    qtdeclarative-qmlplugins \     
    qtmultimedia \     
    qtmultimedia-plugins \     
    qtmultimedia-examples \     
    qtmultimedia-qmlplugins \     
    qtsvg \     
    qtsvg-plugins \     
    qtsensors \     
    qtimageformats-plugins \     
    qtsystems \     
    qtsystems-tools \     
    qtsystems-examples \     
    qtsystems-qmlplugins \     
    qtscript \     
    qt3d \     
    qt3d-examples \     
    qt3d-qmlplugins \     
    qt3d-tools \     
    qtwebkit \     
    qtwebkit-examples-examples \     
    qtwebkit-qmlplugins \     
    qtgraphicaleffects-qmlplugins \     
    qtconnectivity-qmlplugins \     
    qtlocation-plugins \     
    qtlocation-qmlplugins \     
    cinematicexperience \
"

