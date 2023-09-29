FROM l.gcr.io/google/bazel:latest

WORKDIR  /src/workspace

COPY bin .

RUN bazel clean

RUN bazel run //src/main:BazelApp

CMD [""]
