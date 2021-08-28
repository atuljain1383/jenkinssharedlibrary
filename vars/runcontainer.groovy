def call(Map params){  
    sshagent(["${params.server}"]) {
      sh "docker run -it --name "${params.containername}" -p "${params.hostport}":"${params.containerport}" --network=Bridge "${params.imagename}""
    }
}
