def call(Map params){  
    sshagent(["${params.server}"]) {
      sh "sudo docker run -d -p "${params.hostport}":"${params.containerport}" --network=Bridge --name "${params.containername}" "${params.imagename}""
        sudo docker run -d -p 8787:8787 --name samplename user/laatste

    }
}
