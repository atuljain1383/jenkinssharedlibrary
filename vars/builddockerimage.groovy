def call(Map params) {
  sh "sudo docker build -t ${params.imagename} ."
}
