FROM freifeld/java:9.0.4
LABEL Maintainer="Royi Freifeld"

ENV RELEASE 2018-03-09_2209
ENV VERSION 18.0.0.1

ENV INSTALL_DIR /opt
ENV OPENLIBERTY_HOME ${INSTALL_DIR}/openliberty-${VERSION}

RUN mkdir -p ${OPENLIBERTY_HOME} \
    && wget -O ${OPENLIBERTY_HOME}/openliberty-${VERSION}.zip https://public.dhe.ibm.com/ibmdl/export/pub/software/openliberty/runtime/release/${RELEASE}/openliberty-${VERSION}.zip
RUN yum install -y unzip \
    && unzip -q ${OPENLIBERTY_HOME}/openliberty-${VERSION}.zip -d ${OPENLIBERTY_HOME} \
    && rm ${OPENLIBERTY_HOME}/openliberty-${VERSION}.zip

#ENV CONFIG ${OPENLIBERTY_HOME}/wlp/usr/servers/defaultServer/
#ENV DEPLOYMENT_DIR ${CONFIG}/dropins/

#EXPOSE 9080 9443

#ENTRYPOINT ${OPENLIBERTY_HOME}/wlp/bin/server run defaultServer