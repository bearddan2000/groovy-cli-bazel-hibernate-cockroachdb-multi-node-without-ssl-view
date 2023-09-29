load("@io_bazel_rules_groovy//groovy:groovy.bzl", "groovy_binary")

groovy_binary (
    name = "BazelApp",
    srcs = glob(["groovy/**/*.groovy"]),
    main_class = "example.Main",
    deps = [
      "@maven//:com_google_guava_guava",
"@maven//:org_postgresql_postgresql",
"@maven//:org_hibernate_hibernate_core",
"@maven//:jakarta_xml_bind_jakarta_xml_bind_api",
"@maven//:org_glassfish_jaxb_jaxb_runtime",
"@maven//:log4j_log4j",
"@maven//:org_slf4j_slf4j_api",
"@maven//:org_slf4j_slf4j_log4j12"
    ],
    resources = ["resources/log4j.xml"],
    visibility = ["//visibility:public"],
)
