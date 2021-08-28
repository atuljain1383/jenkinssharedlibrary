def call(Map params){
  sshagent(["${params.server}"]) {
    sh "docker run -d --name "${params.containername}" -p "${params.hostport}":"${params.containerport}" --network=Bridge "${params.imagename}""
  }
}
