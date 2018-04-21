FROM freifeld/openliberty-base:18.0.0.1

ENV APP_NAME CQRSWriter

RUN ${OPENLIBERTY_HOME}/wlp/bin/server create ${APP_NAME}

ENV CONFIG ${OPENLIBERTY_HOME}/wlp/usr/servers/${APP_NAME}
ENV DEPLOYMENT_DIR ${CONFIG}/dropins/

EXPOSE 9080 9443

ENTRYPOINT ${OPENLIBERTY_HOME}/wlp/bin/server run ${APP_NAME}

COPY ./src/main/config/server.xml ${CONFIG}
COPY ./target/CQRSWriter.war ${DEPLOYMENT_DIR}
