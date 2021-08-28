def call(Map params){  
    sshagent(["${params.server}"]) {
      sh "sudo docker run -d -p "${params.hostport}":"${params.containerport}" --network=Bridge --name "${params.containername}" "${params.imagename}""
    }
}
