def call(Map params){
  withEnv(["${params.hostipwithuser}"]) {
    sshagent(["${params.server}"]) {
      sh "docker run -d --name "${params.containername}" -p "${params.hostport}":"${params.containerport}" --network=Bridge "${params.imagename}""
    }
  }
}
