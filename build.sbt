val root = project
  .in(file("."))
  .enablePlugins(JavaAppPackaging)
  .enablePlugins(DockerPlugin)
