def call(Map params){
  withEnv(["ubuntu@13.233.133.253"]) {
    sshagent(["${params.server}"]) {
      sh "docker run -d --name "${params.containername}" -p "${params.hostport}":"${params.containerport}" --network=Bridge "${params.imagename}""
    }
  }
}
